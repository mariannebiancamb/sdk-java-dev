package com.mercadopago.resources.order;

import lombok.Getter;

// API version: 1ff4822a-2dfd-4393-800e-a562edb3fe32

/** OrderPayment class. */
@Getter
public class OrderPayment {

    /** Payment amount. */
    private String amount;

    /** Payment method information. */
    private OrderPaymentMethod paymentMethod;

    /** Payment ID. */
    private String id;

    /** Reference ID. */
    private String referenceId;

    /** Payment status. */
    private String status;

    /** Payment status detail. */
    private String statusDetail;

    /** Payment date of expiration. */
    private String dateOfExpiration;
}
