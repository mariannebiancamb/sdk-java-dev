package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

import java.util.List;

/* API version: 54cea3ac-c258-4a6f-aea9-988e641cff30 */

/** OrderTransaction class. */
@Getter
public class OrderTransaction extends MPResource{

    /** Payments information. */
    private List<OrderPayment> payments;

    /** Refunds information. */
    private List<OrderRefund> refunds;
}
