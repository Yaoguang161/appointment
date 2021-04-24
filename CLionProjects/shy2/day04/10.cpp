#include<bits/stdc++.h>
using namespace std;
int js[10];
int  main(){
    int n;
    int m;
    cin>>n>>m;
    for(int i =n ; i<=m;i++){
      for(int j=i;j;j=j/10){
            js[j%10]++;
      }
    }
    for(int i =0;i<=9;i++){
        cout<<js[i]<<" ";
    }

    return 0;
}