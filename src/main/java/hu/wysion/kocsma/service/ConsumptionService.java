package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Consumption;
import hu.wysion.kocsma.entity.Drink;
import hu.wysion.kocsma.entity.Pub;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionService {
    public List<Consumption> getConsumption() {
        return List.of(
                new Consumption(
                        1L,
                        new Drink(1L, "KarcsisDrink", 12.2, 14.2, new Consumption()),
                        15,
                        new Pub()

                )
        );
    }
}
