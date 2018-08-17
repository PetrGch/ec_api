package com.currency_exchange.repository;

import com.currency_exchange.model.CurrencyRate;
import com.currency_exchange.model.ExchangeCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by petr on 16.06.18.
 */

@Repository
public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {}
