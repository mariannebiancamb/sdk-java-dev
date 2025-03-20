package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

// API version: b950ae02-4f49-4686-9ad3-7929b21b6495

/**
 * OrderRefund class.
 */
@Getter
public class OrderRefund extends MPResource {

    /** Refund id. */
    private String id;

    /** Transaction id. */
    private String transactionId;

    /** Reference id. */
    private String referenceId;

    /** Amount Refund. */
    private String amount;

    /** Refund status. */
    private String status;

    /** Refund status detail. */
    private String status_detail;

    /** Object Order Transaction Refund. */
    private OrderTransactionRefund transactions;
}
