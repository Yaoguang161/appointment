//
// Created by Asaki on 2021/3/4.
//717. 简单斐波那契
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    int a=0,b=1,c;
    cin>>n;
    while(n--){
        cout<<a<<endl;
        c=a+b;
        a=b,b=c;
    }
    return 0;
}

