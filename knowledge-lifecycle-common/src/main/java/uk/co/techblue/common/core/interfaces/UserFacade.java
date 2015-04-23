package uk.co.techblue.common.core.interfaces;

import uk.co.techblue.common.dto.user.UserAuthenticationRequest;
import uk.co.techblue.common.exception.UserException;

public interface UserFacade {

    Boolean authenticateUser(UserAuthenticationRequest userAuthenticationRequest) throws UserException;

}
