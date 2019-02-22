import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import {DonateComponent} from "src/app/donate/donate.component";
import { PostListComponent } from "./posts/post-list/post-list.component";
import { PostCreateComponent } from "./posts/post-create/post-create.component";
import { LoginComponent } from "./auth/login/login.component";
import { HomepageComponent } from './homepage/homepage.component';
import { SignupComponent } from "./auth/signup/signup.component";
import { AuthGuard } from "./auth/auth.guard";
import { FooterComponent } from './footer/footer.component';
import { PaymentPaypalGatewayComponent } from './payment-paypal-gateway/payment-paypal-gateway.component';
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { EventsComponent } from './events/events.component';
import { AboutComponent } from './about/about.component';
import { GalleryComponent } from './gallery/gallery.component';
const routes: Routes = [
  { path: "homepage",  component: HomepageComponent },
  {path: '', redirectTo: '/homepage', pathMatch: 'full'},
  { path: "dashboard", component: PostListComponent },
  { path: "create", component: PostCreateComponent, canActivate: [AuthGuard] },
  { path: "edit/:postId", component: PostCreateComponent, canActivate: [AuthGuard] },
  { path: "login", component: LoginComponent },
  { path: "signup", component: SignupComponent },
  {path : "donate" , component:DonateComponent},
  {path : "events" , component:EventsComponent},
  {path : "about" , component:AboutComponent},
  {path : "gallery" , component:GalleryComponent},
  {path:"paypal-payment-checkout", component: PaymentPaypalGatewayComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: [AuthGuard]
})
export class AppRoutingModule {}
