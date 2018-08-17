package com.currency_exchange.controller;

import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.model.ExchangeCompanyParseData;
import com.currency_exchange.payload.ApiResponse;
import com.currency_exchange.payload.companyReqRes.requestPayload.CompanyParseDataRequest;
import com.currency_exchange.repository.ExchangeCompanyRepository;
import com.currency_exchange.service.CompanyParserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parser")
public class CompanyParserController {

  Logger logger = LoggerFactory.getLogger(CompanyParserController.class);

  @Autowired
  private ExchangeCompanyRepository exchangeCompanyRepository;

  @Autowired
  private CompanyParserService companyParserService;

  @PutMapping()
  public ResponseEntity<?> updateCompanyParser(
      @RequestParam(value = "companyId", required = true) Long exchangeCompanyId,
      @RequestBody CompanyParseDataRequest companyParseDataRequest
  ) {

    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyId)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyId));

    if (exchangeCompany != null) {
      try {
        companyParserService.updateCompanyParserInfo(
            exchangeCompany,
            companyParseDataRequest);

        exchangeCompanyRepository.save(exchangeCompany);
        return ResponseEntity.ok(new ApiResponse(true, "Company parser info updated successfully"));
      } catch (ResourceNotFoundException ex) {
        logger.error("Problems with updateCompanyParser controller");
      }
    }

    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during update process"));
  }

  @GetMapping("/checkParser")
  public String checkParserResult(@RequestParam(value = "companyId", required = true) Long exchangeCompanyId) {

    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyId)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyId));

    return exchangeCompany.getExchangeCompanyParseData().toString();

  }

}
