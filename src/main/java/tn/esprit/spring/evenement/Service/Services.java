package tn.esprit.spring.evenement.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.evenement.Entity.Evenement;
import tn.esprit.spring.evenement.Entity.Participant;
import tn.esprit.spring.evenement.Repository.EvenementRepository;
import tn.esprit.spring.evenement.Repository.LogistiqueRepository;
import tn.esprit.spring.evenement.Repository.ParticipantRepository;

@Slf4j
@AllArgsConstructor
@Service
public class Services implements IService{
    @Autowired
    ParticipantRepository participantRepository;
    @Autowired
    LogistiqueRepository logistiqueRepository;
    @Autowired
    EvenementRepository evenementRepository;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participantRepository.save(p);
    }

    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        return evenementRepository.save(e);
    }
}
