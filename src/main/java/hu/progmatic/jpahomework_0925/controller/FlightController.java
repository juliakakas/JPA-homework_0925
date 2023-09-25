package hu.progmatic.jpahomework_0925.controller;

import hu.progmatic.jpahomework_0925.model.Flight;
import hu.progmatic.jpahomework_0925.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    // "egyszerű" ellenőrzéshez :)
    @GetMapping("/create/{flightNumber}/{airplaneType}/{airline}")
    public Flight createFlight(@PathVariable String flightNumber,
                               @PathVariable String airplaneType,
                               @PathVariable String airline) {
        return flightService.createFlight(new Flight(flightNumber, airplaneType, airline));
    }
}
