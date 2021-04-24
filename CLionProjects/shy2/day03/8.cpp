//
// Created by Asaki on 2020/12/17.
//P5709 【深基2.习6】Apples Prologue
//没有考虑完整
#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    int m,t,s;
    cin>>m>>t>>s;
    if(t==0){
        cout<<0<<endl;
        return 0;
    }
    if(s%t==0){
        cout<<max(m-s/t,0)<<endl;
    }
    else{
        cout<<max(m-s/t-1,0)<<endl;
    }
    return 0;
}
