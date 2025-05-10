package PERSISTENCE;
import BACKEND.Participante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcParticipanteRepository implements ParticipanteRepository {
    private Connection connection;

    public JdbcParticipanteRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void guardar(Participante participante) throws SQLException {
        String sql = "INSERT INTO participantes(nombre, telefono, region) VALUES (?, ?, ?)";
        try (PreparedStatement st = connection.prepareStatement(sql)) {
            st.setString(1, participante.getNombre());
            st.setString(2, participante.getTelefono());
            st.setString(3, participante.getRegion());
            st.executeUpdate();
        }
    }
}
