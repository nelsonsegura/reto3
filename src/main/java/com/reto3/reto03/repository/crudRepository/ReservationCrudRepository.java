package com.reto3.reto03.repository.crudRepository;

import com.reto3.reto03.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
