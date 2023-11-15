package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Custa extends Processo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Date dataCusta;
    private String descricaoCusta;
    private Double valorCusta;
    private Custa custa;

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

    public Custa(Long ID, Date dataCusta, String descricaoCusta, Double valorCusta, Custa custa) {
        this.ID = ID;
        this.dataCusta = dataCusta;
        this.descricaoCusta = descricaoCusta;
        this.valorCusta = valorCusta;
        this.custa = custa;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDataCusta() {
        return dataCusta;
    }

    public void setDataCusta(Date dataCusta) {
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

    public Custa getCusta() {
        return custa;
    }

    public void setCusta(Custa custa) {
        this.custa = custa;
    }

    @Override
    public String toString() {
        return "\nCusta{" +
                "ID=" + ID +
                ", dataCusta=" + dataCusta +
                ", descricaoCusta='" + descricaoCusta + '\'' +
                ", valorCusta=" + valorCusta +
                ", custa=" + custa +
                '}';
    }
}
