import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { QualificationPageComponent } from './qualification-page/qualification-page.component';

@NgModule({
  declarations: [
    AppComponent,
    QualificationPageComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
