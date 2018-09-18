package com.currency_exchange.service;

import com.currency_exchange.controller.ExchangeCompanyController;
import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.model.*;
import com.currency_exchange.payload.companyReqRes.requestPayload.CompanyRequest;
import com.currency_exchange.payload.companyReqRes.requestPayload.WorkingTimeRequest;
import com.currency_exchange.repository.ExchangeCompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Component
public class ExchangeCompanyService {

  Logger logger = LoggerFactory.getLogger(ExchangeCompanyController.class);

  @Autowired
  private ExchangeCompanyRepository exchangeCompanyRepository;

  public ExchangeCompany createExchangeCompany(CompanyRequest companyRequest) throws ParseException {
    ExchangeCompany exchangeCompany = new ExchangeCompany();

    this.setExchangeCompanyMainInfo(exchangeCompany, companyRequest);
    this.setWorkingTime(exchangeCompany, companyRequest.getWorkingTime());
    this.setExchangeCompanyDetail(exchangeCompany, companyRequest);
    this.setExchangeCompanyParseData(exchangeCompany, companyRequest);
    this.setEchangeCompanyComments(exchangeCompany, companyRequest);
    this.setExchangeCompanyExRate(exchangeCompany, companyRequest);

    return exchangeCompany;
  }

  public ExchangeCompany  updateExchangeCompany(Long exchangeCompanyId, CompanyRequest companyRequest) throws ParseException {
    ExchangeCompany exchangeCompany = exchangeCompanyRepository.findById(exchangeCompanyId)
        .orElseThrow(() -> new ResourceNotFoundException("exchangeCompany", "id", exchangeCompanyId));

    if (exchangeCompany != null) {
      this.setExchangeCompanyMainInfo(exchangeCompany, companyRequest);
      this.setWorkingTime(exchangeCompany, companyRequest.getWorkingTime());
      this.setExchangeCompanyDetail(exchangeCompany, companyRequest);
      this.setExchangeCompanyParseData(exchangeCompany, companyRequest);
      this.updateAllEchangeCompanyComments(exchangeCompany, companyRequest);
      this.updateAllExchangeCompanyExRate(exchangeCompany, companyRequest);
    }

    return exchangeCompany;
  }

  private void setExchangeCompanyMainInfo(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    exchangeCompany.setName(companyRequest.getName());
    exchangeCompany.setCoordinateX(companyRequest.getCoordinateX());
    exchangeCompany.setCoordinateY(companyRequest.getCoordinateY());
    exchangeCompany.setAddress(companyRequest.getAddress());
    exchangeCompany.setRating(companyRequest.getRating());
  }

  private void setExchangeCompanyDetail(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getExchangeCompanyDetail() != null) {
      exchangeCompany.setExchangeCompanyDetail(new ExchangeCompanyDetail(
          companyRequest.getExchangeCompanyDetail().getPhone(),
          companyRequest.getExchangeCompanyDetail().getWebsite(),
          companyRequest.getExchangeCompanyDetail().getEmail()
      ));
    }
  }

  private void setExchangeCompanyParseData(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getExchangeCompanyParseData() != null) {
      exchangeCompany.setExchangeCompanyParseData(new ExchangeCompanyParseData(
          companyRequest.getExchangeCompanyParseData().getUrl(),
          companyRequest.getExchangeCompanyParseData().getParameters(),
          companyRequest.getExchangeCompanyParseData().getRowSelector(),
          companyRequest.getExchangeCompanyParseData().getCurrencyAmountSelector(),
          companyRequest.getExchangeCompanyParseData().getCurrencyTypeSelector(),
          companyRequest.getExchangeCompanyParseData().getBuySelector(),
          companyRequest.getExchangeCompanyParseData().getSellSelector(),
          companyRequest.getExchangeCompanyParseData().isActive()
      ));
    }
  }

  private void setEchangeCompanyComments(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getComments() != null && !companyRequest.getComments().isEmpty()) {
      exchangeCompany.addAllComent(companyRequest.getComments());
    }
  }

  private void updateAllEchangeCompanyComments(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getComments() != null && !companyRequest.getComments().isEmpty()) {
      exchangeCompany.getComments().stream().forEach(comment -> {
        companyRequest.getComments().stream().forEach(requestComment -> {
          if (comment.getId().equals(requestComment.getId())) {
            comment.setName(requestComment.getName());
            comment.setTitle(requestComment.getTitle());
            comment.setText(requestComment.getText());
            comment.setDislike(requestComment.isDislike());
            comment.setLiked(requestComment.isLiked());
          }
        });
      });
    }
  }

  private void setExchangeCompanyExRate(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getCurrencyRates() != null && !companyRequest.getCurrencyRates().isEmpty()) {
      exchangeCompany.addAllExRate(companyRequest.getCurrencyRates());
    }
  }

  private void updateAllExchangeCompanyExRate(ExchangeCompany exchangeCompany, CompanyRequest companyRequest) {
    if (companyRequest.getCurrencyRates() != null && !companyRequest.getCurrencyRates().isEmpty()) {
      exchangeCompany.getCurrencyRates().stream().forEach(currencyRate -> {
        companyRequest.getCurrencyRates().stream().forEach(requestCurrencyRate -> {
          if (currencyRate.getId().equals(requestCurrencyRate.getId())) {
            currencyRate.setCurrencyName(requestCurrencyRate.getCurrencyName());
            currencyRate.setCurrencyType(requestCurrencyRate.getCurrencyType());
            currencyRate.setBuyPrice(requestCurrencyRate.getBuyPrice());
            currencyRate.setSellPrice(requestCurrencyRate.getSellPrice());
          }
        });
      });
    }
  }

  private void setWorkingTime(ExchangeCompany exchangeCompany, WorkingTimeRequest workingTime) throws ParseException {
    WorkingTime wt = new WorkingTime();

    wt.setMnFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getMnFrom()));
    wt.setMnTo(new SimpleDateFormat("HH:mm").parse(workingTime.getMnTo()));

    wt.setTuFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getTuFrom()));
    wt.setTuTo(new SimpleDateFormat("HH:mm").parse(workingTime.getTuTo()));

    wt.setWeFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getWeFrom()));
    wt.setWeTo(new SimpleDateFormat("HH:mm").parse(workingTime.getWeTo()));

    wt.setThFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getThFrom()));
    wt.setThTo(new SimpleDateFormat("HH:mm").parse(workingTime.getThTo()));

    wt.setFrFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getFrFrom()));
    wt.setFrTo(new SimpleDateFormat("HH:mm").parse(workingTime.getFrTo()));

    if (workingTime.getStFrom() != null && workingTime.getStTo() != null) {
      wt.setStFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getStFrom()));
      wt.setStTo(new SimpleDateFormat("HH:mm").parse(workingTime.getStTo()));
    } else {
      wt.setStFrom(null);
      wt.setStTo(null);
    }

    if (workingTime.getSnFrom() != null && workingTime.getSnTo() != null) {
      wt.setSnFrom(new SimpleDateFormat("HH:mm").parse(workingTime.getSnFrom()));
      wt.setSnTo(new SimpleDateFormat("HH:mm").parse(workingTime.getSnTo()));
    } else {
      wt.setSnFrom(null);
      wt.setSnTo(null);
    }

    exchangeCompany.setWorkingTime(wt);
  }
}
