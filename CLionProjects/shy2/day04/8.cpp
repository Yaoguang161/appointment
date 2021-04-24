//
// Created by Asaki on 2021/1/12.
//P4715 【深基16.例1】淘汰赛
#include <iostream>
using namespace std;
struct guo_jia{
    int hm;   //号码
    int nl=0;   //能力值
};
int main(){
    int n;
    guo_jia max_l,max_r;
    guo_jia a;
    cin>>n;
    for(int i= 0; i<1<<(n-1);i++){
        cin>>a.nl;
        if(a.nl>max_l.nl){
            max_l.nl=a.nl;
            max_l.hm =i+1;
        }
    }
    for(int i = 1<<(n-1);i<1<<n;i++) {
        cin >> a.nl;
        if (a.nl > max_r.nl) {
            max_r.nl = a.nl;
            max_r.hm = i + 1;
        }
    }
    if(max_l.nl>max_r.nl){
        cout<<max_r.hm;
    }
    else {
        cout << max_l.hm;
    }
    return 0;
}