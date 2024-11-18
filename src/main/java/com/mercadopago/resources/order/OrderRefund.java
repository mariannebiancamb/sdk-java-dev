package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

@Getter
public class OrderRefund extends MPResource {

    private String id;
    private String status;
    private String status_detail;

    private OrderTransactionRefund transactions;
}
