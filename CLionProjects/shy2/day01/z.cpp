 //
// Created by Asaki on 2020/11/4.
//

#include <bits/stdc++.h>
using namespace std;
int x[100],c=0;
int main(){
    int i;
    for( i=0;;i++){
        cin>>x[i];
        if(x[i]==0) break;
        c=i;

    }
    for(int j=c;j>=0;j--){
        cout<<x[j]<<" ";
    }
    return 0;
}