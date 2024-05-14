package br.com.theotrin.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titlo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitlo() {
        return titlo;
    }

    public void setTitlo(String titlo) {
        this.titlo = titlo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titlo='" + titlo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
