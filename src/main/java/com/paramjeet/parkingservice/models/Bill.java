package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Gate gate;
    private int amount;
    private EStatus status;
    private  Ticket ticket;
    private Operator operator;
    private LocalTime exitTime;
    private List<Payment> payments;
}