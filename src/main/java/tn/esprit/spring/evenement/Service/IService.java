package tn.esprit.spring.evenement.Service;

import tn.esprit.spring.evenement.Entity.Evenement;
import tn.esprit.spring.evenement.Entity.Participant;

public interface IService {
    Participant ajouterParticipant (Participant p);
    Evenement ajoutAffectEvenParticip (Evenement e);
}
