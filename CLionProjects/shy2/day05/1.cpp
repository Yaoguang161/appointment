//
// Created by Asaki on 2021/2/2.
//
#include<bits/stdc++.h>
using namespace std;
int a[100],b[100];
int  main(){
    int n,js=0;
    cin>>n;
    for(int i=1;i<=n;i++){
        cin>>a[i];
        b[i]=2;
    }
    for(int x=1;x<=n;x++){
        for(int y=x+1;y<=n;y++){
            for(int p =1;p<=n;p++){
                if(a[p]==a[x]+a[y]&&b[p]!=1){
                    js++;
                    b[p]=1;
                }
            }
        }
    }
    cout<<js;
    return 0;
}