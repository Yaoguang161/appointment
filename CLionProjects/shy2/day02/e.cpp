//
// Created by Asaki on 2020/11/14.
//

#include <bits/stdc++.h>
using namespace std;
int main(){
    int a[15];
    int b,B;
    for(int i=1;i<=10;i++){
        cin>>a[i];
    }
        cin>>b;
        B=b+30;
    int c=0;
    for(int i=1;i<=10;i++){
        if(a[i]<=B){
            c++;
        }
    }
    cout<<c;
    return 0;
}