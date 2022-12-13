package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.entity.Pub;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PubService {
    public List<Pub> getPub() {
        return List.of(
                new Pub(
                        1L,

                        //TODO: LocalDate
                        LocalDateTime.of(2000, 8, 1, 10, 1),
                        LocalDateTime.of(2000, 9, 1, 10, 3),
                        true,
                        new Guest(2L, "Lali", "Gyémántmáj", 51.2, List.of(), List.of()),
                        List.of()
                )
        );
    }
}
