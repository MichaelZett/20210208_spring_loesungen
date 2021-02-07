package de.zettsystems.application;

import org.springframework.beans.factory.annotation.Autowired;

public class ZettService {
    private final String name;
    private TheOtherService theOtherService;

    public ZettService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setTheOtherService(TheOtherService theOtherService) {
        this.theOtherService = theOtherService;
    }

    public void callTheOtherService(){
        theOtherService.callMe();
    }
}
