//
// Created by Asaki on 2021/1/12.
//结构体做函数参数68
#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
struct student {
    string name;
    int age;
    int score;
};
//打印学生信息函数
//1.值传递
void printStudent1(struct student s){
    cout<<"子函数1中姓名: "<<s.name<<"学生的年龄: "<<s.age<<"学生的成绩: "<<s.score<<endl;
}
//2.地址传递
void printStudent2(struct student * p){
    cout<<"子函数2中的姓名: "<<p->name<<"学生的年龄: "<<p->age<<"学生的成绩: "<<p->score<<endl;
}
int main(){
    student s;
    s.name="张三";
    s.age = 19;
    s.score = 60;
    printStudent1(s); //子函数1中的信息 值传递
    printStudent2(&s);//子函数2中的信息 地址传递

    return 0;
}
