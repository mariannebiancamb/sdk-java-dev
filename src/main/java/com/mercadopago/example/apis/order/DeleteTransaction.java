package com.mercadopago.example.apis.order;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.order.OrderClient;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.net.MPResponse;
import com.mercadopago.resources.order.Order;
import com.mercadopago.resources.order.OrderTransaction;

import java.util.HashMap;
import java.util.Map;

public class DeleteTransaction {

    public static void main(String[] args) {
        MercadoPagoConfig.setAccessToken("{{ACCESS_TOKEN}}");
        String orderId = "{{OrderId}}";
        String transactionId = "{{TransactionId}}";

        OrderClient client = new OrderClient();

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Sandbox", "true");
        headers.put("X-Idempotency-Key", "123456");
        headers.put("X-Caller-SiteID", "MLB");

        MPRequestOptions requestOptions = MPRequestOptions.builder()
                .customHeaders(headers)
                .build();

        try{
            MPResponse response = client.deleteTransaction(orderId, transactionId, requestOptions).getResponse();
            System.out.println("Order transaction created: " + response.getContent());
        } catch (Exception e) {
            System.out.println("Error creating order transaction: " + e.getMessage());
        }

    }
}