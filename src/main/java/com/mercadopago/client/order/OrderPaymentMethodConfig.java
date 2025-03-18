package com.mercadopago.client.order;

import com.mercadopago.net.MPResource;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/** OrderPaymentMethodConfig class. */
@Builder
@Getter
public class OrderPaymentMethodConfig {

    private List<String> notAllowedIds;

    private List<String> notAllowedTypes;

    private String defaultId;

    private int maxInstallments;

    private int defaultInstallments;
}
