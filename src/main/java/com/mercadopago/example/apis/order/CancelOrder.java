package com.mercadopago.example.apis.order;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.order.OrderClient;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.order.Order;

import java.util.HashMap;
import java.util.Map;

public class CancelOrder {

    public static void main(String[] args) {
        MercadoPagoConfig.setAccessToken("{{ACCESS_TOKEN");

        OrderClient client = new OrderClient();

        Map<String, String> headers =  new HashMap<>();
        headers.put("X-Idempotency-Key", "{{Idempotency_Key}}");

        MPRequestOptions requestOptions = MPRequestOptions.builder()
                .customHeaders(headers)
                .build();

        try {
            Order order = client.cancel("ORD01JPQW0DVWZR8FDR9DTY26AFHG", requestOptions);
            System.out.println("Canceled order: " + order.getId());
            System.out.println("Status: " + order.getStatus());
        } catch (MPException | MPApiException e) {
            System.out.println("Error canceling order: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }

    }

}
