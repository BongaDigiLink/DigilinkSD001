import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'PaginationApp';
  currentPage = 0;

  // getClass()
  // {
  //   if()
  //   {
  //     return 'active';
  //   }
  // }

  checkWindowIndex(index : number){
    //return Math.abs( this.currentPage - index) : 5;
  }

  images = 
  [
    {
      title:"Serenity. The Forest in the Morning.",
      url:"https://images.pexels.com/photos/16102230/pexels-photo-16102230.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    },
    {
      title:"A child. Stressless",
      url:"https://images.pexels.com/photos/16041156/pexels-photo-16041156.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    },
    {
      title:"Is this a Cliff? It's beautiful!",
      url:"https://images.pexels.com/photos/3876316/pexels-photo-3876316.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    },
    {
      title:"A Confectionery",
      url:"https://images.pexels.com/photos/12329780/pexels-photo-12329780.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    },
    {
      title:"There's nothing like a good book and a Cup of Coffee.",
      url:"https://images.pexels.com/photos/6802962/pexels-photo-6802962.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    }
  ]


}
