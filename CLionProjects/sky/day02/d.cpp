//
// Created by Asaki on 2020/11/14.
//

#include <bits/stdc++.h>
using namespace std;
 int n, m,i, f[33],p[10];
int main(){
      cin>>n;
      for( i=1;i<=7;i++){
          cin>>m;
          f[m]=1;    //出现错误。写成p[i]
      }
      for(int i=1;i<=n;i++){
          int sum=0;
          for(int j=1;j<=7;j++){
              cin>>m;
              if(f[m]==1){
                  sum++;
              }
          }
          p[sum]++;
      }
      for(i=7;i>=1;i--){
          cout<<p[i]<<" ";
      }
    return 0;
}