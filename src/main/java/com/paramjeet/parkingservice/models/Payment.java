package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class Payment extends BaseModel {
    private int amount;
    private LocalTime time;
    private EStatus status;
    private String referenceNumber;
    private EPaymentMode paymentMode;
}
