package hu.wysion.kocsma.controller;

import hu.wysion.kocsma.entity.Pub;
import hu.wysion.kocsma.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "pub")
public class PubController {
    @Autowired
    private PubService pubService;

    @GetMapping
    private List<Pub> getPub() {
        return pubService.getPub();
    }
}

