package com.mercadopago.resources.order;

import lombok.Getter;

/** OrderPaymentMethod class. */
@Getter
public class OrderPaymentMethod {
    /** Payment method ID. */
    private String id;

    /** Card ID. */
    private String cardId;

    /** Payment method type. */
    private String type;

    /** Payment method issuer. */
    private String issuerId;

    /** Number of installments. */
    private int installments;

    /** How will look the payment in the card bill (e.g.: MERCADOPAGO).  */
    private String statementDescriptor;

    /** External Resource URL Payment Method. */
    private String externalResourceUrl;

    /** Barcode Content. */
    private String barcodeContent;

    /** Reference. */
    private String reference;

    /** Verification Code. */
    private String verificationCode;

    /** Financial Institution. */
    private String financialInstitution;

    /** QR Code. */
    private String qrCode;

    /** QR Code Base64. */
    private String qrCodeBase64;

    /** Digitable Line. */
    private String digitableLine;

    /** Payment method token. */
    private String token;






}
