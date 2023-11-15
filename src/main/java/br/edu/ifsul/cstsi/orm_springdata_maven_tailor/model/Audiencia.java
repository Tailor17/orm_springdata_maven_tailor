package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "Audiencia")
@Table(name = "Audiencia")
class Audiencia extends Processo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date dataAudiencia;
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

    public Audiencia(Long id, Date dataAudiencia, String parecerAudiencia, Processo processo) {
        Id = id;
        this.dataAudiencia = dataAudiencia;
        this.parecerAudiencia = parecerAudiencia;
        this.processo = processo;
    }

    public Audiencia(Long numeroProcesso, Date aberturaProcesso, Date conclusaoProcesso, String descricaoProcesso, Situacao situacaoProcesso, List<Custa> custas, List<Audiencia> audiencias, List<Vara> varas, Long id, Date dataAudiencia, String parecerAudiencia, Processo processo) {
        super(numeroProcesso, aberturaProcesso, conclusaoProcesso, descricaoProcesso, situacaoProcesso, custas, audiencias, varas);
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

    public Date getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(Date dataAudiencia) {
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
