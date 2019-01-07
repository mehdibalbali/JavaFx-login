package login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Connexion {

	private Connection con;
    
	public Connection connect(){
        if(con == null){
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("users");
            db.setUser("root");
            db.setPassword("");
            try {
                con = db.getConnection();
            } catch (SQLException e) {
            }
        }
        return con;
    }
}
