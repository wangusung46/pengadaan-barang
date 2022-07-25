package pbarang.model.penjualan;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class PenjualanJdbcImplement implements PenjualanJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(PenjualanJdbcImplement.class);

    public PenjualanJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Penjualan> selectAll() {
        List<Penjualan> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM penjualan";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Penjualan pembelian = new Penjualan();
                pembelian.setId(resultSet.getLong("id")); 
                pembelian.setTanggalPenjualan(resultSet.getDate("tanggal_penjualan"));
                pembelian.setIdPenjualan(resultSet.getInt("id_penjualan"));                
                pembelian.setNetto(resultSet.getLong("netto"));                
                     
                
                response.add(pembelian);
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
    public void insert(Penjualan request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO penjualan\n"
                    + "(tanggal_penjualan, id_penjualan, netto)\n"
                    + "VALUES(?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getId());       
            preparedStatement.setDate(2, (Date) request.getTanggalPenjualan());      
            preparedStatement.setInt(3, request.getIdPenjualan());    
            preparedStatement.setLong(4, request.getNetto());    
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Penjualan request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE penjualan\n"
                    + "SET tanggal_penjualan=?, id_penjualan, netto=?\n"
                    + "WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);            
            preparedStatement.setDate(1, (Date) request.getTanggalPenjualan());
            preparedStatement.setInt(2, request.getIdPenjualan());
            preparedStatement.setLong(3, request.getNetto());
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
            sql = "DELETE FROM penjualan WHERE id=?;";
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
