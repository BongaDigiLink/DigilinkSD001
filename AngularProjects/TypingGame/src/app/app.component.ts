import { Component } from '@angular/core';
import { lorem } from "faker";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'TypingGame';
  randomSentence = lorem.sentence();
  enteredtext = "";

  onType(value:string)
  {
    //console.log("vaules");
    this.enteredtext = value;
  }

  compareChars(randomLetter: string, enterLetter:string){
    if(!enterLetter)
    {
      return 'pending';
    }

    //itenerary function.
    return randomLetter === enterLetter ? 'correct': 'incorrect';
  }

}
