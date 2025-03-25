package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

import java.util.List;

// API version: 1ff4822a-2dfd-4393-800e-a562edb3fe32

/** OrderTransaction class. */
@Getter
public class OrderTransaction extends MPResource{

    /** Payments information. */
    private List<OrderPayment> payments;

    /** Refunds information. */
    private List<OrderRefund> refunds;
}
