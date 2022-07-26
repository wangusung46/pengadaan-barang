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
            sql = "select\n"
                    + "	a.id,\n"
                    + "	a.tanggal_kontrak,\n"
                    + "	a.id_klien,\n"
                    + "	b.nama nama_klien,\n"
                    + "	a.nama_proyek,\n"
                    + "	a.`user`,\n"
                    + "	c.nama nama_user,\n"
                    + "	a.nilai_kontrak,\n"
                    + "	a.lama_proyek,\n"
                    + "	a.syarat_pembayaran\n"
                    + "from\n"
                    + "	kontrak a\n"
                    + "left join \n"
                    + "	klien b on a.id_klien = b.id \n"
                    + "left join \n"
                    + "	user c on a.`user` = c.username;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Kontrak kontrak = new Kontrak();
                kontrak.setId(resultSet.getLong("id"));
                kontrak.setTanggalKontrak(resultSet.getDate("tanggal_kontrak"));
                kontrak.setIdKlien(resultSet.getLong("id_klien"));
                kontrak.setNamaKlien(resultSet.getString("nama_klien"));
                kontrak.setNamaProyek(resultSet.getString("nama_proyek"));
                kontrak.setUser(resultSet.getString("user"));
                kontrak.setNamaUser(resultSet.getString("nama_user"));
                kontrak.setNilaiKontrak(resultSet.getLong("nilai_kontrak"));
                kontrak.setLamaProyek(Long.parseLong(resultSet.getString("lama_proyek")));
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

    @Override
    public Kontrak select(Long request) {
        Kontrak response = new Kontrak();
        try {
            sql = "select\n"
                    + "	a.id,\n"
                    + "	a.tanggal_kontrak,\n"
                    + "	a.id_klien,\n"
                    + "	b.nama nama_klien,\n"
                    + "	a.nama_proyek,\n"
                    + "	a.`user`,\n"
                    + "	c.nama nama_user,\n"
                    + "	a.nilai_kontrak,\n"
                    + "	a.lama_proyek,\n"
                    + "	a.syarat_pembayaran\n"
                    + "from\n"
                    + "	kontrak a\n"
                    + "left join \n"
                    + "	klien b on a.id_klien = b.id \n"
                    + "left join \n"
                    + "	user c on a.`user` = c.username \n"
                    + "where\n"
                    + "	a.id = ?";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            preparedStatement.setLong(1, request);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("id"));
                response.setTanggalKontrak(resultSet.getDate("tanggal_kontrak"));
                response.setIdKlien(resultSet.getLong("id_klien"));
                response.setNamaKlien(resultSet.getString("nama_klien"));
                response.setNamaProyek(resultSet.getString("nama_proyek"));
                response.setUser(resultSet.getString("user"));
                response.setNamaUser(resultSet.getString("nama_user"));
                response.setNilaiKontrak(resultSet.getLong("nilai_kontrak"));
                response.setLamaProyek(Long.parseLong(resultSet.getString("lama_proyek")));
                response.setSyaratPembayaran(resultSet.getString("syarat_pembayaran"));
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
                    + "(user, nama_proyek, lama_proyek, tanggal_kontrak, nilai_kontrak, id_klien, syarat_pembayaran )\n"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getUser());
            preparedStatement.setString(2, request.getNamaProyek());
            preparedStatement.setLong(3, request.getLamaProyek());
            preparedStatement.setDate(4, new java.sql.Date(request.getTanggalKontrak().getTime()));
            preparedStatement.setFloat(5, request.getNilaiKontrak());
            preparedStatement.setLong(6, request.getIdKlien());
            preparedStatement.setString(7, request.getSyaratPembayaran());

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
                    + "SET user=?, nama_proyek=?, lama_proyek=?, tanggal_kontrak=?, nilai_kontrak=?, id_klien=?, syarat_pembayaran=?\n"
                    + "WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getUser());
            preparedStatement.setString(2, request.getNamaProyek());
            preparedStatement.setLong(3, request.getLamaProyek());
            preparedStatement.setDate(4, new java.sql.Date(request.getTanggalKontrak().getTime()));
            preparedStatement.setFloat(5, request.getNilaiKontrak());
            preparedStatement.setLong(6, request.getIdKlien());
            preparedStatement.setString(7, request.getSyaratPembayaran());
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
