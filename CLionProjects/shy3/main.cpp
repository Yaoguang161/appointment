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
		cout << "�������" << endl;
		choice = _getch();
		switch (choice)
		{
		case '0':wn.exitSystem();//�˳�ϵͳ
			break;
		case '1': wn.Add_Emp();  //���ְ��
			break;
		case '2':  wn.Show_Emp();//��ʾְ��
			break;
		case '3':  wn.Del_Emp(); //ɾ��ְ��
			break;
		case '4':  wn.Mod_Emp(); //�޸�ְ��
			break;
		case '5': wn.Find_Emp(); //����ְ��
			break;
		case '6': wn.Sort_Emp(); //����ְ��
			break;
		case '7':  wn.Clean_File();//����ĵ�
			break;
		default:
			cout << "���벻��ȷ" << endl;
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
