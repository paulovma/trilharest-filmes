package com.opensanca.trilharest.filmes.filmes.filmes;

import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

public class Filme {

    private UUID id;

    private String nome;

    private String sinopse;

    private Duration duration;

    private LocalDate inicioExibicao;

    private LocalDate fimExibicao;

    public Filme() {

    }

    public Filme(UUID id, String nome, String sinopse, Duration duration, LocalDate inicioExibicao, LocalDate fimExibicao) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.duration = duration;
        this.inicioExibicao = inicioExibicao;
        this.fimExibicao = fimExibicao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDate getInicioExibicao() {
        return inicioExibicao;
    }

    public void setInicioExibicao(LocalDate inicioExibicao) {
        this.inicioExibicao = inicioExibicao;
    }

    public LocalDate getFimExibicao() {
        return fimExibicao;
    }

    public void setFimExibicao(LocalDate fimExibicao) {
        this.fimExibicao = fimExibicao;
    }

    public Boolean emExibicao(LocalDate referencia) {
        if (getInicioExibicao() == null || getFimExibicao() == null) {
            return false;
        }
        LocalDate inicio = getInicioExibicao();
        LocalDate fim = getFimExibicao();
        boolean hojeDepoisDoInicio = inicio.isEqual(referencia) || inicio.isBefore(referencia);
        boolean hojeAntesDoInicio = fim.isEqual(referencia) || fim.isAfter(referencia);
        return hojeDepoisDoInicio && hojeAntesDoInicio;
    }
}
