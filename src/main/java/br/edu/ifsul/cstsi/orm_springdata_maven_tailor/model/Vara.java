package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Vara")
@Table(name = "Vara")
public class Vara {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idvara;
    private String descricaoVara;
    @OneToMany(mappedBy = "vara")
    private List<Processo> processos;

    public String ConsultaVara() {
        return null;
    }

    public String listarVara() {
        return null;
    }


}
