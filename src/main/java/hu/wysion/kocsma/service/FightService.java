package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Fight;
import hu.wysion.kocsma.entity.Guest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FightService {

    @GetMapping
    public List<Fight> getFight() {
        return List.of(
                new Fight(
                        1L,
                        LocalDateTime.of(2000, 5, 1, 11, 2),
                        LocalDateTime.of(2000, 5, 1, 11, 9),
                        new Guest(1L, "Lala", "Gyémántmáj", 51.2, List.of(), List.of()),
                        List.of()


                )
        );
    }
}
