import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  payeeName: string;
  dateSelect: string;
  currencySelect: number;
  numberSelect: number;

  onChangePayee(value: string){
    this.payeeName = value;
  }

  onChangeDate(value: string){
    this.dateSelect = value;
  }

  onChangeCurrency(value: string){
    this.currencySelect = parseFloat(value);
  }

  onChangeNumber(value: string){
    this.numberSelect = parseInt(value);
  }

}
