//
// Created by Asaki on 2021/2/2.
//
#include<bits/stdc++.h>
using namespace std;
int a[100];
int  main(){
    int s=0;
    for(int x=1;x<5;x++){
        cin>>a[x];
    }
    for( int i = 1;i<5;i++){
        s=s+a[i];
    }
    cout<<"和为"<<s;
    return 0;
}