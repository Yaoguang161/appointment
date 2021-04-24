//
// Created by Asaki on 2021/3/29.
//795. 前缀和    自己写的,测试点通过,整体但是有问题
#include<bits/stdc++.h>
using namespace std;

const int N = 1000100;
int n , m ;
int l , r;
int a[N];

int main(){
    cin >> n >>m;
    getchar();
    for(int i = 0; i < n ; i ++){
        scanf("%d",&a[i]);
    }
    getchar();
    while(m --){
        int sum = 0;
        cin >> l >> r;
        getchar();
        for(int i = l - 1  ; i < r; i ++){
            sum += a[i];
        }
        cout << sum << endl;
    }
    return 0;
}
