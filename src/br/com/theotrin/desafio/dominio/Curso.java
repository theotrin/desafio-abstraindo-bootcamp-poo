package br.com.theotrin.desafio.dominio;

public class Curso {
    private String titlo;
    private String descricao;
    private int cargaHoraria;

    public String getTitlo() {
        return titlo;
    }

    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titlo='" + titlo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

