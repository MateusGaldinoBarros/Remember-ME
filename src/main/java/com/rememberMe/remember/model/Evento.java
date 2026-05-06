package com.rememberMe.remember.model;

import jakarta.persistence.*;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false, unique = true)
    private String descricao;
    @Column(nullable = false)
    private int prazo;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EventoStatus eventoStatus;


    public Evento(String descricao, int prazo) {
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public Evento() {

    }


    public void setId(long id) {
        Id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrazo(int prazo) {
        if(prazo<=0){
            throw new IllegalArgumentException();
        }
        this.prazo = prazo;
    }
}
