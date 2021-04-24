//
// Created by Asaki on 2021/2/20.
//十一届蓝桥杯 蛇形填数
#include<iostream>
using namespace std;
int m,n,x,y;
int a[40][40];
int main(){
    int count=1;
    int num=1;
    while(true){
        if(count%2==0){
            for(int i=1;i<=count;i++){
                for(int j=1;j<=count;j++){
                    if(i+j==count+1){
                        a[i][j]=num++;
                    }
                }
            }
        }else{
            for(int i=count;i>=1;i--){
                for(int j=count;j>=1;j--){
                    if(i+j==count+1){
                        a[i][j]=num++;
                    }
                }
            }
        }
        if(a[20][20]){
            cout<<a[20][20]<<endl;
            break;
        }
        count++;
    }
    return 0;
}
