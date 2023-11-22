package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "Custa")
@Table(name = "Custa")
public class Custa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private LocalDate dataCusta;
    private String descricaoCusta;
    private Double valorCusta;
    @ManyToOne
    private Processo processo;

    public Integer registrarCusta() {
        return null;
    }

    public String consultarCusta() {
        return null;
    }

    public String listarCusta() {
        return null;
    }

    public Custa() {
        super();
    }

    public Custa(Long ID, LocalDate dataCusta, String descricaoCusta, Double valorCusta, Processo processo) {
        this.ID = ID;
        this.dataCusta = dataCusta;
        this.descricaoCusta = descricaoCusta;
        this.valorCusta = valorCusta;
        this.processo = processo;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDate getDataCusta() {
        return dataCusta;
    }

    public void setDataCusta(LocalDate dataCusta) {
        this.dataCusta = dataCusta;
    }

    public String getDescricaoCusta() {
        return descricaoCusta;
    }

    public void setDescricaoCusta(String descricaoCusta) {
        this.descricaoCusta = descricaoCusta;
    }

    public Double getValorCusta() {
        return valorCusta;
    }

    public void setValorCusta(Double valorCusta) {
        this.valorCusta = valorCusta;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return "\nCusta{" +
                "ID=" + ID +
                ", dataCusta=" + dataCusta +
                ", descricaoCusta='" + descricaoCusta + '\'' +
                ", valorCusta=" + valorCusta +
                ", processo=" + processo +
                '}';
    }
}
