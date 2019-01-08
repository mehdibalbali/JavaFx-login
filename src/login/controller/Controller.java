package login.controller;


import java.awt.event.MouseEvent;
import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import login.Implementations;



public class Controller {
	 	@FXML
	    private JFXTextField tfusername;
	    @FXML
	    private JFXPasswordField tfpwd;
	    @FXML
	    private JFXButton btnConnect;
		Implementations crd = new Implementations();
		@FXML
		private Label invalid;
		@FXML
		private Parent  root;
		MouseEvent event ;
		public void login(ActionEvent event) throws IOException{
	    	
	    	
	    	 
	    	Parent parent = FXMLLoader.load(getClass().getResource("/login/view/hello.fxml")) ;
	    	Scene scene =new Scene(parent);
	    	Stage stage = (Stage)  ( (Node) event.getSource()).getScene().getWindow();
	    	if (crd.log(tfusername.getText(), tfpwd.getText()))
            {
                stage.hide();
                stage.setScene(scene);
                stage.show();  
            }else {
            	invalid.setText("username and/or password are wrong! ");
            }
	   }
	 }
		

