import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CardDisplayApplication';

  posts = [
    {
      title:"Star Link,Network",
      imageUrl :"assets/biking.jpeg",
      username:"elon_musk",
      content:"Star Link now available in South Africa."
    },
    {
      title:"SpaceX explosion",
      imageUrl :"assets/biking.jpeg",
      username:"tesla",
      content:"Star Ship, exlpodes mid air during tests flight"
    },
    {
      title:"Maguire",
      imageUrl :"assets/biking.jpeg",
      username:"epl",
      content:"Astonishing consistency!"
    },
    {
      title:"Loadshedding",
      imageUrl :"assets/biking.jpeg",
      username:"eskom",
      content:"Horrific SA grid!"
    }
  ]
}
