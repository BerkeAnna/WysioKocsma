package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Fight;
import hu.wysion.kocsma.entity.Guest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Service
public class FightService {

    @GetMapping
    public List<Fight> getFight() {
        return List.of(
                new Fight(
                        1L,
                        new Date("2022-11-15"),
                        new Date("2022-11-16"),
                        new Guest(1L, "Lala", "Gyémántmáj", 51.2, List.of(), List.of()),
                        List.of()


                )
        );
    }
}
