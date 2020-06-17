package ro.ubb.razvan.monitorweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.razvan.monitorcore.controller.VoteService;
import ro.ubb.razvan.monitorweb.dto.VoteDTO;

@RestController
public class VotingRestController {
    @Autowired
    VoteService voteService;

    @GetMapping(value = "/voting")
    void test() {
        System.out.println("reached!");
    }

    @PostMapping(value = "/voting")
    void receiveVotingInfo(@RequestBody VoteDTO dto) {
        System.out.println(
                String.format("%s,%d,%d,%d,%d", dto.getName(),
                        dto.getA(),
                        dto.getB(),
                        dto.getC(),
                        dto.getNr())
        );
        voteService.saveVote(dto.getName(), dto.getA(), dto.getB(), dto.getC(), dto.getNr());
    }
}
