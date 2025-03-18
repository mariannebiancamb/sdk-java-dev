package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

/** OrderAutomaticPaymentsRequest class. */
@Getter
@Builder
public class OrderAutomaticPaymentsRequest {
    /** Automatic Payment profile id. */
    private String paymentProfileId;

    /** Automatic Payment Retries. */
    private int retries;

    /** Automatic Payment schedule date. */
    private String scheduleDate;

    /** Automatic Payment due date. */
    private String dueDate;
}
