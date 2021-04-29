//
// Created by Asaki on 2020/11/14.
//P1047 校门外的树 题解

#include <bits/stdc++.h>
using namespace std;
int main(){
     int i,j,L,a[2],b[10001],M,count=0;
     cin>>L>>M;
     for(i=0;i<=L;i++) {
         b[i] = 0;
     }
     for(i=1;i<=M;i++) {
         for (j = 0; j < 2; j++) {
             cin >> a[j];
         }
         for (j = 0; j <= L; j++)
             if (j >= a[0] && j <=a[1]) {
                 b[j] = 1;
             }
     }
     for(i=0;i<=L;i++){
         if(b[i]==0)
             count++;
     }
     cout<<count;

    return 0;
}