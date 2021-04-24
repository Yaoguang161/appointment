//
// Created by Asaki on 2021/2/7.
//排序_明明的随机数
#include<bits/stdc++.h>
using namespace std;
int a[10000];
int main(){
    int n;
    int j;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    for(int i=0;i<n;i++){
        for( j=i+1;j<n;j++){}
        if(a[i]=a[j]){
            a[i]=a[j];
        }
    }
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    return 0;
}
