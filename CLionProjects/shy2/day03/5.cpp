//
// Created by Asaki on 2020/12/14.
//P1425 小鱼的游泳时间
#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    int a,b,c,d,e;
    scanf("%d %d %d %d",&a,&b,&c,&d);
    e=(c-a)*60+d-b;
    printf("%d %d",e/60,e%60);
    return 0;
}
