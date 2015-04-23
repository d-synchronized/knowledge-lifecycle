package uk.co.techblue.web.impl;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import uk.co.techblue.common.core.interfaces.UserFacade;
import uk.co.techblue.web.interfaces.FacadeWrapper;

/**
 * The Class FacadeWrapperImpl.
 */
@Service(FacadeWrapper.class)
public class FacadeWrapperImpl implements FacadeWrapper {

    /** The user facade. */
    @Inject
    @Reference
    private UserFacade userFacade;

    /**
     * Gets the user facade.
     * 
     * @return the user facade
     */
    @Override
    public UserFacade getUserFacade() {
        return userFacade;
    }

}
