//
// Created by Asaki on 2021/2/20.
//【蓝桥杯省赛】第十一届蓝桥杯省赛C/C++大学B组第二场 试题B 既约分数
#include<bits/stdc++.h>
using namespace std;
int main(){
    int ans=0;
    for(int i=1;i<=2020;i++){
        for(int j=1;j<=2020;j++){
            if(__gcd(i,j)==1){
                ans++;
            }
        }
    }
    cout<<ans<<endl;
    return 0;
}