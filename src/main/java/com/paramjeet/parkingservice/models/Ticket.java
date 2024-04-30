package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class Ticket extends BaseModel{

    private String number;
    private EStatus status;
    private Vehicle vehicle;
    private Gate generatedAt;
    private LocalTime entryTime;
    private Operator generatedBy;
    private ParkingSpot assignedSpot;


}
