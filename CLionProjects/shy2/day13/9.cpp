//
// Created by Asaki on 2021/4/10.
//
#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;
    int j = 0; //j 是警告的个数
    int c = 0; //c 是错误的个数
    for(int i =  0 ; i < s.length(); ){
        if(s[i] =='w'&& s[i] !=s[i+2] || s[i] =='a' && s[i] !=s[i+2]){
            if(s[i+1] == 'a' && s[i] != s[i+1] || s[i+1] == 'w' && s[i] != s[i+1]){
                j++;
                i=i+2;
            }else if('s[i]' != 119 || 's[i]' !=97 ){
                i++;
            }
        }else if(s[i]==s[i+2] && s[i+1] ==s[i+3]){
            c++;
            i = i +4;
        }else if('s[i]' != 119 || 's[i]' !=97 ){
            i++;
        }

    }
    cout << j <<endl;
    cout << c <<endl;
    return 0;
}

