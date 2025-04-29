package BACKEND;
import BACKEND.Participante;
import java.sql.SQLException;

public interface ParticipanteService {
    void registrar(Participante participante) throws Exception;
}
