package com.rememberMe.remember;

import com.rememberMe.remember.dto.CriarEventoDto;
import com.rememberMe.remember.model.Evento;
import com.rememberMe.remember.model.EventoStatus;
import com.rememberMe.remember.repository.EventoRepository;
import com.rememberMe.remember.service.EventoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CriarEventoTeste {
    @Mock
    private EventoRepository eventoRepository;

    @InjectMocks
    public EventoService eventoService;

    @Test
    @DisplayName("Deve criar um evento com sucesso")
    void deveCriarEventoComSucesso () {
        CriarEventoDto eventoDto = new CriarEventoDto("Dar presente a namorada",15, EventoStatus.NAO_PENDENTE);

        Evento eventoSalvo = new Evento();
        eventoSalvo.setDescricao(eventoDto.getDescricao());
        eventoSalvo.setPrazo(eventoDto.getPrazo());
        eventoSalvo.setEventoStatus(eventoDto.getEventoStatus());

        when(eventoRepository.save(any(Evento.class))).thenReturn(eventoSalvo);

        Evento resultado = eventoService.criarEvento(eventoDto);

        assertNotNull(resultado);
        verify(eventoRepository, times(1)).save(any(Evento.class));
    }
}
