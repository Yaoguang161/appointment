//
// Created by Asaki on 2021/3/29.
//
#include<bits/stdc++.h>



using namespace std;
const int N = 100010;
int  n,m;
int a[N];
int b[N];


int main(){
    cin >> n >> m;
    for(int i = 1 ; i<= n ; i++){
        cin >> a[i];
        b[i] = b[i - 1]  + a[i];
    }
    while(m -- ){
        int l , r;
        cin >> l >>r;
        cout<<b[r]-b[l-1]<<endl;
    }


    return 0;
}
