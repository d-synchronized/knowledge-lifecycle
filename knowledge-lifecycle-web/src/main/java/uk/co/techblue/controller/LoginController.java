package uk.co.techblue.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;

import uk.co.techblue.common.dto.user.UserAuthenticationRequest;
import uk.co.techblue.common.exception.UserException;

/**
 * The Class LoginController.
 */
@ManagedBean
@ViewScoped
public class LoginController extends BaseController {

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
        final UserAuthenticationRequest userAuthenticationRequest = new UserAuthenticationRequest(username, password);
        try {
            getUserFacade().authenticateUser(userAuthenticationRequest);
        } catch (final UserException userException) {
            System.out.println(userException);
        }
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
     * @param username the new username
     */
    public void setUsername(final String username) {
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
     * @param password the new password
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    public UIComponent getSubmitControl() {
        return submitControl;
    }

    public void setSubmitControl(final UIComponent submitControl) {
        this.submitControl = submitControl;
    }

}
