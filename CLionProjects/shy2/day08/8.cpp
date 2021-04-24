//
// Created by Asaki on 2021/3/4.
//简单斐波那契 自写+更改

#include<iostream>
#include<cstdio>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cin>>n;
    int f[46];
    f[0]=0;f[1]=1;
    for(int i=2;i<n;i++){
        f[i]=f[i-1]+f[i-2];
    }
    for(int i = 0;i<n;i++){
        cout<<f[i]<<" ";
    }

    return 0;
}