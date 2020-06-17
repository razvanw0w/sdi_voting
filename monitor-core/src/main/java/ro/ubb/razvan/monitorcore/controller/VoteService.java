package ro.ubb.razvan.monitorcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.razvan.monitorcore.model.CountyVote;
import ro.ubb.razvan.monitorcore.repository.CountyVoteRepository;

@Service
public class VoteService {
    @Autowired
    CountyVoteRepository repository;

    public void saveVote(String name, int a, int b, int c, int nr) {
        CountyVote countyVote = CountyVote.builder()
                .id(0L)
                .name(name)
                .a(a)
                .b(b)
                .c(c)
                .nr(nr)
                .build();
        repository.save(countyVote);
    }
}
