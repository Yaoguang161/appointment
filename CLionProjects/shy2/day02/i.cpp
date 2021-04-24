//
// Created by Asaki on 2020/11/14.
//

#include <bits/stdc++.h>
using namespace std;
int main(){
    int n=1000;
         for(int i=7;i<=n;i++){
             if(i%7==0){
                 if(i%6==5){
                     if(i%5==4){
                         if(i%4==3){
                             if(i%3==2){
                                 if(i%2==1){
                                     cout<<"则最小值为"<<i<<endl;
                                     break;
                                 }
                             }
                         }
                     }
                 }
             }
         }
    return 0;
}