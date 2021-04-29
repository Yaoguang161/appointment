//
// Created by Asaki on 2021/4/7.
//
#include<bits/stdc++.h>
using namespace std;
map<long long ,long long >mp;
map<long long ,long long >::iterator it;
int main(){
    int n,ma=0;
    long long a,b;
    cin >>n;
    n = 2*n;
    while(n--){
        cin >> a;
        mp[a]++;
        if(mp[a]>ma)
            ma=mp[a];
    }
    int s = 0 , f = 0;
    for(it = mp.begin();it != mp.end();it++){
        if(it ->second == ma &&!f){
            cout<<it->first << ' '<<it -> second,f=1;
        }
        if(it ->second == ma){
            s++;
        }
    }
    if(s>1)
        cout<< ' '<<s;
    return 0;
}
