package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private Long parkingFloorNo;
    private List<ParkingSpot> parkingSpotList;
    private EParkingLotStatus parkingFloorStatus;


}