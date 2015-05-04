package uk.co.techblue.core.impl;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

import uk.co.techblue.common.core.interfaces.TicketManagementService;
import uk.co.techblue.common.dto.Ticket;
import uk.co.techblue.common.dto.TicketAcknowledgement;

/**
 * The Class TicketManagementServiceImpl.
 */
@Service(TicketManagementService.class)
public class TicketManagementServiceImpl implements TicketManagementService {

    private static final Logger LOGGER = Logger.getLogger(TicketManagementServiceImpl.class);

    @Override
    public TicketAcknowledgement openTicket(final Ticket ticket) {
        log("opening ticket");
        ticket.setStatus("opened");
        final TicketAcknowledgement ticketAcknowledgement = new TicketAcknowledgement();
        ticketAcknowledgement.setTicketId(ticket.getTicketId());
        ticketAcknowledgement.setOpenedSuccessfully(true);
        return ticketAcknowledgement;
    }

    @Override
    public void approveTicket(final Ticket ticket) {
        log("approving ticket");
        ticket.setStatus("approved");
    }

    @Override
    public void closeTicket(final Ticket ticket) {
        log("closing ticket");
        ticket.setStatus("closed");
    }

    @Override
    public void requestDetails(final Ticket ticket) {
        log("requesting details");
        ticket.setStatus("requested");
    }

    @Override
    public void rejectTicket(final Ticket ticket) {
        log("rejecting ticket");
        ticket.setStatus("rejected");
    }

    private void log(final String msg) {
        LOGGER.info("********** " + msg + " **********");
    }

}
