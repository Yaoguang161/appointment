//
// Created by Asaki on 2021/3/7.
//
#include<iostream>
#include<cstdio>
using namespace std;

const int N=20;

int n;

bool st[N];

void dfs(int u){
    if(u>n){         //叶子节点
        for(int i=1;i<=n;i++){
            if(st[i]){
                cout<<i<<' ';
            }
        }
        cout<<endl;
        return ;
    }
    //选的情况
    st[u]=true;
    dfs(u+1);

    //不选的情况
    st[u]=false;
    dfs(u+1);
}
int main(){
    cin>>n;
    dfs(1);
    return 0;
}
