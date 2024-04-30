package com.paramjeet.parkingservice.dtos;

import com.paramjeet.parkingservice.models.EVehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDto {
    private Long gateId;
    private EVehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
}
