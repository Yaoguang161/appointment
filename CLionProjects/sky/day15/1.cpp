//
// Created by Asaki on 2021/6/6.
//2816. 判断子序列
#include<iostream>
#include<algorithm>
#include<cstring>
using namespace std;
const int N = 100010;

int n , m;
int a[N],b[N];

int main(){
        cin >> n >> m;
        for(int i = 0; i < n ; i ++){
            cin >> a[i];
        }
        for(int i = 0; i < m ; i ++){
            cin >> b[i];
        }
        int i = 0 , j = 0;
        while(i < n && j < m){
            if(a[i] == b[j]) i ++ ;
            j ++ ; //无论如何j都会递增
        }
        if (i == n) puts("Yes");
        else puts("NO");

    return 0;
}
