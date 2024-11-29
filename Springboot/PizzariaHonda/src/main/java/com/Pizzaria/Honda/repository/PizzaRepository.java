package com.Pizzaria.Honda.repository;

import com.Pizzaria.Honda.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
