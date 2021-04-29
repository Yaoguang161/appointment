//递归搜索树
// Created by Asaki on 2021/3/4.
//92. 递归实现指数型枚举
#include<bits/stdc++.h>
using namespace std;
const int N=15;

int a[N];

void dfs(int u,int state){    //state是记住当前的状态是什么,u是输入的树;
    if(u==n){                //当我们枚举到第n个数的时候,此时把答案遍历一下输出出来
        for(int i=0;i<n;i++){
            if(state >> i & 1)//看一下state的第i位是不是1
               cout<<i+1<< " " ;  //遍历的时候是从零到一的,输出的时候是从0到n-1的
               cout<<endl;
               return ;
        }
    }
    dfs(u+1,state);
    dfs(u+1,state | 1<<u);  //把state的u位制成1,就表示我们用这个数
}
int main(){
    int n;
    cin>>n;
    dfs(0,0);   //u是从第一数开始枚举,state是记住当前的方案是什么
    return 0;
}

