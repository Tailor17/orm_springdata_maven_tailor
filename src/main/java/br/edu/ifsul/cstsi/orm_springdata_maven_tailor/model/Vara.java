package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

@Entity(name = "Vara")
@Table(name = "Vara")
public class Vara {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idvara;
    private String descricaoVara;
    @ManyToOne
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
        this.descricaoVara = descrcaoVara;
        this.processo = processo;
    }

    public Long getIdvara() {
        return Idvara;
    }

    public void setIdvara(Long idvara) {
        Idvara = idvara;
    }

    public String getDescircaoVara() {
        return descricaoVara;
    }

    public void setDescricaoVara(String descircaoVara) {
        this.descricaoVara = descricaoVara;
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
                ", descrcaoVara='" + descricaoVara + '\'' +
                ", processo=" + processo +
                '}';
    }
}
