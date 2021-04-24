//
// Created by Asaki on 2020/11/4.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
    int k;
    double sum=0;
    int n=0;
    cin>>k;
    do{
        n++;
        sum+=1.0/n;
        if(sum>1.0*n){
           break;
        }
    }while(k>=sum);
    cout<<n;
    return 0;
}
