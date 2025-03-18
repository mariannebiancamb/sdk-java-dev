package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

/** Order ConfigRequest class. */
@Getter
@Builder
public class OrderConfigRequest {

    private OrderPaymentMethodConfig paymentMethod;

    private OrderOnlineConfig online;
}
