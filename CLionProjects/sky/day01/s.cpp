//
// Created by Asaki on 2020/11/4.
//P1035级数求和
#include <bits/stdc++.h>
using namespace std;
int main(){
    int k;
    int n;
    double sum=0;
    cin>>k;
     for( n=1;;n++){
          sum=sum+1.0/n;
          if(sum>k*1.0){
              break;
          }
     }
     cout<<n;
    return 0;
}
