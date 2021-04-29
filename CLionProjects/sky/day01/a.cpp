//#
// Created by Asaki on 2020/10/30.
//闰年判断
#include <iostream>
int  main(){
    int x;
    bool n;
    scanf("%d",&x);
    if(x%4!=0){
       n = false;
        printf("%d",n);
    } else{
       n= true;
        printf("%d",n);
    }
    return  0;
}