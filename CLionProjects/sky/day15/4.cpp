//
// Created by Asaki on 2021/6/6.
////801. 二进制中1的个数
#include<iostream>
using namespace std;
int lowbit(int x ){  //返回的值是int ,不是二进制了

    return x  & -x ;
}
int main(){
    int n;
    cin >> n;
    while(n --){
        int x;
        cin  >> x;
        int res =0;
        while(x) x -= lowbit(x) , res ++;
        cout << res << ' ';
    }
    return 0;
}
