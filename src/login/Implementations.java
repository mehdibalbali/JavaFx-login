
package login;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Connexion;
import javafx.stage.Stage;


public class Implementations {
	Connexion c ;
	Stage stage ;
	public Boolean log(String x, String y) {
		 c = new Connexion();
		 boolean v =false;
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
	        	 v= true;
	         }else {
	        	 System.out.println("password or login are wrong !!");
	        	 v= false;
	         }
		}catch (Exception ex) {
            Logger.getLogger(Implementations.class.getName()).log(Level.SEVERE, null, ex);
		}
		return v;
	}
}
