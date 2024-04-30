package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel{
    private String name;
    private Long phoneNo;
    private Long employeeId;

}

