//
// Created by Asaki on 2020/10/30.
//洛谷P5710

#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    cout<<(n%100&&!(n%4)||!(n%400));
    return 0;
}