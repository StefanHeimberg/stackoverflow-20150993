package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("history")
public class HistoryAPI {
    
    private static final Logger LOG = Logger.getLogger(HistoryAPI.class.getName());
    
    @PostConstruct
    public void init() {
        LOG.severe("HistoryAPI.init() called");
    }

    @Inject
    private History history;
    
    @GET
    public String doSomething() {
        LOG.log(Level.SEVERE, "HistoryAPI.doSomething() called");
        return history.doSomething();
    }

}
