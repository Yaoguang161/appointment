//
// Created by Asaki on 2021/3/29.
//pat网红点打卡攻略  自己默写
#include<bits/stdc++.h>
#define N 202
using namespace std;

int n,m,k,nk;
int g[N][N];
int V[N];
bool vis[N];
int cnt,ans_i,ans_w=0x3f3f3f3f;

int main() {
    memset(g,-1,sizeof(g));

    cin >> n >> m;
    for(int i=0; i<m; ++i) {
        int u,v,w;
        cin >> u >> v >> w;
        g[u][v] = w;
        g[v][u] = w;
    }
    cin >> k;
    for(int i=1; i<=k; ++i) {
        memset(vis,false,sizeof(vis));
        cin >> nk;
        bool flag = true;
        for(int j=1; j<=nk; ++j) {
            cin >> V[j];
            vis[V[j]] = true;
        }
        V[0] = V[nk+1] = 0;
        if(nk != n) {
            continue;
        }
        for(int j=1; j<=nk; ++j) {
            if(!vis[j]) {
                flag = false;
                break;
            }
        }
        if(!flag) {
            continue;
        }
        int sumw=0;
        for(int j=0; j<=nk; ++j) {
            if(g[V[j]][V[j+1]]>0) {
                sumw += g[V[j]][V[j+1]];
            } else {
                flag = false;
                break;
            }
        }
        if(!flag) {
            continue;
        }
        cnt++;
        if(ans_w > sumw) {
            ans_w = sumw;
            ans_i = i;
        }
    }

    cout << cnt << endl;
    cout << ans_i << " " << ans_w << endl;
    return 0;
}
