package tn.esprit.spring.evenement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.evenement.Entity.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
