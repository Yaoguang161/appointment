//
// Created by Asaki on 2021/4/10.
//编程打印空心字符菱形
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,i,j,m,k;
    char ch;
    k=1;
    cin >>ch >>n;
    getchar();
    m=(n+1)/2;
    for(i=0;i<m;i++)
    {
        for(j=0;j<m-i-1;j++){
            cout<<" ";
        }
        cout<<ch;
        if(i==0){
            ch++;
            cout<<endl;
            continue;
        }
        for(j=0;j<2*i-1;j++){
            cout<<" ";
        }
        printf("%c",ch++);
        cout<<endl;
    }
    ch=ch-2;
    for(i=n-m;i>0;i--){
        for(j=0;j<k;j++){
            cout<<" ";
        }
        k++;
        cout<<ch;
        for(j=0;j<2*i-3;j++){
            cout<<" ";
        }
        if(i==1){
            cout<<endl;
            break;
        }
        cout<<ch--<<endl;
    }
    return 0;
}
