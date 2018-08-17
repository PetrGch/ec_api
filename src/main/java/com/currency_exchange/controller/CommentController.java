package com.currency_exchange.controller;

import com.currency_exchange.exception.ResourceNotFoundException;
import com.currency_exchange.payload.ApiResponse;
import com.currency_exchange.repository.CommentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/commentary")
public class CommentController {

  Logger logger = LoggerFactory.getLogger(CommentController.class);

  @Autowired
  private CommentRepository commentRepository;

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteCommentary(
      @PathVariable(value = "id") Long commentaryId
  ) {

    try {
      commentRepository.deleteById(commentaryId);

      return ResponseEntity.ok(new ApiResponse(true, "Commentary was deleted successfully"));
    } catch (ResourceNotFoundException ex) {
      logger.error("Problems with deleteCommentary controller");
    }

    return ResponseEntity.badRequest().body(new ApiResponse(false, "There were some problems during deleted process"));
  }

}
