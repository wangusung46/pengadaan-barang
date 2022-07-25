package pbarang.model.supplier;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class SupplierJdbcImplement implements SupplierJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(SupplierJdbcImplement.class);

    public SupplierJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Supplier> selectAll() {
        List<Supplier> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM supplier;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Supplier supplier = new Supplier();
                supplier.setId(resultSet.getLong("id"));
                supplier.setNamaSupplier(resultSet.getString("nama_supplier"));
                supplier.setAlamat(resultSet.getString("alamat"));
                supplier.setTelepon(resultSet.getInt("telepon"));
                response.add(supplier);
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
    public Supplier select(Long request) {
        logger.debug(request.toString());
        Supplier response = new Supplier();
        try {
            sql = "select * from supplier where id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setNamaSupplier(resultSet.getString("nama_supplier"));
                response.setAlamat(resultSet.getString("alamat"));
                response.setTelepon(resultSet.getInt("telepon"));
            }
            logger.debug(response.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
        }
        return response;
    }

    @Override
    public void insert(Supplier request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO klien (nama_supplier, alamat, telepon) VALUES(?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getNamaSupplier());
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
    public void update(Supplier request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE supplier SET nama_supplier=?, alamat=?, telepon=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getNamaSupplier());
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
            sql = "DELETE FROM supplier WHERE id=?;";
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
