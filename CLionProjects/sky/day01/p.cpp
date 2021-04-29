//
// Created by Asaki on 2020/11/4.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
    int n,k,x=0,y=0;
    double suma=0,sumb=0;
    cin>>n>>k;
    for(int i=1;i<=n;i++){
        if(i%k==0){
            x=x+1;
            suma=suma+i;
        } else{
            y=y+1;
            sumb=sumb+i;
        }
    }
    printf("%.1lf %.1lf",suma*1.0/x, sumb*1.0/y);
    return 0;
}
