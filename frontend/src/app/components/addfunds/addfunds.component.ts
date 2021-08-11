import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GetDataService } from 'src/app/services/get-data.service';

@Component({
  selector: 'app-addfunds',
  templateUrl: './addfunds.component.html',
  styleUrls: ['./addfunds.component.css']
})
export class AddfundsComponent implements OnInit {

  quantity = '';
  companyDetails;
  companyId;
  constructor(private router: Router, private getDataservice: GetDataService, private _Activatedroute:ActivatedRoute) { }

  ngOnInit() {
    // this._Activatedroute.paramMap.subscribe(params => { 
    //   this.companyId = params.get('id'); 
    //   });

    //   this.getDataservice.getMyShares(localStorage.getItem('username'))
    //   .subscribe(
    //     data => {
    //         for(let i=0;i<data.length;i++)
    //         {
    //           if(data[i].company_id==this.companyId)
    //           {
    //             this.companyDetails = data[i];
    //           }
    //         }
            
    //     },
    //     error => {
    //         console.log(error)
    //     }
    //   )
  }

  updateUserFunds(){
    //take input value from localstorage and toasterrr msg
    // this.toastr.success('Successfully removed from your Watchlist', companyName,{positionClass:"toast-bottom-center"});
    console.log("funds updated");
    this.router.navigate(['profile'])
  }
}
