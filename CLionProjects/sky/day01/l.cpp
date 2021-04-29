//完数
// Created by Asaki on 2020/11/3.
//十进制转二进制的

#include<iostream>
using namespace std;
int main()
{
    int s[100];
    int count=0,n;
    cin >> n;
    while (n != 0)
    {
        s[++count] = n % 2;
        n = n / 2;
    }
    for (; count > 0; count--)
    {
        cout << s[count];
    }
    return 0;
}