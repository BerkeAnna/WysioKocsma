package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    public List<Guest> getGuest() {
        return List.of(
                new Guest(
                        1L,
                        "Karcsi",
                        "Gyémántmáj",
                        52.0,
                        List.of(),
                        List.of()

                )
        );
    }
}
