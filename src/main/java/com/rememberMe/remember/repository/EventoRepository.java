package com.rememberMe.remember.repository;

import com.rememberMe.remember.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
