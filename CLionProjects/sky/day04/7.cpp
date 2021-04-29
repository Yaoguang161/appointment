//通讯录管理系统
// Created by Asaki on 2021/1/12.
//
#include<iostream>
#include<string>
#define MAX 1000
using namespace std;
void showMenu(){
    cout<<"**********************"<<endl;
    cout<<"***** 1.添加联系人 *****"<<endl;
    cout<<"***** 2.显示联系人 *****"<<endl;
    cout<<"***** 3.删除联系人 *****"<<endl;
    cout<<"***** 4.查找联系人 *****"<<endl;
    cout<<"***** 5.修改联系人 *****"<<endl;
    cout<<"***** 6.清空联系人 *****"<<endl;
    cout<<"***** 0.退出通讯录 *****"<<endl;
    cout<<"**********************"<<endl;
}
//设置联系人结构体
struct Persion{
    string  m_name; //姓名
    int m_Sex;   // 性别
    int m_Age;   // 年龄
    string m_Phone; // 电话
    string m_Addr;  // 住址
};
//设置通讯录结构体
struct Addressbooks{
    struct Persion personArray[MAX]; //通讯录中保存的联系人数组
    int m_Size;    //通讯录中人员个数
};
//添加联系人
void addPerson(Addressbooks * abs) {
    //判断通讯录是否已满,
    if (abs->m_Size == MAX) {
        cout << "通讯录已满,无法添加" << endl;
        return;
    } else {
        //添加具体联系人
        //姓名
        string name;
        cout << "请输入姓名" << endl;
        cin >> name;
        abs->personArray[abs->m_Size].m_name = name;
        //性别
        cout << "请输入性别" << endl;
        cout << "1 ---男" << endl;
        cout << "2 ---女" << endl;
        int sex = 0;
        while (true) {//如果输入的是1 或2可以退出循环,如果是3 则重新输入
            cin >> sex;
            if (sex == 1 || sex == 2) {
                abs->personArray[abs->m_Size].m_Sex = sex;
                break;
            } else {
                cout<<"输入有误,请重新输入"<<endl;
            }
        }
        //年龄
        cout<<"请输入年龄"<<endl;
        int age= 0;
        cin >>age;
        abs->personArray[abs->m_Size].m_Age = age;
         //电话
         cout<<"请输入电话" <<endl;
         string phone;
         cin >>phone;
         abs->personArray[abs->m_Size].m_Phone = phone;
         //住址
         cout<<"请输入住址"<<endl;
         string address;
         cin>>address;
         abs->personArray[abs->m_Size].m_Addr = address;
         //更新通讯录人数
         abs->m_Size++;
         cout<<"添加成功"<<endl;
         system("cls");
    }
}
int main(){
    Addressbooks abs;
    //初始化一些数据
     abs.m_Size =0;

   while(true){
       int select = 0;
       showMenu();
       cin >> select;
       switch (select) {
            case 1:  //1.添加联系人
                addPerson(&abs);//利用地址传递 ,可以修饰形参
                break;
            case 2: // 2.显示联系人
                break;
            case 3:  //  3.删除联系人
                break;
            case 4: //  4.查找联系人
                break;
            case 5: // 5.修改联系人
                break;
            case 6:   // 6.清空联系人
                break;
            case 0:   // 0.退出通讯录
            cout<<"欢迎下次使用"<<endl;
            return 0;
                break;
            default:
                break;
        }

    }
    return 0;
}
