//
// Created by Asaki on 2020/11/3.
//
#include <bits/stdc++.h>
using namespace std;
int main(){
        int n, k;
        cin >> n;
        k = 2*n-1;
        for(int i = 0; i < n; i++){
            for(int j = i; j > 0; j--){
                cout << ' ';
            }
            for( ; k > 0; k--){
                cout << "*";
            }
            k = 2*n-1 - (i+1)*2;
            cout << endl;
        }

        return 0;
}
