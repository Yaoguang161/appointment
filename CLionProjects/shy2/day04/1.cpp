//
// Created by Asaki on 2021/1/12.
//结构体指针68
#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
struct student {
    string name ;
    int age;
    int score;
};
int main(){
    //1.创建学生结构体变量
    struct student s={"张三",60,90};
    //2.通过指针指向结构体变量
    struct student * p =&s;
    //3.同过指针访问结构体变量中的数据
    //结构体可以通过s.name来访问
    cout<<"姓名:"<<p->name<<"年龄:"<<p->age<<"成绩:"<<p->score<<endl;
    return 0;
}
