#include<iostream>
using namespace std;
#include"manager.h"

//��ʾ������Ϣ
void Manager::showInfo(){
	cout << "ְ�����" << this->m_Id
		<< "\t����" << this->m_Name
		<< "\t��λ" << this->getDeptName()
		<< "\t����ϰ彻��������" << endl;
}

//��ȡְ����λ����
string Manager::getDeptName() {
	return string("����");
}

//���캯��  //�������ݱ���
Manager:: Manager(int  id, string name, int dId) {
	this->m_Id = id;
	this->m_Name = name;
	this->m_DeptId = dId;
}