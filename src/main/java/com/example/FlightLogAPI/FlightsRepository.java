package com.example.FlightLogAPI;

import org.springframework.data.repository.CrudRepository;

public interface FlightsRepository extends CrudRepository<Flights, Long> {
}
