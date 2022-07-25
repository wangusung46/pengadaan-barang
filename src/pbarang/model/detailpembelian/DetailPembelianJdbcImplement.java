package pbarang.model.detailpembelian;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class DetailPembelianJdbcImplement implements DetailPembelianJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(DetailPembelianJdbcImplement.class);

    public DetailPembelianJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<DetailPembelian> selectAll() {
        List<DetailPembelian> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM detail_pembelian;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                DetailPembelian detailPembelian = new DetailPembelian();
                detailPembelian.setId(resultSet.getLong("id"));
                detailPembelian.setBarang(resultSet.getString("barang"));
                detailPembelian.setSatuan(resultSet.getString("satuan"));
                detailPembelian.setVolume(resultSet.getLong("volume"));
                response.add(detailPembelian);
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
    public DetailPembelian select(Long request) {
        logger.debug(request.toString());
        DetailPembelian response = new DetailPembelian();
        try {
            sql = "select * from detail_pembelian where id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setBarang(resultSet.getString("barang"));
                response.setSatuan(resultSet.getString("satuan"));
                response.setVolume(resultSet.getLong("volume"));
            }
            logger.debug(response.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
        }
        return response;
    }

    @Override
    public void insert(DetailPembelian request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO detail_pembelian (barang, satuan, volume) VALUES(?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getBarang());
            preparedStatement.setString(2, request.getSatuan());
            preparedStatement.setLong(3, request.getVolume());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(DetailPembelian request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE detail_pembelian SET barang=?, satuan=?, volume=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getBarang());
            preparedStatement.setString(2, request.getSatuan());
            preparedStatement.setLong(3, request.getVolume());
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
            sql = "DELETE FROM detail_pembelian WHERE id=?;";
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
