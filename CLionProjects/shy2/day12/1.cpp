//
// Created by Asaki on 2021/4/7.
//1205. 买不到的数目
#include<bits/stdc++.h>
using namespace std;
const int N = 1000000;
int n,m,minn,maxx,ans;
int dp[N];
int main(){
    cin >> n >> m;
    dp[0] = true;
    minn = min(n,m);
    maxx = max(n,m);
    for(int i = minn; i < n * m; i++){
        if(dp[i - minn]){
            dp[i] = true;
        }else if(i >= maxx && dp[i - maxx]){
            dp[i] = true;
        }else {
            ans = i;
        }
    }
    cout << ans;
    return 0;
}
