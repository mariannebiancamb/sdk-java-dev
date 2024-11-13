package com.mercadopago.client.order;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
/** OrderRefundRequest class. */
public class OrderRefundPaymentRequest {

    /** Payment ID. */
    private String id;

    /** Refund amount. */
    private String amount;

}



