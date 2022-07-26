package pbarang.model.admin;

import koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Khanza
 */
public class UserJdbcImplement implements UserJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(UserJdbcImplement.class);

    public UserJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public Boolean login(String userName, String password) {
        try {
            sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                resultSet.close();
                preparedStatement.close();
                return true;
            } else {
                resultSet.close();
                preparedStatement.close();
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }

    @Override
    public void insert(User request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO user (username, nama, email, password, `role`) VALUES(?, ?, ?, ?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getUsername());
            preparedStatement.setString(2, request.getNama());
            preparedStatement.setString(3, request.getEmail());
            preparedStatement.setString(4, request.getPassword());
            preparedStatement.setString(5, request.getRole());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String selectRole(String text) {
        String response = new String();
        try {
            sql = "select * from user where username = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, text);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response = resultSet.getString("role");
            }
            logger.debug(response);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
        }
        return response;
    }

    @Override
    public List<User> selectAll() {
        List<User> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM user;";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("username"));
                user.setNama(resultSet.getString("nama"));
                response.add(user);
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
    public User select(String request) {
        User response = new User();
        try {
            sql = "SELECT * FROM user where username = ?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                response.setId(resultSet.getLong("username"));
                response.setNama(resultSet.getString("nama"));
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
