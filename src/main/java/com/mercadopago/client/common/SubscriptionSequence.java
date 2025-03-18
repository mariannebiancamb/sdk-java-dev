package com.mercadopago.client.common;

import lombok.Builder;
import lombok.Getter;

/** OrderAutomaticPaymentsRequest class. */
@Getter
@Builder
public class SubscriptionSequence {

    /** Subscription sequence number. */
    private int number;

    /** Subscription sequence total */
    private int total;
}
