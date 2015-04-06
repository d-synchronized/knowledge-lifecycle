package uk.co.techblue.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;

/**
 * The Class LoginController.
 */
@ManagedBean
@ViewScoped
public class LoginController {

	/** The username. */
	private String username;

	/** The password. */
	private String password;
	
    /** The submit control. */
    private transient UIComponent submitControl;


	/**
	 * Authenticate.
	 * 
	 * @return the string
	 */
	public String authenticate() {
		return "demo";
	}

	/**
	 * Gets the username.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 * 
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public UIComponent getSubmitControl() {
		return submitControl;
	}

	public void setSubmitControl(UIComponent submitControl) {
		this.submitControl = submitControl;
	}

}
