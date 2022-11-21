package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Drink;
import hu.wysion.kocsma.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "drink")
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping
    private List<Drink> getDrink() {
        return drinkService.getDrink();
    }
}
