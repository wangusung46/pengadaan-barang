package pbarang.model.kontrak;

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

public class KontrakJdbcImplement implements KontrakJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(KontrakJdbcImplement.class);

    public KontrakJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Kontrak> selectAll() {
        List<Kontrak> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM kontrak";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Kontrak kontrak = new Kontrak();
                kontrak.setId(resultSet.getLong("id"));                
                kontrak.setTanggalKontrak(resultSet.getDate("tanggal_kontrak"));                
                kontrak.setIdKlien(resultSet.getLong("id_klien"));
//                kontrak.setNamaKlien(resultSet.getString("nama_klien"));
                kontrak.setNamaProyek(resultSet.getString("nama_proyek"));
                kontrak.setUser(resultSet.getString("user"));
//                kontrak.setNamaUser(resultSet.getString("nama_user"));
                kontrak.setNilaiKontrak(resultSet.getFloat("nilai_kontrak"));
                kontrak.setNamaProyek(resultSet.getString("lama_proyek"));
                kontrak.setSyaratPembayaran(resultSet.getString("syarat_pembayaran"));
                response.add(kontrak);
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
    public void insert(Kontrak request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO kontrak\n"
                    + "(user, nama_user, nama_proyek, lama_proyek, tanggal_kontrak, nilai_kontrak, id_klien, nama_klien, syarat_pembayaran )\n"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getId());            
            preparedStatement.setString(2, request.getUser());            
            preparedStatement.setString(3, request.getNamaUser());            
            preparedStatement.setString(4, request.getNamaProyek());            
            preparedStatement.setDate(5, (Date) request.getTanggalKontrak());
            preparedStatement.setFloat(6, request.getNilaiKontrak());               
            preparedStatement.setLong(7, request.getIdKlien());               
            preparedStatement.setString(8, request.getNamaKlien());               
            preparedStatement.setString(9, request.getSyaratPembayaran());               
          
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Kontrak request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE kontrak\n"
                    + "SET user=?, nama_user=?, nama_proyek=?, lama_proyek=?, tanggal_kontrak=?, nilai_kontrak=?, id_klien=?, nama_klien=?, syarat_pembayaran\n"
                    + "WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getUser());
            preparedStatement.setString(2, request.getNamaUser());
            preparedStatement.setString(3, request.getNamaProyek());
            preparedStatement.setString(4, request.getLamaProyek());
            preparedStatement.setDate(5, (Date) request.getTanggalKontrak());
            preparedStatement.setFloat(6, request.getNilaiKontrak());
            preparedStatement.setLong(7, request.getIdKlien());
            preparedStatement.setString(8, request.getNamaKlien());
            preparedStatement.setString(9, request.getSyaratPembayaran());
                        
            preparedStatement.setLong(10, request.getId());
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
            sql = "DELETE FROM kontrak WHERE id=?;";
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
