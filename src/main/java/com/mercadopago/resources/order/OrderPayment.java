package com.mercadopago.resources.order;

import lombok.Getter;

/* API version: 54cea3ac-c258-4a6f-aea9-988e641cff30 */

/** OrderPayment class. */
@Getter
public class OrderPayment {

    /** Payment ID. */
    private String id;

    /** Reference ID. */
    private String referenceId;

    /** Payment status. */
    private String status;

    /** Payment amount. */
    private String amount;

    /** Payment method information. */
    private OrderPaymentMethod paymentMethod;
}
