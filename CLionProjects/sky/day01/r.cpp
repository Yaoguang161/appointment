//
// Created by Asaki on 2020/11/4.
//

#include<bits/stdc++.h>
using namespace std;
int main(){
    int a, ans=1;
    cin >> a;
    while(a!=1){
        ans++;
        a /= 2;
    }
    cout << ans << endl;
    return 0;
}