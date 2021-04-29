//
// Created by Asaki on 2020/11/14.
//

#include <bits/stdc++.h>
using namespace std;
int a[100];
int main(){
    int n,m,i=1;
    cin>>n;
    n=m;
    while(n!=0){
        if(n%2==0){
            n=n/2;
        } else{
            n=n*3+1;
        }
        a[i]=n;
        i++;
    }
    for(int j=i-1;j>0;j--){//数组中的i，比实际小1
        cout<<a[j]<<" ";
    }
    cout<<m;
    return 0;
}