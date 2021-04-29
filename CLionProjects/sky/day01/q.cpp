//
// Created by Asaki on 2020/11/4.
//水仙花数
#include <bits/stdc++.h>
using namespace std;
int main(){
    for(int i=100;i<1000;i++){
        if(i==(i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10)){
            cout<<i<<endl;
        }
    }
    return 0;
}