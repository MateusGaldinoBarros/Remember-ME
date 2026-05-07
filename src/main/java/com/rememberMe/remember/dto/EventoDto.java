package com.rememberMe.remember.dto;

import com.rememberMe.remember.model.EventoStatus;

public class EventoDto {
    private String descricao;
    private int prazo;
    private EventoStatus eventoStatus;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public EventoStatus getEventoStatus() {
        return eventoStatus;
    }

    public void setEventoStatus(EventoStatus eventoStatus) {
        this.eventoStatus = eventoStatus;
    }
}
