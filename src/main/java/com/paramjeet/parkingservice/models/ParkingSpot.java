package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private Long SpotNo;
    private ParkingFloor parkingFloor;
    private EParkingSpotStatus parkingSpotStatus;
    private List<EVehicleType> supportedVehicleTypes;

}
