package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

public enum Situacao {
    ABERTO("Aberto"),
    ENCERRADO("Encerrado");

    private String situacao;

    Situacao(String situacao) {
        this.situacao = situacao;
    }
}
