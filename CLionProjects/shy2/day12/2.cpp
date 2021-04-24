//
// Created by Asaki on 2021/4/7.
//1205. 买不到的数目
#include<bits/stdc++.h>
using namespace std;
bool dfs(int m , int p , int q){
    if(!m) return true;
    if(m >= p && dfs(m-p,p,q)) return true;
    if(m >= q && dfs(m-q, p , q)) return true;
    return false;
}
int main(){
    int p , q;
    cin >> p >> q;
    int res = 0;
    for(int i = 1; i <= 1000; i++){
        if(!dfs(i,p,q)) res = i;
    }
    cout << res <<endl;

    return 0;
}
