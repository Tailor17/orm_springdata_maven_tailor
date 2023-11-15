package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.teste;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity

public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate aniversario;
}
