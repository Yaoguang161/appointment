//
// Created by Asaki on 2020/11/4.
//找最小值P5718

#include <bits/stdc++.h>
using namespace std;
int main(){
    int a[10000];
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int min=a[0];
    for(int i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    cout<<min<<endl;
    return 0;
}