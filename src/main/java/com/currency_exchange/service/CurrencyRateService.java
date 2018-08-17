package com.currency_exchange.service;

import com.currency_exchange.controller.ExchangeCompanyController;
import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.model.CurrencyRate;
import com.currency_exchange.model.CurrencyType;
import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.payload.companyReqRes.requestPayload.CurrencyRateRequest;
import com.currency_exchange.repository.CurrencyRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyRateService {

  Logger logger = LoggerFactory.getLogger(CurrencyRateService.class);

  @Autowired
  private CurrencyRateRepository currencyRateRepository;

  public void updateCurrencyRate(
      ExchangeCompany exchangeCompany,
      List<CurrencyRateRequest> currencyRateRequests
  ) {

    List<CurrencyRate> currencyRatesForDelete = new ArrayList<>();
    List<CurrencyRate> currencyRatesForCreate = new ArrayList<>();
    List<CurrencyType> updatedCurrencyType = new ArrayList<>();

    for (CurrencyRateRequest currencyInReq : currencyRateRequests) {
      for (CurrencyRate currency : exchangeCompany.getCurrencyRates()) {

        if (currency.getCurrencyType().equals(currencyInReq.getCurrencyType())
            && !updatedCurrencyType.contains(currency.getCurrencyType())) {

          currency.setCurrencyName(currencyInReq.getCurrencyName());
          currency.setCurrencyType(currencyInReq.getCurrencyType());
          currency.setBuyPrice(currencyInReq.getBuyPrice());
          currency.setSellPrice(currencyInReq.getSellPrice());

          updatedCurrencyType.add(currency.getCurrencyType());
        }
      }
    }

    for (CurrencyRate currencyRate : exchangeCompany.getCurrencyRates()) {
      if (!updatedCurrencyType.contains(currencyRate.getCurrencyType())) {
        currencyRatesForDelete.add(currencyRate);
      }
    }

    for (CurrencyRateRequest currencyInReq : currencyRateRequests) {
      if (!updatedCurrencyType.contains(currencyInReq.getCurrencyType())) {
        currencyRatesForCreate.add(new CurrencyRate(
            currencyInReq.getCurrencyName(),
            currencyInReq.getCurrencyType(),
            currencyInReq.getBuyPrice(),
            currencyInReq.getSellPrice()
        ));
      }
    }

    if (!currencyRatesForCreate.isEmpty()) {
      exchangeCompany.addAllExRate(currencyRatesForCreate);
    }

    if (!currencyRatesForDelete.isEmpty()) {
      exchangeCompany.removeAllExRate(currencyRatesForDelete);
      try {
        currencyRateRepository.deleteAll(currencyRatesForDelete);
      } catch (ResourceNotFoundException ex) {
        logger.error("Problems with updateCurrencyRate method");
      }
    }
  }

}
