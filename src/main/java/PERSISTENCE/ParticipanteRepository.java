package PERSISTENCE;
import BACKEND.Participante;
import java.sql.SQLException;

public interface ParticipanteRepository {
    void guardar(Participante participante) throws SQLException;
}
