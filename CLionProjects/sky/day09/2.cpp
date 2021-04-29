//
// Created by Asaki on 2021/3/7.
//94. 递归实现排列型枚举
#include<iostream>
#include<cstdio>

using namespace std;
const int N = 10;
int n;
int st[N];  //储存方案
bool used[N];

void dfs(int u) {
    if (u > n) {
        for (int i = 1; i <=n; i++) {
            cout << st[i] << " ";
        }
        cout << endl;
        return;
    }
    for (int i = 1; i <=n; i++) {
        if(!used[i]){
            st[u]=i;
            used[i]=true;  //作用是进入dfs(i+1)前,改变
            dfs(i+1);


            used[i]=false;    //使用过后,改变开关
        }
    }

}

int main() {
    cin >> n;
    dfs(1);
    return 0;
}
