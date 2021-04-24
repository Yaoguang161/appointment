//
// Created by Asaki on 2021/2/7.
//
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    string s;
    cin>>n>>s;
    for(int i=0;i<s.size();i++){
        if(s[i]+n>122){
            s[i]+=n-26;
        }
        else{
            s[i]+=n;
        }
    }
    cout<<s;
    return 0;
}
