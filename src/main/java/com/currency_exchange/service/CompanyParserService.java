package com.currency_exchange.service;

import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.model.ExchangeCompanyParseData;
import com.currency_exchange.payload.companyReqRes.requestPayload.CompanyParseDataRequest;
import org.springframework.stereotype.Component;

@Component
public class CompanyParserService {

  public void updateCompanyParserInfo(
      ExchangeCompany exchangeCompany,
      CompanyParseDataRequest companyParseDataRequest
  ) {

    if (exchangeCompany.getExchangeCompanyParseData() == null) {
      exchangeCompany.setExchangeCompanyParseData(new ExchangeCompanyParseData());
    }

    exchangeCompany.getExchangeCompanyParseData().setUrl(companyParseDataRequest.getUrl());
    exchangeCompany.getExchangeCompanyParseData().setParameters(companyParseDataRequest.getParameters());
    exchangeCompany.getExchangeCompanyParseData().setCurrencyTypeSelector(companyParseDataRequest.getCurrencyTypeSelector());
    exchangeCompany.getExchangeCompanyParseData().setCurrencyAmountSelector(companyParseDataRequest.getCurrencyAmountSelector());
    exchangeCompany.getExchangeCompanyParseData().setRowSelector(companyParseDataRequest.getRowSelector());
    exchangeCompany.getExchangeCompanyParseData().setBuySelector(companyParseDataRequest.getBuySelector());
    exchangeCompany.getExchangeCompanyParseData().setSellSelector(companyParseDataRequest.getSellSelector());
    exchangeCompany.getExchangeCompanyParseData().setActive(companyParseDataRequest.isActive());

  }

}
