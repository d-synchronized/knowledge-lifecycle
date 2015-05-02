package uk.co.techblue.core.impl;

import org.switchyard.component.bean.Service;

import uk.co.techblue.common.core.interfaces.TicketManagementService;
import uk.co.techblue.common.dto.TicketAcknowledgement;

/**
 * The Class TicketManagementServiceImpl.
 */
@Service(TicketManagementService.class)
public class TicketManagementServiceImpl implements TicketManagementService {

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.common.core.interfaces.TicketManagementService#openTicket()
     */
    @Override
    public String startHelpDeskReviewalProcess(final String ticketId) {
        final TicketAcknowledgement ticketAcknowledgement = new TicketAcknowledgement();
        ticketAcknowledgement.setOpenedSuccessfully(true);
        System.out.println("Opening the ticket after validating it's status");
        // ticketAcknowledgement.setTicketId(ticket.getTicketId());
        return "true";
    }

}
