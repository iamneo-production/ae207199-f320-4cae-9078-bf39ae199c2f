import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardcorrectionComponent } from './cardcorrection/cardcorrection.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'card-correction',
    pathMatch: 'full',
  },
  {
    path: 'card-correction',
    component: CardcorrectionComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
