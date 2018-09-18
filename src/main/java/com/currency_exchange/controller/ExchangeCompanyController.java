package com.currency_exchange.controller;

import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.model.WorkingTime;
import com.currency_exchange.payload.ApiResponse;
import com.currency_exchange.payload.companyReqRes.requestPayload.CompanyRequest;
import com.currency_exchange.payload.companyReqRes.responsePayload.CompanyResponse;
import com.currency_exchange.repository.ExchangeCompanyRepository;
import com.currency_exchange.service.ExchangeCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by petr on 16.06.18.
 */

@RestController
@RequestMapping("/api/company")
public class ExchangeCompanyController {

  Logger logger = LoggerFactory.getLogger(ExchangeCompanyController.class);

  @Autowired
  private ExchangeCompanyRepository exchangeCompanyRepository;

  @Autowired
  private ExchangeCompanyService exchangeCompanyService;

  @GetMapping()
  private List<CompanyResponse> getAllCompanies() {

    try {
      List<ExchangeCompany> exchangeCompanies = exchangeCompanyRepository.findAll();

      if (exchangeCompanies != null && !exchangeCompanies.isEmpty()) {
        List<CompanyResponse> companies = new ArrayList<>();
        exchangeCompanies.stream().forEach((c) -> {
          CompanyResponse companyResponse = null;
          try {
            companyResponse = new CompanyResponse(c);
          } catch (ParseException e) {
            e.printStackTrace();
          }
          companyResponse.setId(c.getId());
          companies.add(companyResponse);
        });

        return companies;
      }
    } catch (ResourceNotFoundException ex) {
      logger.error("Problems with getAllCompanies method", ex);
    }

    return Collections.emptyList();
  }

  @PostMapping()
  private ResponseEntity<?> createExchangeCompany(@RequestBody CompanyRequest companyRequest) throws ParseException {
    ExchangeCompany exchangeCompany = exchangeCompanyService.createExchangeCompany(companyRequest);

    try {
      exchangeCompanyRepository.save(exchangeCompany);

      return ResponseEntity.ok(new ApiResponse(true, "ExchangeCompany created successfully"));
    } catch (ResourceNotFoundException ex) {
      logger.error("Problems with createExchangeCompany method");
    }

    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during create process"));
  }

  @GetMapping("/{id}")
  private CompanyResponse getCompanyById(@PathVariable(value = "id") Long exchangeCompanyId) throws ParseException {

    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyId)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyId));
    CompanyResponse companyResponse = new CompanyResponse(exchangeCompany);

    return companyResponse;
  }

  @PutMapping("/{id}")
  private ResponseEntity<?> updateExchangeCompany(
      @PathVariable(value = "id") Long exchangeCompanyId,
      @RequestBody CompanyRequest companyRequest
  ) throws ParseException {

    ExchangeCompany exchangeCompany = exchangeCompanyService.updateExchangeCompany(exchangeCompanyId, companyRequest);

    try {
      exchangeCompanyRepository.save(exchangeCompany);

      return ResponseEntity.ok(new ApiResponse(true, "ExchangeCompany updated successfully"));
    } catch (ResourceNotFoundException ex) {
      logger.error("Problems with updateExchangeCompany method");
    }


    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during update process"));
  }

  @DeleteMapping("/{id}")
  private ResponseEntity<?> deleteExchangeCompany(@PathVariable(value = "id") Long exchangeCompanyid) {

    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyid)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyid));


    if (exchangeCompany != null) {
      exchangeCompanyRepository.delete(exchangeCompany);

      return ResponseEntity.ok(new ApiResponse(true, "ExchangeCompany was deleted successfully"));
    }

    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during delete process"));
  }

}
