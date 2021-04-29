//
// Created by Asaki on 2021/4/7.
//7-3 前世档案 (20 分)
#include<bits/stdc++.h>
using namespace std;

int n,m;
int num;
int main(){
    cin >> n >> m;
    while(m--){
        string s;
        cin >> s;
        int node = 1;
        for(int i = 0;i<s.length();i++){
            if(s[i] == 'y'){
                node = node * 2;
            }else {
                node = node *2 +1;
            }
        }
        int num = node+1 - (int)pow(2,n);
        cout<< num <<endl;
    }
    return 0;
}
