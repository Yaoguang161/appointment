//
// Created by Asaki on 2021/1/12.
//结构体中嵌套结构体67
#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
//先定义学生才能再定义老师的结构体
struct student {
    int id;
    string name;
    int age;
};
struct teacher{
    int id;
    string name;
    int age;
    struct student stu;;//老师辅导的学生
};
int main(){
    teacher t;
    t.name="王老师";
    t.age=28;
    t.id=15;
    t.stu.id=001;
    t.stu.name="张三";
    t.stu.age=16;
    cout<<"学生:"<<t.stu.name<<"学生的id:"<<t.stu.id<<"学生的年龄:"<<t.stu.age<<endl;
    return 0;
}
