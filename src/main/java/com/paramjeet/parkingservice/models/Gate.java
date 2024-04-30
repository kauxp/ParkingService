package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private int GateNo;
    private Operator operator;
    private  EGateType gateType;
    private EGateStatus gateStatus;

}
