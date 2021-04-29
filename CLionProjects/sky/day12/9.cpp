//
// Created by Asaki on 2021/4/7.
//L1-7 前世档案 同day 12 -7
#include <iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
    int N,M;
    cin>>N>>M;
    while(M--)
    {
        string str;
        cin>>str;
        int node=1;
        for(auto ch:str)
        {
            if(ch=='y')
                node=2*node;
            else
                node=2*node+1;
        }
        int num=node+1-(int)pow(2,N);
        printf("%d\n",num);
    }
}


