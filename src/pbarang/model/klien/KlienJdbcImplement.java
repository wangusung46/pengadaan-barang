package pbarang.model.klien;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class KlienJdbcImplement implements KlienJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(KlienJdbcImplement.class);

    public KlienJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Klien> selectAll() {
        List<Klien> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM klien;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Klien klien = new Klien();
                klien.setId(resultSet.getLong("id"));
                klien.setNama(resultSet.getString("nama"));
                klien.setAlamat(resultSet.getString("alamat"));
                klien.setTelepon(resultSet.getLong("telepon"));
                response.add(klien);
            }
            resultSet.close();
            preparedStatement.close();
            logger.debug(response.toString());
            return response;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
            return null;
        }
    }
    
    @Override
    public Klien select(Long request) {
        logger.debug(request.toString());
        Klien response = new Klien();
        try {
            sql = "select * from klien where id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setNama(resultSet.getString("nama"));
                response.setAlamat(resultSet.getString("alamat"));
                response.setTelepon(resultSet.getLong("telepon"));
            }
            logger.debug(response.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
        }
        return response;
    }

    @Override
    public void insert(Klien request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO klien (nama, alamat, telepon) VALUES(?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getNama());
            preparedStatement.setString(2, request.getAlamat());
            preparedStatement.setLong(3, request.getTelepon());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Klien request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE klien SET nama=?, alamat=?, telepon=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getNama());
            preparedStatement.setString(2, request.getAlamat());
            preparedStatement.setLong(3, request.getTelepon());
            preparedStatement.setLong(4, request.getId());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            logger.error(e.getMessage());
        }
    }

    @Override
    public void delete(Long request) {
        logger.debug(request.toString());
        try {
            sql = "DELETE FROM klien WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
