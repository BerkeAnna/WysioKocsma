package hu.wysion.kocsma;

import hu.wysion.kocsma.entity.Guest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("api")
public class swGuest {

    ConcurrentMap<String, Guest> guests = new ConcurrentHashMap<>();

    @GetMapping("a")
    public Guest getGuest(@PathVariable Long id) {
        return guests.get(id);
    }

    @GetMapping("s")
    public String write() {
        return "guest";
    }

}
