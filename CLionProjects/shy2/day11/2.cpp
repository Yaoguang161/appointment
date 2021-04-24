//
// Created by Asaki on 2021/3/29.
//789. 数的范围  修改版
#include<bits/stdc++.h>
using namespace std;

const int N = 100010;

int q[N];

int n , m;
int main(){
    scanf("%d%d",&n,&m);
    for(int i = 0; i < n; i++ ) {
        scanf("%d",&q[i]);
    }
    for(int i = 0; i< m; i ++){
        int x;
        scanf("%d",&x);
        int l =  0, r = n -1 ;
        while(l<r){
            int mid = l + r >> 1;
            if (q[mid] >= x) r = mid;
            else l = mid + 1;
        }
        if(q[r] == x) {
            cout << r << ' ';
            r = n - 1;
            while(l < r){
                int mid = l + r + 1 >> 1;
                if(q[mid] <= x)  l = mid ;
                else r = mid -1 ;
            }
            cout << l << endl;
        }
        else cout<< "-1 -1" << endl;
    }
    return 0;
}
