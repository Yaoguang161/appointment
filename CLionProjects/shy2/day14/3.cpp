//
// Created by Asaki on 2021/4/23.
//十二届蓝桥杯C++b组  试题C 直线
#include<bits/stdc++.h>
using namespace std;
typedef pair<double ,double> pdd;
set<pdd> m;
const int N =30;
pdd point[N*N];
#define x first
#define y second
int main(){
    int cnt = 0;  //记录有多少个坐标
    for(int i = 0; i < 20 ; i ++){
        for(int j = 0; j < 21; j ++){
            point[cnt].x= i;
            point[cnt].y= j;
            cnt ++;
        }
    }
    int ans = 20 + 21;
    for(int i = 0; i < cnt ; i++){
        for(int j = 0; j < cnt ; j ++){
            if(point[i].x == point[j].x || point[i].y == point[j].y)
            continue;
            double  k = (point[j].y - point[i].y )/(point[j].x - point[i].x);
            double  b = (point[j].x*point[i].y - point[j].y*point[i].x)/(point[j].x-point[i].x);
            m.insert({k,b});
        }
    }
    for(auto it = m.begin(); it != m.end(); it ++){
        ans ++;
    }
    cout << ans << endl;

    return 0;
}

