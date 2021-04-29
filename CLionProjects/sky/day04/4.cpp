//
// Created by Asaki on 2021/1/12.
//结构体中const的使用场景
#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
struct student {
    string name;
    int age;
    int score;
};

void printStudent(const student *s){
    //加入const后,一但有修改的操作就会报错,防止我们的误操作
    //例如加入s->age=100;会立马报错,无法更改
    cout<<"学生的姓名: "<<s->name<<"学生的年龄:"<<s->age<<"学生的成绩: "<<s->score<<endl;
}
int main(){
    struct student s ={"张三",19,60};
    //通过函数打印结构体变量的信息
    printStudent(&s);




    return 0;
}

