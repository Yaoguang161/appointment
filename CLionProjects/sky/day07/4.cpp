//
// Created by Asaki on 2021/2/20.
// 计数问题
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,x,b,c;
    int sum=0;
    cin>>n>>x;
    for(int i =1;i<=n;i++){
        b=i;
        while(b!=0){
            c=b%10;
            b=b/10;
            if(c==x){
                sum++;
            }
        }
    }
    cout<<sum<<endl;
    return 0;
}
