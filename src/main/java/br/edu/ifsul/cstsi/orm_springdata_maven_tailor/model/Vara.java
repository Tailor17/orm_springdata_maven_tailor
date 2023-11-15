package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vara extends Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idvara;
    private String descrcaoVara;
    private Processo processo;

    public String ConsultaVara() {
        return null;
    }

    public String listarVara() {
        return null;
    }

    public Vara() {
        super();
    }

    public Vara(Long idvara, String descrcaoVara, Processo processo) {
        Idvara = idvara;
        this.descrcaoVara = descrcaoVara;
        this.processo = processo;
    }

    public Long getIdvara() {
        return Idvara;
    }

    public void setIdvara(Long idvara) {
        Idvara = idvara;
    }

    public String getDescrcaoVara() {
        return descrcaoVara;
    }

    public void setDescrcaoVara(String descrcaoVara) {
        this.descrcaoVara = descrcaoVara;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return "\nVara{" +
                "Idvara=" + Idvara +
                ", descrcaoVara='" + descrcaoVara + '\'' +
                ", processo=" + processo +
                '}';
    }
}
