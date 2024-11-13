package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

/** OrderRefundPartialRequest class. */
public class OrderRefundRequest {

        /** Payment ID. */
        private String paymentId;

        /** Refund amount. */
        private String amount;
}



