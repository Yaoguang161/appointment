//
// Created by Asaki on 2021/2/7.
//
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n ;
    string s;
    cin>>n;
    cin>>s;
    for(int i = 0;i<s.size();i++){
        for(int j = 1;j<=n;j++){
            s[i]++;
            if(s[i]>'z'){
                s[i]='a';
            }
        }
    }
    cout<<s;
    return 0;
}
