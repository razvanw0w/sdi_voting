package ro.ubb.razvan.monitorcore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.ubb.razvan.monitorcore.model.CountyVote;

public interface CountyVoteRepository extends JpaRepository<CountyVote, Long> {
}
