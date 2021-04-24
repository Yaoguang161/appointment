//
// Created by Asaki on 2021/3/7.
//1204. 错误票据  四届蓝桥杯  暴力解法 超时
#include<bits/stdc++.h>
using namespace std;
const int N=1e6+10;
int ans[N],Max,Min=N;
int q,c;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;){
        int id;
        cin>>id;
        ans[id]++;
        if(id>Max)   Max=id;
        if(id<Min)   Min=id;
        if(getchar()=='\n') i++;
    }
    for(int i =Min;i<=Max;i++){
        if(ans[i]==0) q=i;
        if(ans[i]>1) c=i;
    }
    cout<<q<<" "<<c;

    return 0;
}