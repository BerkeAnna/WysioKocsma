package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    private List<Guest> getGuest() {
        return guestService.getGuest();
    }
}
