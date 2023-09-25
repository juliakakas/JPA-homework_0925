package hu.progmatic.jpahomework_0925.repository;

import hu.progmatic.jpahomework_0925.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
