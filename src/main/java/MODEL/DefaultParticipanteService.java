package BACKEND;
import MODEL.Participante;
import PERSISTENCE.ParticipanteRepository;

public class DefaultParticipanteService implements ParticipanteService {
    private final ParticipanteRepository repo;

    public DefaultParticipanteService(ParticipanteRepository repo) {
        this.repo = repo;
    }

    @Override
    public void registrar(String nombre, String telefono, String region) throws Exception {
        Participante participante = new Participante(nombre, telefono, region);
        repo.guardar(participante);
    }

}
