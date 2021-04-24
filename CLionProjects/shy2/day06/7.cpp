//
// Created by Asaki on 2021/2/7.
//
#include<bits/stdc++.h>
using namespace std;
int a[1000001];
int main(){
    int n;
    int t;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i = 0;i<n;i++){
        for(int j =i+1;j<n;j++){
            if(a[i]>a[j]){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    for(int j=0;j<n;j++){
        cout<<a[j]<<" ";
    }

    return 0;
}
