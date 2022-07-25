package pbarang.model.detailpenjualan;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class DetailPenjualanJdbcImplement implements DetailPenjualanJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(DetailPenjualanJdbcImplement.class);

    public DetailPenjualanJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<DetailPenjualan> selectAll() {
        List<DetailPenjualan> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM detail_penjualan;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                DetailPenjualan detailPenjualan = new DetailPenjualan();
                detailPenjualan.setId(resultSet.getLong("id"));
                detailPenjualan.setIdPenjualan(resultSet.getLong("id_penjualan"));
                detailPenjualan.setBarang(resultSet.getString("barang"));
                detailPenjualan.setSatuan(resultSet.getString("satuan"));
                detailPenjualan.setVolume(resultSet.getLong("volume"));
                detailPenjualan.setHarga(resultSet.getLong("harga"));
                detailPenjualan.setSubtotal(resultSet.getLong("subtotal"));
                response.add(detailPenjualan);
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
    public DetailPenjualan select(Long request) {
        logger.debug(request.toString());
        DetailPenjualan response = new DetailPenjualan();
        try {
            sql = "select * from detail_penjualan where id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setIdPenjualan(resultSet.getLong("id_penjualan"));
                response.setBarang(resultSet.getString("barang"));
                response.setSatuan(resultSet.getString("satuan"));
                response.setVolume(resultSet.getLong("volume"));
                response.setVolume(resultSet.getLong("harga"));
                response.setVolume(resultSet.getLong("subtotal"));
            }
            logger.debug(response.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
        }
        return response;
    }

    @Override
    public void insert(DetailPenjualan request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO detail_penjualan (id_penjualan, barang, satuan, volume, harga, subtotal) VALUES(?, ?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdPenjualan());
            preparedStatement.setString(2, request.getBarang());
            preparedStatement.setString(3, request.getSatuan());
            preparedStatement.setLong(4, request.getVolume());
            preparedStatement.setLong(5, request.getHarga());
            preparedStatement.setLong(6, request.getSubtotal());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(DetailPenjualan request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE detail_penjualan SET id_penjualan=?, barang=?, satuan=?, volume=?, harga=?, subtotal=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdPenjualan());
            preparedStatement.setString(2, request.getBarang());
            preparedStatement.setString(3, request.getSatuan());
            preparedStatement.setLong(4, request.getVolume());
            preparedStatement.setLong(5, request.getHarga());
            preparedStatement.setLong(6, request.getSubtotal());
            preparedStatement.setLong(7, request.getId());
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
            sql = "DELETE FROM detail_penjualan WHERE id=?;";
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
