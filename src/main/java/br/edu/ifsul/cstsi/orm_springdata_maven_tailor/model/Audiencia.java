package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity(name = "Audiencia")
@Table(name = "Audiencia")
public class Audiencia{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate dataAudiencia;
    private String parecerAudiencia;
    @ManyToOne
    private Processo processo;

    public Integer registrarAudiencia() {
        return null;
    }

    public String consultarAudiencia() {
        return null;
    }

    public String listarAudiencia() {
        return null;
    }
    public Audiencia() {
        super();
    }

    public Audiencia(Long id, LocalDate dataAudiencia, String parecerAudiencia, Processo processo) {
        Id = id;
        this.dataAudiencia = dataAudiencia;
        this.parecerAudiencia = parecerAudiencia;
        this.processo = processo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(LocalDate dataAudiencia) {
        this.dataAudiencia = dataAudiencia;
    }

    public String getParecerAudiencia() {
        return parecerAudiencia;
    }

    public void setParecerAudiencia(String parecerAudiencia) {
        this.parecerAudiencia = parecerAudiencia;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return "\nAudiencia{" +
                "Id=" + Id +
                ", dataAudiencia=" + dataAudiencia +
                ", parecerAudiencia='" + parecerAudiencia + '\'' +
                ", processo=" + processo +
                '}';
    }
}
