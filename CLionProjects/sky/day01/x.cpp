//
// Created by Asaki on 2020/11/4.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
    int l;
    int j;
    int i;
    int sum=0;
    int cot=0;
    cin>>l;
    for( i=2;i<=l;++i){
        for( j=2;j<=i;++j){
            if(i%j==0){
                break;
            }
        }
        if(i==j){
            cout<<i<<endl;
            sum=sum+i;
            cot++;
        }
        if(sum>l){
            break;
        }

    }
    cout<<cot<<endl;
    return 0;
}
