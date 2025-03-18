package com.mercadopago.client.common;


import lombok.Builder;
import lombok.Getter;

/** OrderAutomaticPaymentsRequest class. */
@Getter
@Builder
public class InvoicePeriod {

    /** Invoice Period type. */
    private String type;

    /** Invoice Period period. */
    private int period;
}
