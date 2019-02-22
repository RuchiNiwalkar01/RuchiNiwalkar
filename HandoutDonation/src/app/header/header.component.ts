import { Component, OnInit, OnDestroy } from "@angular/core";
import { Subscription } from "rxjs";
import { AuthData } from "src/app/auth/auth-data.model";
import { AuthService } from "../auth/auth.service";

@Component({
  selector: "app-header",
  templateUrl: "./header.component.html",
  styleUrls: ["./header.component.css"]
})
export class HeaderComponent implements OnInit, OnDestroy {
  public firstnamehere: string;
  userIsAuthenticated = false;
  private authListenerSubs: Subscription;
  public username : string;
  constructor(private authService: AuthService) {}

  ngOnInit() {
   console.log();
    this.username = this.authService.getUserId();
    console.log(this.username);
    this.userIsAuthenticated = this.authService.getIsAuth();
    this.authListenerSubs = this.authService
      .getAuthStatusListener()
      .subscribe(isAuthenticated => {
        this.userIsAuthenticated = isAuthenticated;
      });
  }

  onLogout() {
    this.username = this.authService.getUserId();
    console.log(this.username);
    this.authService.logout();
  }

  ngOnDestroy() {
    this.authListenerSubs.unsubscribe();
  }
}
