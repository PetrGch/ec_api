package com.currency_exchange.controller;

import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.payload.ApiResponse;
import com.currency_exchange.payload.companyReqRes.requestPayload.CurrencyRateRequest;
import com.currency_exchange.repository.ExchangeCompanyRepository;
import com.currency_exchange.service.CurrencyRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyRateController {

  Logger logger = LoggerFactory.getLogger(CurrencyRateController.class);

  @Autowired
  private ExchangeCompanyRepository exchangeCompanyRepository;

  @Autowired
  private CurrencyRateService currencyRateService;

  @PutMapping()
  public ResponseEntity<?> updateCurrencyRate(
      @RequestParam(value = "companyId", required = true) Long exchangeCompanyId,
      @RequestBody List<CurrencyRateRequest> currencyRateRequests
  ) {

    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyId)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyId));

    if (exchangeCompany != null) {
      try {
        currencyRateService.updateCurrencyRate(
            exchangeCompany,
            currencyRateRequests);

        exchangeCompanyRepository.save(exchangeCompany);
        return ResponseEntity.ok(new ApiResponse(true, "Currency tate updated successfully"));
      } catch (ResourceNotFoundException ex) {
        logger.error("Problems with updateCurrencyRate controller");
      }
    }

    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during update process"));
  }

}
