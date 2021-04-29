//
// Created by Asaki on 2021/4/23.
//
#include<iostream>
using namespace std;
const int N = 1e3+7;
typedef long long ll;
ll s[N];
int main(){
    ll n = 2021041820210418;
    ll cnt = 0;
    ll res = 0;
    for(int i = 1; i <= n/i; i++){
        if(n&i == 0){
            s[cnt++] = i;
            s[cnt++] =n/i;
        }
    }
    for(int i= 0; i < cnt ; i ++) {
        for (int j = 0; j < cnt; j++) {
            for (int k = 0; k < cnt; k++) {
                if (s[i] * s[j] * s[k] == n) {
                    res++;
                }
            }
        }
    }
    cout << res;
    return 0;
}
