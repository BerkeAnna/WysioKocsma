package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "consumption")
public class ConsumptionController {
    @Autowired
    private GuestService guestService;


}
