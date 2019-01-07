
package login;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Connexion;
import com.mysql.jdbc.ResultSetMetaData;


public class Implementations {
	Connexion c ;
	public void log(String x, String y) {
		 c = new Connexion();
		try {
			 String sql = "select * from user where (user like '"+x+"')and (password like '"+y+"')";
	         ResultSet rs = c.connect().createStatement().executeQuery(sql);
	         int rowCount = 0;
	         while ( rs.next() )
	         {
	             
	             rowCount++;
	             
	         }
	         
	         if(rowCount==1) {
	        	 System.out.println("login succses");
	         }else {
	        	 System.out.println("password or login are wrong !!");
	         }
		}catch (Exception ex) {
            Logger.getLogger(Implementations.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
