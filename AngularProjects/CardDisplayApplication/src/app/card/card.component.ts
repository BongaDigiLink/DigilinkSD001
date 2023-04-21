//Instruct component how to recieve inputs from app.comp
import { Component , Input} from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  @Input() title = "";
  @Input() imageUrl = "";
  @Input() content = "";
  @Input() username = "";

}
