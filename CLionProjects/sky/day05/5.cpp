//
// Created by Asaki on 2021/2/2.
//
#include<bits/stdc++.h>
using namespace std;
int n,t;
double a;
int  main(){
    int ans=0;
    cin>>n;
    while(n--){
        cin>>a;
        cin>>t;
        for(int i = 1; i<=t;i++){
            int x =(int)floor(a*i);
            ans^=x;
        }
    }
    cout<<ans;

    return 0;
}
