//u表示当前枚举到哪个位置,start表示从哪个数开始枚举
// Created by Asaki on 2021/3/7.
//93. 递归实现组合型枚举
#include<iostream>
#include<cstdio>
#include<algorithm>
#include<cstring>
using namespace std;
const int N=30;
int n,m;

int way[N];
void dfs(int u,int start){
    if(u==m+1){
        for(int i=1;i<=m;i++){
            cout<<way[i]<<" ";
        }
        cout<<endl;
        return;
    }
    for(int i=start;i<=n;i++){
         way[u]=i;
         dfs(u+1,i+1);
         way[u]=0;
    }
}
int main(){
    cin>>n>>m;
    dfs(1,1);
    return 0;
}
