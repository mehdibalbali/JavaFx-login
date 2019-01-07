package login.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	private final StringProperty login = new SimpleStringProperty();
	private final StringProperty pwd = new SimpleStringProperty();
	
	
	public final StringProperty loginProperty() {
		return this.login;
	}
	
	public final String getLogin() {
		return this.loginProperty().get();
	}
	
	public final void setLogin(final String login) {
		this.loginProperty().set(login);
	}
	
	public final StringProperty pwdProperty() {
		return this.pwd;
	}
	
	public final String getPwd() {
		return this.pwdProperty().get();
	}
	
	public final void setPwd(final String pwd) {
		this.pwdProperty().set(pwd);
	}
	
	
	
}
