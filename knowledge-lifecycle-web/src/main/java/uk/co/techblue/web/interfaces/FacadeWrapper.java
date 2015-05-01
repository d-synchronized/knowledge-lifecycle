package uk.co.techblue.web.interfaces;

import uk.co.techblue.common.core.interfaces.HelpDeskReviewalFacade;
import uk.co.techblue.common.core.interfaces.UserFacade;

/**
 * The Interface FacadeWrapper.
 */
public interface FacadeWrapper {

    /**
     * Gets the user facade.
     * 
     * @return the user facade
     */
    UserFacade getUserFacade();

    /**
     * Gets the helpde sk desk reviewal facade.
     * 
     * @return the helpde sk desk reviewal facade
     */
    HelpDeskReviewalFacade gethelpdeSkDeskReviewalFacade();

}
