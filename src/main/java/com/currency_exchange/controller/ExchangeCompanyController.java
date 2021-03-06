package com.currency_exchange.controller;

import com.currency_exchange.payload.exCompanyReqRes.ExchangeCompanyResponse;
import com.currency_exchange.service.ExchangeCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exCompany")
public class ExchangeCompanyController {

  @Autowired
  ExchangeCompanyService exchangeCompanyService;

  @GetMapping()
  public List<ExchangeCompanyResponse> getAllCompanies() {
    return exchangeCompanyService.getAllCompany();
  }

  @GetMapping("/{id}")
  public ExchangeCompanyResponse getCompanyById(@PathVariable(value = "id") Long id) {
    return exchangeCompanyService.getCompanyById(id);
  }

}
