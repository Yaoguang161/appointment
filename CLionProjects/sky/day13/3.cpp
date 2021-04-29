//
// Created by Asaki on 2021/4/10.
//
#include<bits/stdc++.h>
using namespace std;
int main(){
    int sum = 0;
    int t;
    for(int i = 1 ; i <= 2021; i ++){
        t = i ;
        while(t){
            if(t % 10 == 6){
                sum ++;
            }
            t = t / 10;
        }
    }
    cout << sum;
    return 0;
}
