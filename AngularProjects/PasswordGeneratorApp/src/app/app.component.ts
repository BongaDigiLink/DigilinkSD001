import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent 
{
  title = 'PasswordGeneratorApp';
  password = '';
  includeLetters = false;
  includeNumbers = false;
  includeSymbols = false;
  length = 0;

  onButtonClick()
  {
    const numbers = '1234567890';
    const letters = 'abcdefghijklmnopqrstuvwxyz';
    const symbols = '!@#$%^&*()_+';

    let validchars = '';

    if(this.includeLetters)
    {
      validchars += letters;
    }

    if(this.includeNumbers)
    {
      validchars += numbers;
    }

    if(this.includeSymbols)
    {
      validchars += symbols;
    }

    let generatedPassword = '';
    for( let i = 0; i < this.length; i++)
    {
      const index = Math.floor(Math.random() * validchars.length)

      generatedPassword += validchars[index];
    }

    this.password = generatedPassword;
  }

  getPassword()
  {
    return this.password;
  }

  onChangeUseLetters()
  {
    this.includeLetters = !this.includeLetters;
  }

  onChangeNumbers()
  {
    this.includeNumbers = !this.includeLetters;
  }

  onChangeSymbols()
  {
    this.includeSymbols = !this.includeSymbols;
  }

  onInputCharacters(value:string)
  {
    const parsedvalue = parseInt(value);

    if(isNaN(parsedvalue))
    {
      //Show some error here.
    }
    this.length = parsedvalue;
  }
}
