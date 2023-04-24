import { Directive, ElementRef, Input } from '@angular/core';

@Directive({
  selector: '[appClass]'
})

/*
  * To customise element of the html using this custom directive.
  * use the above select and insert in an html tag to apply it.
  *  e.g <h3 AppClass>
  *           Some Title Comes Here!
  *       </h3>
  * 
  * on the .ts file
  * A back customization can be applied
  *   ...
  *   this.element.nativeElement.style.background = "blue";
  *   ...
  */
export class ClassDirective 
{
  constructor(private element: ElementRef) 
  { 
    //Accessing html element. can be sttyled from here.
    //this.element.nativeElement.style.backgroundColor = this.backgroundColor;
  }

  @Input() set backgroundColor(value: string){
    this.element.nativeElement.style.backgroundColor = value;
  }
}
