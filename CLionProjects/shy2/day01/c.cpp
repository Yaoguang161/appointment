//
// Created by Asaki on 2020/10/31.
//

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;
int main(){
    int x;
    scanf("%d",&x);
    if(x==1|| x==0){
        printf("Today, I ate %d apple.",x);
    } else{
        printf("Today, I ate %d apples.",x);
    }
     return 0;
}