//
// Created by Asaki on 2021/3/4.
//717. 简单斐波那契
#include<bits/stdc++.h>
using namespace std;
int fb[50];
int main(){
    int n;
    cin>>n;
    fb[0]=1;
    cout<<fb[1]<<' ';
    for(int i=2;i<=n;i++){
        fb[i]=fb[i-1]+fb[i-2];
        cout<<fb[i]<<' ';
    }

    return 0;
}

