package com.mercadopago.resources.order;

import com.mercadopago.net.MPResource;
import lombok.Getter;

/* API version: 54cea3ac-c258-4a6f-aea9-988e641cff30 */

/**
 * OrderRefund class.
 */
@Getter
public class OrderRefund extends MPResource {

    /** Refund id. */
    private String id;

    /** Transaction id. */
    private String transactionId;

    /** Reference id. */
    private String referenceId;

    /** Amount Refund. */
    private String amount;

    /** Status Refund. */
    private String status;
}
