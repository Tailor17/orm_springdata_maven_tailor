package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Processo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroProcesso;
    private Date aberturaProcesso;
    private Date conclusaoProcesso;
    private String descricaoProcesso;
    private Situacao situacaoProcesso;

}
