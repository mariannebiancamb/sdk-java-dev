package com.mercadopago.example.apis.order;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.order.OrderClient;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.resources.order.OrderRefund;

import java.util.HashMap;
import java.util.Map;

public class RefundTotal {
    public static void main(String[] args) {
        MercadoPagoConfig.setAccessToken("{{ACCESS_TOKEN}}");
        String orderId = "{{order_id}}";

        OrderClient client = new OrderClient();

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Idempotency-Key", "{{idempotency_key}}");

        MPRequestOptions requestOptions = MPRequestOptions.builder()
                .customHeaders(headers)
                .build();

        try {
           OrderRefund order = client.refund(orderId, requestOptions);
            System.out.println("Order successfully refunded.");
            System.out.println("Status: " + order.getStatus());
            System.out.println("Status Detail: " + order.getStatus_detail());
        } catch (Exception e) {
            System.out.println("Error while refunding order: " + e.getMessage());
        }
    }
}
