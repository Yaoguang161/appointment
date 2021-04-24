//
// Created by Asaki on 2021/3/7.
//
#include<bits/stdc++.h>
using namespace  std;
const int N=100010;
int n;
int a[N],b[N],c[N];
int as[N],cs[N];
int cnt[N],s[N];
typedef long long LL;
int main(){
    cin>>n;
    for(int i=0;i<n;i++)    scanf("%d",&a[i]);
    for(int i=0;i<n;i++)    scanf("%d",&b[i]);
    for(int i=0;i<n;i++)    scanf("%d",&c[i]);
    //求as[]
    for(int i=0;i<n;i++)    cnt[a[i]]++;
    for(int i=0;i<n;i++)    s[i]=s[i-1]+cnt[i];
    for(int i=0;i<n;i++)    as[i] = s[b[i]-1];

    //求cs[]
    memset(cnt ,0,sizeof cnt);
    memset(s,0,sizeof s);
    for(int i=0;i<n;i++)   cnt[c[i]]++;
    for(int i=0;i<N;i++)   s[i]=s[i-1]+cnt[i];
    for(int i=0;i<n;i++)   cs[i]=s[N-1]-s[b[i]];
    //枚举每个b[i]
    LL res=0;
    for(int i=0; i<n;i++)  res +=(LL)as[i] * cs[i];
    cout<<res<<endl;

    return 0;
}
