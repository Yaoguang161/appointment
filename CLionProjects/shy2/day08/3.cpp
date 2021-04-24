//
// Created by Asaki on 2021/3/4.
//AcWing 93. 递归实现组合型枚举
#include<bits/stdc++.h>
using namespace std;

const int N=40;

int n,m;
int way[N];

void dfs(int u,int start){
    if(u==m+1){
        for(int i=1;i<=m;i++){
            cout<<way[i];
        }
        puts("");
        return;
    }
    for(int i =start;i<=n;i++){
        way[u]=i;
        dfs(u+1,i+1);
        way[u]=0;                   //恢复现场
    }
}

int main(){
    cin>>n>>m;
    dfs(1,1);
    return 0;
}

