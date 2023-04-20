import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'PasswordGeneratorApp';
  password = "";

  onButtonClick(){
    this.password = "update password.";
  }

  getPassword(){
    return this.password;
  }
}
