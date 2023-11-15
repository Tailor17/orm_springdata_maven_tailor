package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Processo")
@Table(name = "Processo")
public class Processo{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroProcesso;
    private Date aberturaProcesso;
    private Date conclusaoProcesso;
    private  String descricaoProcesso;
    private Situacao situacaoProcesso;
    @OneToMany
    private List<Custa> custas = new ArrayList<>();
    @OneToMany
    private List<Audiencia>audiencias = new ArrayList<>();
    @OneToMany
    private List<Vara> varas = new ArrayList<>();

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

    public Processo() {
        super();
    }

    public Processo(Long numeroProcesso, Date aberturaProcesso,
                    Date conclusaoProcesso, String descricaoProcesso,
                    Situacao situacaoProcesso, List<Custa> custas,
                    List<Audiencia> audiencias, List<Vara> varas) {
        this.numeroProcesso = numeroProcesso;
        this.aberturaProcesso = aberturaProcesso;
        this.conclusaoProcesso = conclusaoProcesso;
        this.descricaoProcesso = descricaoProcesso;
        this.situacaoProcesso = situacaoProcesso;
        this.custas = custas;
        this.audiencias = audiencias;
        this.varas = varas;
    }

    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Date getAberturaProcesso() {
        return aberturaProcesso;
    }

    public void setAberturaProcesso(Date aberturaProcesso) {
        this.aberturaProcesso = aberturaProcesso;
    }

    public Date getConclusaoProcesso() {
        return conclusaoProcesso;
    }

    public void setConclusaoProcesso(Date conclusaoProcesso) {
        this.conclusaoProcesso = conclusaoProcesso;
    }

    public String getDescricaoProcesso() {
        return descricaoProcesso;
    }

    public void setDescricaoProcesso(String descricaoProcesso) {
        this.descricaoProcesso = descricaoProcesso;
    }

    public Situacao getSituacaoProcesso() {
        return situacaoProcesso;
    }

    public void setSituacaoProcesso(Situacao situacaoProcesso) {
        this.situacaoProcesso = situacaoProcesso;
    }

    public List<Custa> getCustas() {
        return custas;
    }

    public void setCustas(List<Custa> custas) {
        this.custas = custas;
    }

    public List<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }

    public List<Vara> getVaras() {
        return varas;
    }

    public void setVaras(List<Vara> varas) {
        this.varas = varas;
    }

    @Override
    public String toString() {
        return "\nProcesso{" +
                "numeroProcesso=" + numeroProcesso +
                ", aberturaProcesso=" + aberturaProcesso +
                ", conclusaoProcesso=" + conclusaoProcesso +
                ", descricaoProcesso='" + descricaoProcesso + '\'' +
                ", situacaoProcesso=" + situacaoProcesso +
                ", custas=" + custas +
                ", audiencias=" + audiencias +
                ", varas=" + varas +
                '}';
    }
}
