package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "consumption")
public class ConsumptionController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    private List<Guest> getGuest() {
        return guestService.getGuest();
    }
}
