package br.edu.ifsul.cstsi.orm_springdata_maven_tailor.audiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class AudienciaService {
    @Autowired
    private AudienciaRepository rep;
    public Audiencia insert(Audiencia audiencia) {
        Assert.isNull(audiencia.getId(),"Não foi possível inserir o registro");
        return rep.save(audiencia);
    }
    private static AudienciaService audienciaService;

    public Audiencia getAudienciaById(Long id) {
        Optional<Audiencia> optional = rep.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
    public List<Audiencia> getAudiencia() {
        return rep.findAll();
    }
    public void delete(Long id) {
        rep.deleteById(id);
    }
}
