package uk.co.techblue.core.impl;

import org.switchyard.component.bean.Service;

import uk.co.techblue.common.core.interfaces.UserFacade;
import uk.co.techblue.common.dto.user.UserAuthenticationRequest;
import uk.co.techblue.common.exception.UserException;

/**
 * The Class UserFacadeImpl.
 */
@Service(UserFacade.class)
public class UserFacadeImpl implements UserFacade {

    /*
     * (non-Javadoc)
     * 
     * @see
     * uk.co.techblue.common.core.interfaces.UserFacade#authenticateUser(uk.co.techblue.common.dto.user.UserAuthenticationRequest
     * )
     */
    @Override
    public Boolean authenticateUser(final UserAuthenticationRequest userAuthenticationRequest) throws UserException {
        System.out.println("Authenticating the user against the consumer key '" + userAuthenticationRequest.getUsername() + "' consumer secret '"
            + userAuthenticationRequest.getPassword() + "'");
        return false;
    }

}
