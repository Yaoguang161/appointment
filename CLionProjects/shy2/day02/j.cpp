//
// Created by Asaki on 2020/11/14.
//

#include <stdio.h>
int main(){
    int n=1000;
    for(int i=7;i<=n;i++){
        if(i%7==0){
            if(i%6==5){
                if(i%5==4){
                    if(i%4==3){
                        if(i%3==2){
                            if(i%2==1){
                                printf("最小值为%d",n);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}