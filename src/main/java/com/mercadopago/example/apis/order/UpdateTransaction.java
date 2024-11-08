package com.mercadopago.example.apis.order;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.order.OrderClient;
import com.mercadopago.client.order.OrderPaymentRequest;
import com.mercadopago.client.order.OrderTransactionRequest;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.net.MPResponse;
import com.mercadopago.resources.order.OrderTransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateTransaction {

    public static void main(String[] args) {
        MercadoPagoConfig.setAccessToken("");

        String orderId = "";
        String transactionId = "";

        OrderClient client = new OrderClient();

        OrderPaymentRequest paymentRequest = OrderPaymentRequest.builder()
                .amount("980.00")
                .build();

        List<OrderPaymentRequest> payments = new ArrayList<>();
        payments.add(paymentRequest);

        OrderTransactionRequest transactionRequest = OrderTransactionRequest.builder()
                .payments(payments)
                .build();

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Sandbox", "true");
        headers.put("X-Idempotency-Key", "1234568753");
        headers.put("X-Caller-SiteID", "MLB");

        MPRequestOptions requestOptions = MPRequestOptions.builder()
                .customHeaders(headers)
                .build();

        try {
            OrderTransaction updatedTransaction = client.updateTransaction(orderId, transactionId, transactionRequest, requestOptions);
            System.out.println("Updated transaction ID: " + updatedTransaction.getResponse());
        } catch (Exception e) {
            System.out.println("Error updating order transaction: " + e.getMessage());
            e.printStackTrace();
        }
    }
}