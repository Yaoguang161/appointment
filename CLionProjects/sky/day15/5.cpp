//
// Created by Asaki on 2021/6/6.
//
#include<iostream>
using namespace std;
int a[100010] ;
int main(){
    int n,m;
    cin >> n >> m;
    while(n --){
        int x ,c;
        cin >> x ;
        cin >> c;
        a[x] += c;
    }
    while(m --){
        int l, r;
        cin >> l;
        cin >> r;
        int s = 0;
        for(int i = l; i <= r; i ++){
            s += a[i];
        }
        cout << s << endl;
    }


    return 0;
}
