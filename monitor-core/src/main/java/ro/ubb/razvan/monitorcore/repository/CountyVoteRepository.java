package ro.ubb.razvan.monitorcore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ubb.razvan.monitorcore.model.CountyVote;

import java.util.List;

public interface CountyVoteRepository extends JpaRepository<CountyVote, Long> {
    @Query("select v from CountyVote v where v.id in (select max(vote.id) from CountyVote vote group by vote.name)")
    public List<CountyVote> findLatestVotes();
}
