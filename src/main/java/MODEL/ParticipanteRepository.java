package PERSISTENCE;
import MODEL.Participante;
import java.sql.SQLException;

public interface ParticipanteRepository {
    void guardar(Participante participante) throws SQLException;
}
