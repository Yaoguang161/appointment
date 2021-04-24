#include<iostream>
using namespace std;
#include<string>
#include"workerManager.h"
#include<conio.h>
#include"boss.h"
#include"employee.h"
#include"manager.h"
#include"worker.h"
int main() {

	WorkerManager wn;

	int choice ;

	while (true)
	{
		wn.Show_Menu();
		cout << "输入操作" << endl;
		choice = _getch();
		switch (choice)
		{
		case '0':wn.exitSystem();//退出系统
			break;
		case '1': wn.Add_Emp();  //添加职工
			break;
		case '2':  wn.Show_Emp();//显示职工
			break;
		case '3':  wn.Del_Emp(); //删除职工
			break;
		case '4':  wn.Mod_Emp(); //修改职工
			break;
		case '5': wn.Find_Emp(); //查找职工
			break;
		case '6': wn.Sort_Emp(); //排序职工
			break;
		case '7':  wn.Clean_File();//清空文档
			break;
		default:
			cout << "输入不正确" << endl;
			break;
		}
		system("pause");
		system("cls");
	}
	return 0;
}
//
	//wn.Show_Menu();
	//cin >> choice;
	//switch (chuice) {
	//case 0:   
	//	break;
