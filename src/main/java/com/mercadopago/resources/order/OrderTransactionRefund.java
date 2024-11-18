package com.mercadopago.resources.order;

import lombok.Getter;

import java.util.List;


@Getter
public class OrderTransactionRefund {

        /** Refunds information. */
        private List<OrderRefundItem> refunds;
}
