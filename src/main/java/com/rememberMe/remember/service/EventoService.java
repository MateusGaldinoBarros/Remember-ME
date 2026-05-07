package com.rememberMe.remember.service;

import com.rememberMe.remember.dto.EventoDto;
import com.rememberMe.remember.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    @Autowired
    public EventoService (EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }


}
