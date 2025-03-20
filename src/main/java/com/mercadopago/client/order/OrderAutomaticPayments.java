package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

// API version: 1ff4822a-2dfd-4393-800e-a562edb3fe32

/** OrderAutomaticPaymentsRequest class. */
@Getter
@Builder
public class OrderAutomaticPayments {

  /** payment profile id. */
  private String payment_profile_id;

  /** retries. */
  private String retries;

  /** schedule date. */
  private String scheduleDate;

  /** due date. */
  private String dueDate;
}
