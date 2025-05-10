package BACKEND;
import MODEL.Participante;

public interface ParticipanteService {
    void registrar(String nombre, String telefono, String region) throws Exception;
}
