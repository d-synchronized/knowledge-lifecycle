package uk.co.techblue.common.dto.user;

/**
 * The Class UserAuthenticationRequest.
 */
public class UserAuthenticationRequest {

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /**
     * Instantiates a new user authentication request.
     * 
     * @param username the username
     * @param password the password
     */
    public UserAuthenticationRequest(final String username, final String password) {
        this.username = username;
        this.password = password;
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

}
