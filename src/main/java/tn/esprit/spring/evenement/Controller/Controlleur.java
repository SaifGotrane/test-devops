package tn.esprit.spring.evenement.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.evenement.Entity.Evenement;
import tn.esprit.spring.evenement.Entity.Participant;
import tn.esprit.spring.evenement.Service.IService;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class Controlleur {
    @Autowired
    IService service;

    @PostMapping("ajouterParticipant")
    public Participant ajouterParticipant(@RequestBody Participant p) {
        return service.ajouterParticipant(p);
    }

    @PostMapping("ajoutAffectEvenParticip")
    public Evenement ajoutAffectEvenParticip(@RequestBody Evenement e) {
        return service.ajoutAffectEvenParticip(e);
    }
}
