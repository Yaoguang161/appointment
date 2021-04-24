//
// Created by Asaki on 2020/12/17.
//P1423 小玉在游泳
//自己做，部分正确
#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    float a,b=2,c=0;
    int s=0;
        cin>>a;
        if(a<100){
            for(int i=1;;i++){
                c+=b*0.98;
                s++;
                if(c>a){
                    break;
                }
            }
            cout<<s;
        }else{
            return 0;
        }
    return 0;
}