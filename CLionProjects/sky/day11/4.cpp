//
// Created by Asaki on 2021/3/29.
//790. 数的三次方根
#include<bits/stdc++.h>
using namespace std;
int main(){
    double x;
    cin >> x;
    double l = -10000, r = 10000;
    while( r - l >= 1e-8){
        double mid = (r + l ) / 2;
        if(mid * mid * mid >= x)   r = mid;
        else l = mid ;
    }
    printf("%lf \n",l);


    return 0;
}