//
// Created by Asaki on 2021/2/7.
//排序,明明的随机数
#include<bits/stdc++.h>
using namespace std;
int main(){
    bool book[1001]={0};
    int n;
    int final=0;
    cin>>n;
    int a[n];
    for(int i = 0;i<n;i++){
        cin>>a[i];
        if(book[a[i]]==0){
            final++;
        }
        book[a[i]]=1;
    }
    cout<<final<<endl;
    for(int i=1;i<=1000;i++){
        if(book[i]==1){
            cout<<i<<" ";
        }
    }
    return 0;
}
