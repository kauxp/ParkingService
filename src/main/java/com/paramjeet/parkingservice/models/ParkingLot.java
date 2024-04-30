package com.paramjeet.parkingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel{
    private List<Gate> gates;
    private List<EVehicleType> vehicleTypes;
    private EParkingLotStatus parkingLotStatus;
    private List<ParkingFloor> parkingFloorList;

}