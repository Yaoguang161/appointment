//
// Created by Asaki on 2021/4/23.
//
#include<iostream>
#include<set>
using namespace std;
int main(){
    set<string> st1;
    set<string>::iterator it1;
    st1.insert("abc");
    st1.insert("bca");
    st1.insert("ab");
    st1.insert("a");
    for(it1=st1.begin(); it1!=st1.end(); it1++)
    {
        cout<<*it1<<endl;
    }
    return 0;
}
