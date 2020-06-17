import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {VotingAllComponent} from "./voting-all/voting-all.component";


const routes: Routes = [
  {path: 'voting/all', component: VotingAllComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
