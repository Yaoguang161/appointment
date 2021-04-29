//
// Created by Asaki on 2020/12/14.
//P5708 【深基2.习2】三角形面积
#include<iostream>
#include<cstdio>
#include<math.h>
using namespace std;
int main(){
    int a,b,c;
    float s,p;
    scanf("%d %d %d",&a,&b,&c);
    p=(a+b+c)/2;
    s=sqrt(p*(p-a)*(p-b)*(p-c));
    printf("%.1lf",s);
    return 0;
}

