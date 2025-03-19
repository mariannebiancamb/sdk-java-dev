package com.mercadopago.example.apis.order;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.order.*;
import com.mercadopago.core.MPRequestOptions;
import com.mercadopago.resources.order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaptureOrder {

    public static void main(String[] args) {
        MercadoPagoConfig.setAccessToken("{{ACCESS_TOKEN}}");

        System.out.println("Initializing OrderClient...");
        OrderClient client = new OrderClient();

        System.out.println("Creating OrderPaymentRequest...");
        OrderPaymentRequest payment = OrderPaymentRequest.builder()
                .amount("1000.00")
                .paymentMethod(OrderPaymentMethodRequest.builder()
                        .id("master")
                        .type("credit_card")
                        .token("2a6a062fb27b728ae8b031f1961a0ea5")
                        .installments(1)
                        .statementDescriptor("statement")
                        .build())
                .build();

        List<OrderPaymentRequest> payments = new ArrayList<>();
        payments.add(payment);

        OrderCreateRequest request = OrderCreateRequest.builder()
                .type("online")
                .processingMode("automatic")
                .captureMode("manual")
                .totalAmount("1000.00")
                .externalReference("ext_ref")
                .payer(OrderPayerRequest.builder().email("jota2@testuser.com").build())
                .transactions(OrderTransactionRequest.builder()
                        .payments(payments)
                        .build())
                .build();

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Sandbox", "true");
        headers.put("X-Idempotency-Key", "{{Idempoency_Key}}");

        MPRequestOptions requestOptions = MPRequestOptions.builder()
                .customHeaders(headers)
                .build();

        try {
            Order order = client.create(request, requestOptions);
            System.out.println("Order created: " + order.getId());
            System.out.println("Order status: " + order.getStatus());
            System.out.println("Order status: " + order.getStatusDetail());

            // Capture Order
            Order capturedOrder = client.capture(order.getId(), requestOptions);
            System.out.println("Captured order: " + capturedOrder.getId());
            System.out.println("Captured order status: " + capturedOrder.getStatus());
            System.out.println("Captured order status: " + capturedOrder.getStatusDetail());
        } catch (Exception e) {
            System.out.println("Error creating order: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            System.out.println("Stack Trace: " + e.getStackTrace());
            System.out.println("Error cause: " + e.getCause());
        }

    }

}
