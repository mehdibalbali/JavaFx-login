package login.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import login.Implementations;
import login.model.Model;


public class Controller {
	 	@FXML
	    private JFXTextField tfusername;
	    @FXML
	    private JFXPasswordField tfpwd;
	    @FXML
	    private JFXButton btnConnect;
		Implementations crd = new Implementations();
	  
		
		public void login() {
	    	
	    	crd.log(tfusername.getText(), tfpwd.getText());
	    }
		
}
