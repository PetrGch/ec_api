package com.currency_exchange.repository;

import com.currency_exchange.model.Comment;
import com.currency_exchange.model.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by petr on 16.06.18.
 */

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {}
