package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class History {
    
    private static final Logger LOG = Logger.getLogger(History.class.getName());
    
    @PostConstruct
    public void init() {
        LOG.severe(" ===> History.init() called");
    }
    
    public String doSomething() {
        LOG.log(Level.SEVERE, " ===> History.doSomething() called ");
        return "something done";
    }
    
}
