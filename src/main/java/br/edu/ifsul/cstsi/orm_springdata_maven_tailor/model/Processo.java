package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import br.edu.ifsul.cstsi.orm_springdata_maven_tailor.audiencia.Audiencia;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Processo")
@Table(name = "Processo")
public class Processo{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroProcesso;
    private LocalDate aberturaProcesso;
    private LocalDate conclusaoProcesso;
    private  String descricaoProcesso;
    private Situacao situacaoProcesso;

    @OneToMany(mappedBy = "processo")
    private List<Custa> custas = new ArrayList<>();
    @OneToMany(mappedBy = "processo")
    private List<Audiencia>audiencias = new ArrayList<>();
    @ManyToOne
    private Vara vara;

    public Integer registrarProcesso() {
        return null;
    }

    public String consultarProcesso() {
        return null;
    }

    public String listarProcesso() {
        return null;
    }

    public Integer atualizarProcesso() {
        return null;
    }


}
