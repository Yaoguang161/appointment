//
// Created by Asaki on 2021/2/2.
//
#include<bits/stdc++.h>
using namespace std;
int a[10000],k[10000]; //数组必须要开的足够大,很多测试数据比较大,只用例数据容易丢分
int  main(){
    int n,m;
    cin>>n>>m;
    for(int i = 0 ;i <n;i++){
        cin>>a[i];
    }
    for(int i=0;i<=n-m;i++){
        for(int j = i; j<i+m;j++){
          k[i]=k[i]+a[j];
        }
    }
    sort(k,k+n-m);
    cout<<k[0];
    return 0;
}
