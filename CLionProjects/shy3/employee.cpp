#include<iostream>
using namespace std;
#include"employee.h"

//��ʾ������Ϣ
void Employee::showInfo() {
	cout << "ְ�����" << this->m_Id
		<< "\t����" << this->m_Name
		<< "\t��λ" << this->getDeptName()
		<<"\t��ɾ�����������"<< endl;
}

//��ȡְ����λ����
string Employee::getDeptName() {
	return string("Ա��");
}

//���캯��  //�������ݱ���
Employee::Employee(int  id,string name ,int dId) {
	 this->m_Id=id; 
	 this->m_Name=name;
	 this->m_DeptId=dId;
}

