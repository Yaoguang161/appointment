//
// Created by Asaki on 2020/10/31.
//
#include<bits/stdc++.h>//万能头文件
using namespace std;
int main()
{
    double m,h;//这里为了方便计算，用double
    cin>>m>>h;//输入
    double sum=m/(h*h);//按照题目公示计算
    if(sum<18.5) cout<<"Underweight";//如果小于18.5输出
    else if(sum<24) cout<<"Normal";//同上
    else cout<<sum<<endl<<"Overweight";//其他情况，直接输出cout的值，然后输出超重
    return 0; //华丽结束
}