package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Consumption;
import hu.wysion.kocsma.entity.Drink;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    public List<Drink> getDrink() {
        return List.of(
                new Drink(
                        1L,
                        "KarcsisDrink",
                        12.2,
                        30.0,
                        new Consumption()


                )
        );
    }
}
