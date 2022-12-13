package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @PostMapping("/saveGuest")
    private Guest saveGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }

    @GetMapping("/fetchGuests")
    public List<Guest> fetchGuestList() {
        return guestService.fetchGuestList();
    }

    @GetMapping("/fetchGuestById/{id}")
    public Guest fetchGuestById(@PathVariable("id") Long guestId) {
        return guestService.fetchGuestById(guestId);
    }

    @PutMapping("/updateGuest/{id}")
    public Guest updateGuest(@RequestBody Guest guest,
                             @PathVariable("id") Long guestId) {
        return guestService.updateGuest(guest, guestId);
    }

    @DeleteMapping("/deleteGuest/{id}")
    public String deleteGuestById(@PathVariable("id") Long guestId) {
        guestService.deleteGuestByID(guestId);

        return "Deleted successfully";
    }
}
