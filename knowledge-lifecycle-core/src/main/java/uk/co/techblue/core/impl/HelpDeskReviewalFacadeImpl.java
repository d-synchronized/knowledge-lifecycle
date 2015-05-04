package uk.co.techblue.core.impl;

import java.util.List;

import javax.inject.Inject;
import javax.xml.namespace.QName;

import org.kie.api.task.model.TaskSummary;
import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;
import org.switchyard.component.bpm.runtime.BPMTaskService;
import org.switchyard.component.bpm.runtime.BPMTaskServiceRegistry;

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

        final BPMTaskService bpmTaskService = BPMTaskServiceRegistry.getTaskService(null, new QName("urn:uk.co.techblue:knowledge-lifecycle-core:1.0", "HelpDeskService"));
        final List<TaskSummary> tasks = bpmTaskService.getTasksAssignedAsPotentialOwner("Dishant Anand", "en-UK");

        final TicketReviewInfo ticketReviewInfo = new TicketReviewInfo();
        ticketReviewInfo.setTicketId(1L);
        ticketReviewInfo.setDeveloperName("Dishant Anand");

        final Ticket ticket = new Ticket();
        ticket.setTicketId(1L);
        helpDeskService.startHelpDeskReviewalProcess(ticket);
        return false;
    }

}
