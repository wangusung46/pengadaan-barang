package pbarang.model.pembelian;

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

public class PembelianJdbcImplement implements PembelianJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(PembelianJdbcImplement.class);

    public PembelianJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Pembelian> selectAll() {
        List<Pembelian> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM pembelian";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Pembelian pembelian = new Pembelian();
                pembelian.setId(resultSet.getLong("id"));
                pembelian.setIdKontrak(resultSet.getLong("id_kontrak"));
//                pembelian.setNamaKontrak(resultSet.getString("nama_kontrak"));                
                pembelian.setTanggalRo(resultSet.getDate("tanggal_pembelian"));
                pembelian.setIdSupplier(resultSet.getLong("id_supplier"));
//                pembelian.setNamaSupplier(resultSet.getString("nama_supplier"));     
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
    public void insert(Pembelian request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO pembelian\n"
                    + "(id_kontrak, tanggal_pembelian, id_supplier, netto)\n"
                    + "VALUES(?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdKontrak());
            preparedStatement.setDate(2, new java.sql.Date(request.getTanggalRo().getTime()));
            preparedStatement.setLong(3, request.getIdSupplier());
            preparedStatement.setLong(4, request.getNetto());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Pembelian request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE pembelian\n"
                    + "SET id_kontrak=?, nama_kontrak=?, tanggal_ro=?, id_supplier=?, nama_supplier=?, netto=?\n"
                    + "WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getIdKontrak());
            preparedStatement.setString(2, request.getNamaKontrak());
            preparedStatement.setDate(3, (Date) request.getTanggalRo());
            preparedStatement.setLong(4, request.getIdSupplier());
            preparedStatement.setString(5, request.getNamaSupplier());
            preparedStatement.setFloat(6, request.getNetto());
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
            sql = "DELETE FROM pembelian WHERE id = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public Pembelian select(Long request) {
        Pembelian response = new Pembelian();
        try {
            sql = "SELECT * FROM pembelian where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setIdKontrak(resultSet.getLong("id_kontrak"));
                response.setTanggalRo(resultSet.getDate("tanggal_pembelian"));
                response.setIdSupplier(resultSet.getLong("id_supplier"));
                response.setNetto(resultSet.getLong("netto"));
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

}
