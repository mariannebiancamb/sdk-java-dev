package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

/** OrderStoredCredentialRequest class. */
@Getter
@Builder
public class OrderStoredCredentialRequest {

    /** Order Stored Credential Payment initiator. */
    private String paymentInitiator;

    /** Order Stored Credential Reason for the payment. */
    private String reason;

    /** Order Stored Credential Store payment method flag. */
    private boolean storePaymentMethod;

    /** Order Stored Credential First payment flag. */
    private boolean firstPayment;
}

