//
// Created by Asaki on 2020/11/3.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
    int x,y,i,j,k,s = 0;
    cin>>x>>y;
    for(i = x; i <= y; i++)
    {
        k = i;
        j = 0;
        do
        {
            j = j * 10 + k % 10;
            k = k / 10;
        }while(k);
        if(j == i)
        {
            printf("%d\n ",i);
            s = s + 1;
        }
    }
    return 0;
}
