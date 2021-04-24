//
// Created by Asaki on 2020/11/3.
//重点倒三角

#include <bits/stdc++.h>
using namespace std;
int main(){
    int n,j,i,z;
    cin >> n;
    for(i=n;i>0;i--){
        for(j=0;j<=n-1-i;j++)  printf(" ");
        for(z=0;z<=n-1-j;z++)  printf("*");
        printf("\n");
    }
    return 0;
}