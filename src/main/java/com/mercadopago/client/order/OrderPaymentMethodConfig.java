package com.mercadopago.client.order;

import com.mercadopago.net.MPResource;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
// API version: 1ff4822a-2dfd-4393-800e-a562edb3fe32
/** OrderPaymentMethodConfig class. */
@Builder
@Getter
public class OrderPaymentMethodConfig {

    private List<String> notAllowedIds;

    private List<String> notAllowedTypes;

    private String defaultId;

    private Integer maxInstallments;

    private Integer defaultInstallments;
}
