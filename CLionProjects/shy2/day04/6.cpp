//
// Created by Asaki on 2021/1/12.
//结构体案例2  71
#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
//设计英雄结构体  名字,年龄,性别
struct Hero{
    string name;
    int age;
    string sex;
};
void  bubbleSort(struct Hero heroArray[],int len){
    for(int i = 0;i<len -1 ;i++){
        for(int j = 0;j<len-i-1;j++){
            if(heroArray[j].age>heroArray[j+1].age){
                struct Hero temp=heroArray[j];
                heroArray[j]=heroArray[j+1];
                heroArray[j+1]=  temp;
            }
        }
    }

}
void printHero(struct Hero heroArray[],int len){
    for(int i = 0; i<len ;i++){
        cout<<"姓名: "<<heroArray[i].name<<"年龄: "<<heroArray[i].age<<"性别: "<<heroArray[i].sex<<endl;
    }
}
int main(){
    struct Hero heroArray[5]{
            {"刘备",23,"男"},
            {"关羽",22,"男"},
            {"张飞",20,"男"},
            {"赵云",18,"男"},
            {"貂蝉",19,"女"},
    };
    int len =sizeof(heroArray)/sizeof(heroArray[0]);
//    for(int i = 0; i<len ;i++){
//        cout<<"姓名: "<<heroArray[i].name<<"年龄: "<<heroArray[i].age<<"性别: "<<heroArray[i].sex<<endl;
//    }
    //3.对数组进行排序,按照年龄进行升序排列, 冒泡排序
    bubbleSort(heroArray,len);
    //4.将排序后结果打印输出
    printHero(heroArray,len);

    return 0;
}

