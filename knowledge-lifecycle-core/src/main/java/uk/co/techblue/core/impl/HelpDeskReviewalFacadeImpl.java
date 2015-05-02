package uk.co.techblue.core.impl;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import uk.co.techblue.common.core.interfaces.HelpDeskReviewalFacade;
import uk.co.techblue.common.core.interfaces.HelpDeskService;
import uk.co.techblue.common.dto.Ticket;
import uk.co.techblue.common.dto.TicketReviewInfo;

/**
 * The Class HelpDeskReviewalFacadeBean.
 */
@Service(HelpDeskReviewalFacade.class)
public class HelpDeskReviewalFacadeImpl implements HelpDeskReviewalFacade {

    /** The help desk service. */
    @Inject
    @Reference
    private HelpDeskService helpDeskService;

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.common.core.interfaces.HelpDeskReviewalFacade#startReviewalProcess(java.lang.Long)
     */
    @Override
    public Boolean startReviewalProcess(final Long ticketId) {
        final TicketReviewInfo ticketReviewInfo = new TicketReviewInfo();
        ticketReviewInfo.setTicketId(1L);
        ticketReviewInfo.setDeveloperName("Dishant Anand");

        final Ticket ticket = new Ticket();
        ticket.setTicketId(1L);
        helpDeskService.startHelpDeskReviewalProcess("app-tick-123");
        return false;
    }

}
