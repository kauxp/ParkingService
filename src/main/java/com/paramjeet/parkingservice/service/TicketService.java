package com.paramjeet.parkingservice.service;


import com.paramjeet.parkingservice.exceptions.InvalidGateException;
import com.paramjeet.parkingservice.models.EVehicleType;
import com.paramjeet.parkingservice.models.Gate;
import com.paramjeet.parkingservice.models.Ticket;
import com.paramjeet.parkingservice.models.Vehicle;
import com.paramjeet.parkingservice.repositories.GateRepository;

import java.util.Optional;
import java.time.LocalTime;



public class TicketService {
    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, EVehicleType vehicleType, String ownerName) throws InvalidGateException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalTime.now());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());


        Vehicle vehicle = new Vehicle();
        vehicle.setOwnerName(ownerName);
        vehicle.setVehicleNo(vehicleNumber);
        vehicle.setVehicleType(vehicleType);
        ticket.setVehicle(vehicle);


        return ticket;
    }
}
