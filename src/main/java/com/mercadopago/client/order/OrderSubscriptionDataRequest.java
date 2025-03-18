package com.mercadopago.client.order;

import com.mercadopago.client.common.InvoicePeriod;
import com.mercadopago.client.common.SubscriptionSequence;
import lombok.Builder;
import lombok.Getter;

/** OrderAutomaticPaymentsRequest class. */
@Getter
@Builder
public class OrderSubscriptionDataRequest {
        /** Subscription sequence. */
        private SubscriptionSequence subscriptionSequence;

        /** Invoice ID. */
        private String invoiceId;

        /** Invoice period. */
        private InvoicePeriod invoicePeriod;

        /** Billing date. */
        private String billingDate;
}
