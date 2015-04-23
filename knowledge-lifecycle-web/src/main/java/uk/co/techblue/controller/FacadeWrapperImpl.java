package uk.co.techblue.controller;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import uk.co.techblue.data.UserFacade;

@Service(FacadeWrapper.class)
public class FacadeWrapperImpl implements FacadeWrapper {

    @Inject
    @Reference
    private UserFacade userFacade;

}
