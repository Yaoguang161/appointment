//
// Created by Asaki on 2021/4/23.
//
#include <iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> b(15);   //定义的时候指定vector的大小,默认b里面的元素都是0
    cout << b.size() << endl; // 输出b的大小发现是15
    for(int i = 0; i < b.size(); i ++){
        b[i] = 15;          //将每个数都定义为15,原来默认为0
    }
    for(int i = 0; i < b.size(); i ++){
        cout << b[i] << endl;
    }


    return 0;
}
