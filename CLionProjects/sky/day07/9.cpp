//
// Created by Asaki on 2021/2/20.
//十一届蓝桥杯 蛇形填数
#include <bits/stdc++.h>
using namespace std;
int mmp[50][50], id;
int main() {
    for (int i = 1; i <= 40; i++) {
        if (i & 1) {
            int idx = i, idy = 1;
            for (int j = 0; j < i; j++){
                mmp[idx - j][idy + j] = ++id;
            }
        } else {
            int idx = 1, idy = i;
            for (int j = 0; j < i; j++){
                mmp[idx + j][idy - j] = ++id;
            }
        }
    }
    cout << mmp[20][20] << endl;
    return 0;
}