package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Fight;
import hu.wysion.kocsma.service.FightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "fight")
public class FightController {
    @Autowired
    private FightService fightService;

    @GetMapping
    private List<Fight> getFight() {
        return fightService.getFight();
    }
}
