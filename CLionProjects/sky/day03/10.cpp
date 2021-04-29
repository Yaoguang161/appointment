//
// Created by Asaki on 2020/12/17.
//P1422 小玉家的电费

#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    int a;
    float b;
    cin>>a;
    if(a<=150&& a>=0){
        b=a*0.4463;
        printf("%.1f",b);
    }else if(a>150 && a<=400){
        b=0.4463*150+(a-150)*0.4663;
        printf("%.1f",b);
    }else{
        b=0.4463*150+150*0.4663+(a-400)*0.5663;
        printf("%.1f",b);
    }

    return 0;
}