package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String userName = "postgres";
    private static final String password = "admin";
    private static final String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(
                    connectionUrl,
                    userName,
                    password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

}
