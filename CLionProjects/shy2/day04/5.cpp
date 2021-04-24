//
// Created by Asaki on 2021/1/12.
//结构体案例1  70集
#include<iostream>
#include<cstdio>
#include<string>
#include<ctime>
using namespace std;
struct  Student{
    string sName;
    int score;
};
struct Teacher {
    string tName;
    struct Student sArray[5];
};
//给学生和老师赋值的函数
void allocateSpace(struct Teacher tArray[],int len){
    string nameSeed = "ABCDE";
    for(int i=0;i<len;i++){
        tArray[i].tName = "Teacher_";
        tArray[i].tName += nameSeed[i];
        for(int j=0; j<5;j++){
            tArray[i].sArray[j].sName="Student_";
            tArray[i].sArray[j].sName +=nameSeed[j];
            int random=rand( )%61+40;
            tArray[i].sArray[j].score = random;
        }
    }
}
void printInfo(struct Teacher tArray[],int len) {
    for (int i = 0; i < len; i++) {
        cout << "老师的信息:" << tArray[i].tName << endl;
        for (int j = 0; j < 5; j++) {
            cout << "\t学生的信息: " << tArray[i].sArray[j].sName << "学生的考试分数:" << tArray[i].sArray[j].score << endl;
        }
    }
}
int main() {
        srand((unsigned int )time(NULL));
        //1.创建3名老师的数组
        struct Teacher tArray[3];
        //2.通过函数给3名老师的信息赋值,并给老师带的学生信息赋值
        int len = sizeof(tArray) / sizeof(tArray[0]);
        allocateSpace(tArray, 3);
        //3.打印所有老师及所带的学生信息
        printInfo(tArray, len);
        return 0;
}
