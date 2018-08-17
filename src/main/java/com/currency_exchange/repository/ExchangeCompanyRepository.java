package com.currency_exchange.repository;

import com.currency_exchange.model.ExchangeCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by petr on 16.06.18.
 */

@Repository
public interface ExchangeCompanyRepository extends JpaRepository<ExchangeCompany, Long> {

  List<ExchangeCompany> findAll();
  Optional<ExchangeCompany> findById(Long exchangeCompanyId);
  Optional<ExchangeCompany> findByUniqueId(String exchangeCompanyUniqueId);
  Optional<ExchangeCompany> findByName(Long exchangeCompanyName);

  Boolean existsByUniqueId(String exchangeCompanyUniqueId);
  Boolean existsByName(String exchangeCompanyName);


}
