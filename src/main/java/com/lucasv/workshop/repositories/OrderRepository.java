package com.lucasv.workshop.repositories;

import com.lucasv.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
