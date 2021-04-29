//
// Created by Asaki on 2021/3/7.
//
#include<bits/stdc++.h>
using namespace  std;
int n;
int res=0;
int main(){
    cin>>n;
    for(int i =1;i<=n;i++){
        int x=i;
        while(x){
            int t=x%10;
            x/=10;
            if(t==2||t==0||t==1||t==9){
                res+=i;
                break;
            }
        }
    }
    cout<<res<<endl;
    return 0;
}