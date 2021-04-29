//
// Created by Asaki on 2021/4/10.
//
#include<bits/stdc++.h>
using namespace std;

int c;
int main(){
    string s;
    cin >> s;
    int j = 0;
    for(int i = 0 ; i < s.length(); i ++){
        if(s[i] =='w'){
            if(s[i+1] =='a'){
                j++;
            }
        }
    }
    cout << j;


    return 0;
}
