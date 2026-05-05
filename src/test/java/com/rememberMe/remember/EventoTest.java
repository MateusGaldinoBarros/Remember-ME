package com.rememberMe.remember;

import com.rememberMe.remember.model.Evento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventoTest {

    @Test
    public void PrazoNegativoTest() {
        Evento evento = new Evento("dar presente",10);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            {evento.setPrazo(-1);

        });
    }

    @Test
    public void PrazoZeroTest() {
        Evento evento = new Evento("dar presente",10);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {evento.setPrazo(-1);

        });
    }
}
