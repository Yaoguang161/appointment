//
// Created by Asaki on 2021/4/10.
//1224. 交换瓶子   暴力法

#include<bits/stdc++.h>
using namespace std;
const int N = 10010;
int n;
int a[N];
int main(){
    cin >> n;
    for(int i = 1; i <= n ; i++){
        cin >> a[i];
    }
    int sum =0;
    for(int i =1 ; i <= n; i ++){
        if(a[i] != i){
            for(int j = i+1; j <= n; j++){
                if(a[j] == i){
                    swap(a[i],a[j]);
                }
            }
            sum++;
        }
    }
    cout << sum <<endl;

    return 0;
}