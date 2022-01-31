package JdbcEnv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Stored_procedure {

        private Connection connection;
        
        public Stored_procedure(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
                
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.getConnection(dbURL, user, pwd);
        }
        
        public Connection getConnection(){
                return this.connection;
        }
        
        public void closeConnection() throws SQLException {
                if (this.connection != null)
                        this.connection.close();
        }}
        
