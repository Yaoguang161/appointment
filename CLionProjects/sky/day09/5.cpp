//
// Created by Asaki on 2021/3/7.
//翻硬币       递归练习题
#include<iostream>
#include <cstdio>
#include <cstring>

using namespace std;
const int N=110;
int n;
char start[N],aim[N];

void turn(int i){
    if(start[i]=='*'){
        start[i]='o';
    } else{
        start[i]='*';
    }
}
int main(){
    cin>>start>>aim;
    n=strlen(start);

    int res=0;
    for(int i=0;i<n-1;i++){
        if(start[i]!=aim[i]){
            turn(i),turn(i+1);
            res++;
        }
    }
    cout<<res<<endl;
    return 0;
}
