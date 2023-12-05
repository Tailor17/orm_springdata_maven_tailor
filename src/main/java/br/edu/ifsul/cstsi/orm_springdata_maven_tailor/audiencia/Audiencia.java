package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.audiencia;

import br.edu.ifsul.cstsi.orm_springdata_maven_tailor.model.Processo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity(name = "Audiencia")
@Table(name = "Audiencia")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate dataAudiencia;
    private String parecerAudiencia;
    private String nomeAudiencia;
    @ManyToOne
    private Processo processo;
    private boolean situacao;



    public static void setSituacao(boolean b) {
    }

    public Integer registrarAudiencia() {
        return null;
    }

    public String consultarAudiencia() {
        return null;
    }

    public String listarAudiencia() {
        return null;
    }

    public boolean getSituacao() {
        return false;
    }
}


