//
// Created by Asaki on 2020/12/14.
//P5705 【深基2.例7】数字反转
#include<iostream>
using namespace std;
int main(){
    string a;
    cin>>a;
    int len=a.size();      //读取长度
    for(int i=len-1;i>=0;i--)  //反转
        cout<<a[i];
    return 0;
}
