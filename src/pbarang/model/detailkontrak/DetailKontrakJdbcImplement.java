package pbarang.model.detailkontrak;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class DetailKontrakJdbcImplement implements DetailKontrakJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(DetailKontrakJdbcImplement.class);

    public DetailKontrakJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<DetailKontrak> selectAll() {
        List<DetailKontrak> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM detail_kontrak";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                DetailKontrak detailKontrak = new DetailKontrak();
                detailKontrak.setId(resultSet.getLong("id"));
                detailKontrak.setIdKontrak(resultSet.getLong("id_kontrak"));
                detailKontrak.setPekerjaan(resultSet.getString("pekerjaan"));
                detailKontrak.setVolume(resultSet.getLong("volume"));
                detailKontrak.setSatuan(resultSet.getString("satuan"));
                detailKontrak.setHarga(resultSet.getLong("harga"));
                detailKontrak.setJumlah(resultSet.getLong("jumlah"));

                response.add(detailKontrak);
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
    public DetailKontrak select(Long request) {
        DetailKontrak response = new DetailKontrak();
        try {
            sql = "SELECT * FROM detail_kontrak where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setIdKontrak(resultSet.getLong("id_kontrak"));
                response.setPekerjaan(resultSet.getString("pekerjaan"));
                response.setVolume(resultSet.getLong("volume"));
                response.setSatuan(resultSet.getString("satuan"));
                response.setHarga(resultSet.getLong("harga"));
                response.setJumlah(resultSet.getLong("jumlah"));
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

    /**
     *
     * @param request
     */
    @Override
    public void insert(DetailKontrak request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO detail_kontrak\n"
                    + "(id_kontrak, pekerjaan, volume, satuan, harga, jumlah)\n"
                    + "VALUES(?, ?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdKontrak());
            preparedStatement.setString(2, request.getPekerjaan());
            preparedStatement.setLong(3, request.getVolume());
            preparedStatement.setString(4, request.getSatuan());
            preparedStatement.setLong(5, request.getHarga());
            preparedStatement.setLong(6, request.getJumlah());

            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(DetailKontrak request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE detail_kontrak\n"
                    + "SET id_kontrak=?, pakerjaan=?, volume=?, satuan=?, harga=?, jumlah=?\n"
                    + "WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdKontrak());
            preparedStatement.setString(2, request.getPekerjaan());
            preparedStatement.setLong(3, request.getVolume());
            preparedStatement.setString(4, request.getSatuan());
            preparedStatement.setLong(5, request.getHarga());
            preparedStatement.setLong(6, request.getJumlah());
            preparedStatement.setLong(8, request.getId());
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
            sql = "DELETE FROM detail_kontrak WHERE id=?;";
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
