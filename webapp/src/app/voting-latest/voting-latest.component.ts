import {Component, OnInit} from '@angular/core';
import {Vote} from "../voting.model";
import {VotingService} from "../voting.service";

@Component({
  selector: 'app-voting-latest',
  templateUrl: './voting-latest.component.html',
  styleUrls: ['./voting-latest.component.css']
})
export class VotingLatestComponent implements OnInit {
  votes: Array<Vote>;

  constructor(private votingService: VotingService) {
  }

  ngOnInit(): void {
    this.updateLatest();
    setInterval(() => this.updateLatest(), 5000);
  }

  updateLatest() {
    this.votingService.getLatest().subscribe(dto => this.votes = dto.votes);
  }
}
