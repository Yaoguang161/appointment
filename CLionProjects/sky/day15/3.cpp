//
// Created by Asaki on 2021/6/6.
//801. 二进制中1的个数
#include<iostream>

using namespace std;

int main(){
    int n;
    cin >> n;
    while(n --){
        int x ;
        int s = 0;
        cin  >> x;
        for(int i = x; i ; i -= i & -i) s ++;
        cout  << s  << " ";
    }

    return 0;
}
