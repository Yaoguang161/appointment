//
// Created by Asaki on 2021/2/7.
//
#include<bits/stdc++.h>
using namespace std;
string a;
int  main(){
    cin>>a;
    for(int i=0; i<=a.length();i++){
        if(a[i]>='a'&& a[i]<='z'){
            a[i]=a[i]-'a'+'A';
        }
    }
    for(int i=0;i<=a.length();i++)
        cout<<a[i];
    return 0;
}
