package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

/** Order OrderOnlineConfig class. */
@Getter
@Builder
public class OrderOnlineConfig {

    private String callbackUrl;

    private String successUrl;

    private String pendingUrl;

    private String failureUrl;

    private String autoReturnUrl;

    private OrderDifferentialPricing differentialPricing;
}
