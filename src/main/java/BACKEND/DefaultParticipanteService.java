package BACKEND;
import BACKEND.Participante;
import PERSISTENCE.ParticipanteRepository;

public class DefaultParticipanteService implements ParticipanteService {
    private final ParticipanteRepository repo;

    public DefaultParticipanteService(ParticipanteRepository repo) {
        this.repo = repo;
    }

    @Override
    public void registrar(Participante participante) throws Exception {
        if (!participante.esValido()) {
            throw new IllegalArgumentException(participante.mensajeDeError());
        }
        repo.guardar(participante);
    }
}
