package model;

import java.util.Date;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.jws.WebService;

@Stateless(name = "DateService", mappedName = "ProskuryakovOrderManagerADF-Model-DateService")
@WebService(name = "DateServiceWs", serviceName = "DateServiceWs", targetNamespace = "http://tempuri.org/",
            portName = "DateServiceWsPort")
public class DateServiceBean implements DateService, DateServiceLocal {
    @Resource
    SessionContext sessionContext;

    public DateServiceBean() {
    }
    
    public Date getDate(){
        return new Date();
    }
}
