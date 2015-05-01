package uk.co.techblue.controller;

import javax.inject.Inject;

import uk.co.techblue.common.core.interfaces.HelpDeskReviewalFacade;
import uk.co.techblue.common.core.interfaces.UserFacade;
import uk.co.techblue.web.interfaces.FacadeWrapper;

/**
 * The Class BaseController.
 */
public class BaseController {

    /** The facade wrapper. */
    @Inject
    private FacadeWrapper facadeWrapper;

    /**
     * Gets the user facade.
     * 
     * @return the user facade
     */
    public UserFacade getUserFacade() {
        return facadeWrapper.getUserFacade();
    }

    /**
     * Gets the help desk reviewal facade.
     * 
     * @return the help desk reviewal facade
     */
    public HelpDeskReviewalFacade getHelpDeskReviewalFacade() {
        return facadeWrapper.gethelpdeSkDeskReviewalFacade();
    }

}
