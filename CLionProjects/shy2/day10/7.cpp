//
// Created by Asaki on 2021/3/21.
// 1219. 移动距离
#include<bits/stdc++.h>
using namespace std;
int main(){
    int w,m,n;
    cin>>w>>m>>n;
    m-- , n--;

    int x1 = m / w , x2 = n / w;
    int y1 = m % w , y2 = n % w;
    if( x1 % 2)  y1 =  w - 1 - y1;
    if( x2 % 2)  y2 =  w - 1 - y2;

    cout<<abs(x1-x2)+abs(y1 - y2);

    return 0;
}

