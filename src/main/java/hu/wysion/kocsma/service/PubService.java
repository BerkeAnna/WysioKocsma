package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.entity.Pub;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PubService {
    public List<Pub> getPub() {
        return List.of(
                new Pub(
                        1L,
                        new Date("2022-02-11"),
                        new Date("2022-02-12"),
                        true,
                        new Guest(2L, "Lali", "Gyémántmáj", 51.2, List.of(), List.of()),
                        List.of()
                )
        );
    }
}
