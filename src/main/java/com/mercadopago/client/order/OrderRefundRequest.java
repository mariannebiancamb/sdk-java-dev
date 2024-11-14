package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Builder
@Getter
/** OrderRefundRequest class. */
public class OrderRefundRequest {

        private List<OrderRefundPaymentRequest> transactions;

}

