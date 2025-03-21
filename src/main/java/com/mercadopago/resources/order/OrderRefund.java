package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

// API version: 1ff4822a-2dfd-4393-800e-a562edb3fe32

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
    private String statusDetail;

    /** Object Order Transaction Refund. */
    private OrderTransactionRefund transactions;
}
