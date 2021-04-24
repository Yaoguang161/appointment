//
// Created by Asaki on 2021/3/4.
//
#include<bits/stdc++.h>
using namespace std;
int n,kind=0,m1[10000][10],m2[10];
void peiliao(int total,int a){
    if(a==10){
        if(total==n){
            for(int j = 0;j < 10;j++){
                m1[kind][j]=m2[j];  //个人理解m2[j]起储存作用
            }
            kind++;              //复合条件的种类;
        }
    }
    else if(total>=n);    //这里属于优化,排除错误条件
    else {
        for(int i=1;i<=3;i++){
            m2[a]=i;
            peiliao(total+i,a+1);
        }
    }
}
int main(){
    cin>>n;
    peiliao(0,0);
    cout<<kind<<endl;
    for(int j=0;j<kind;j++){
        for(int i=0;i<10;i++){
            cout<<m1[j][i]<<" ";
        }
        cout<<endl;
    }
    return 0;
}

