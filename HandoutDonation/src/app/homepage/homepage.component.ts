import { Component, OnInit } from '@angular/core';
import { DomSanitizer, SafeStyle } from '@angular/platform-browser';
import { Router } from "@angular/router";
@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {
  private photo: SafeStyle;
  private photo_1: SafeStyle;
  constructor(private sanitizer: DomSanitizer , private router : Router) { }

  ngOnInit()
   {
    this.photo_1 = '/assets/fitness_goals.jpg'
  }
 
}
