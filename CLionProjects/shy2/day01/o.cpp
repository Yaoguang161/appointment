//
// Created by Asaki on 2020/11/4.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
    double a,b,c,p,s;
    cin>>a>>b>>c;
    p=(a+b+c)/2;
    s=sqrt(p*(p-a)*(p-b)*(p-c));
    printf("%.1lf",s);
    return 0;
}
