package com.mercadopago.client.order;

import lombok.Builder;
import lombok.Getter;

/** OrderPaymentCreateRequest class. */
@Getter
@Builder
public class OrderPaymentRequest {

    /** Payment amount. */
    private String amount;

    /** Payment method information. */
    private OrderPaymentMethodRequest paymentMethod;

    /** Automatic Payment method information. */
    private OrderAutomaticPaymentsRequest automaticPayment;

   /** Stored Credential information. */
   private OrderStoredCredentialRequest storedCredential;

    /** Subscription Data information. */
    private OrderSubscriptionDataRequest subscriptionData;

}
