package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{

    private String ownerName;
    private String vehicleNo;
    private EVehicleType vehicleType;


}