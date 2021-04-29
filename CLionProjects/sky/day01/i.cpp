//
// Created by Asaki on 2020/11/3.
//

#include<bits/stdc++.h> //万能头文件
using namespace std; //使用标准命名空间
int n,minn=0x3f3f3f3f,a; //n表示有几个数，minn表示当前的最小值，a表示当前读入的数
//注意minn要被初始化成极大值，否则可能找不到正确答案
int main() {
    scanf("%d", &n); //读入
    while (n--) //循环n次
        scanf("%d", &a), minn = min(a, minn); //读入并更新答案
    printf("%d", minn); //输出答案
    return 0;
}