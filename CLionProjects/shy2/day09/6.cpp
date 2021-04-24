//
// Created by Asaki on 2021/3/7.
//
#include <bits/stdc++.h>
using namespace std;
const int N=10010,INF= 100000000;
int n;
int a[N];
int main(){
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int res=0;
    for(int i=0;i<n;i++){
        int minv=INF,maxv=-INF;
        for(int j=i;j<n;j++){
            minv=min(minv,a[j]);
            maxv=max(maxv,a[j]);
            if(maxv - minv ==j-i) res ++;
        }
    }
    cout<<res<<endl;


    return 0;
}
