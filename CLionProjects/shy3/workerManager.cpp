#include<iostream>
using namespace std;
#include"workerManager.h"
#include"string"
#include"boss.h"
#include"manager.h"
#include"employee.h"
#include<conio.h>
#include<fstream>//������
#define wenjian "wenjian.txt"
//�˵�����
void WorkerManager::Show_Menu() {
	cout << "*********************************" << endl;
	cout << "*******��ӭʹ��ְ������ϵͳ******" << endl;
	cout << "******** 0.�˳�����ϵͳ *********" << endl;
	cout << "******** 1.����ְ����Ϣ *********" << endl;
	cout << "******** 2.��ʾְ����Ϣ *********" << endl;
	cout << "******** 3.ɾ��ְ����Ϣ *********" << endl;
	cout << "******** 4.�޸�ְ����Ϣ *********" << endl;
	cout << "******** 5.����ְ����Ϣ *********" << endl;
	cout << "******** 6.���ձ������ *********" << endl;
	cout << "******** 7.��������ĵ� *********" << endl;
	cout << "*********************************" << endl;
	cout << endl;
}

//���ְ��
void WorkerManager::Add_Emp() {
	cout << "���������ְ������" << endl;
	//���ְ������
	int addNum = 0;
	cin >> addNum;
	if (addNum > 0) {
		//����ռ��С  �����¿ռ�
		Worker **newSpace = new  Worker*[addNum + m_EmpNum];
		if (this->m_EmpArray != NULL) {//��ԭ�ȵ����ݱ��浽��������
			for (int i = 0; i < this->m_EmpNum; i++) {
				newSpace[i] = this->m_EmpArray[i];
			}
		}
		//����������
		for (int i = 0; i < addNum; i++) {
			int id;
			string name;
			char dId;
			cout << "�������" << i + 1 << "����ְ�����" << endl;
			cin >> id;
			cout << "�������" << i + 1 << "����ְ������" << endl;
			cin >> name;
			cout << "��ѡ���ְ����λ" << endl << "1.��ְͨ��"
				<< endl << "2.����" << endl << "3.�ϰ�" << endl;
			Worker *worker = NULL;
			dId = _getch();
			switch (dId) {
			case '1':worker = new Employee(id, name, 1);
				break;
			case '2':worker = new Manager(id, name, 2);
				break;
			case '3':worker = new Boss(id, name, 3);
				break;
			default:
				cout << "ѡ��ְλ����ȷ����������" << endl;
				i--;
				break;
			}
			newSpace[i + m_EmpNum] = worker;
		}
		//�ͷ�ԭ���ռ�
		delete[] this->m_EmpArray;
		this->m_EmpArray = newSpace; //�������Ƕ���ָ��
		this->m_EmpNum = addNum + m_EmpNum;//1231231
		cout << "�ɹ����" << addNum << "��Ա��" << endl;
		m_FileIsEmpty = true;
		save();//���ñ��溯��
	}
	else {
		cout << "��������" << endl;
	}

}
//���溯��
void WorkerManager::save() {
		//�������ĵ�
		ofstream du;
		du.open(wenjian, ios::out);
		for (int i = 0; i <this->m_EmpNum ; i++) {
			du << m_EmpArray[i]->m_Id << " "
				<< m_EmpArray[i]->m_Name << " "
				<< m_EmpArray[i]->m_DeptId << endl;
		}
		du.close();

}
//��ӡ����Ա����Ϣ
void WorkerManager::Show_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "�ļ�������Ϣ" << endl;
	}
	else {
		for (int i = 0; i < m_EmpNum; i++) {
			this->m_EmpArray[i]->showInfo();
		}
	}
}

// ɾ��ְ��
void WorkerManager::Del_Emp() {
	;
	if (!this->m_FileIsEmpty) {
		cout << "�ļ���Ϊ��" << endl;
	}
	else {//��ʼɾ��
		int id;
		cout << "ɾ����Ա���" << endl;
		cin >> id;
		id = IsExist(id);
		if (id == -1) {
			cout << "���޴���" << endl;
		}
		else {
			for (int i = id; i < this->m_EmpNum - 2; i++) {
				this->m_EmpArray[i] = this->m_EmpArray[i + 1];
			}
			delete m_EmpArray[this->m_EmpNum-1];
			m_EmpArray[this->m_EmpNum-1] = NULL;
			this->m_EmpNum--;//������һ
			this->save();
			cout << "ɾ���ɹ�" << endl;
			//����Ϊ���ʱ����Ҫ���ļ���־����Ϊ��  ��δд
		}
	}

}
//����ְ���Ƿ����---���ݱ��
int WorkerManager::IsExist(int id) {
	int index = -1;//�Ƿ���ҵ��ı�־
	for (int i = 0; i < this->m_EmpNum; i++) {
		if (this->m_EmpArray[i]->m_Id == id) {
			index = i;
			break;
		}
	}
	return index;
}
//����ְ���Ƿ����---��������
int WorkerManager::IsExist(string name) {
	int index = -1;
	string newName = name;
	for (int i = 0; i < this->m_EmpNum; i++) {
		if (this->m_EmpArray[i]->m_Name == newName) {
			index = i;
			break;
		}
	}
	return index;
}
//�޸�ְ��
void WorkerManager::Mod_Emp() {
	if (this->m_FileIsEmpty) {
		cout << "�ļ������ڻ��¼Ϊ��,�޷��޸�" << endl;
	}
	else {
		cout << "�������޸�ְ���ı�ţ�" << endl;
		int id;
		cin >> id;
		int ret = this->IsExist(id);
		if (ret != -1) {
			//���ҵ�ְ�����
			delete this->m_EmpArray[ret];
			int newId = 0;
			string newName = "";
			int dSelect = 0;
			cout << "�鵽��" << id << "��ְ������������ְ���ţ�" << endl;
			cin >> newId;
			cout << "��������������" << endl;
			cin >> newName;
			cout << "�������λ��" << endl;
			cout << "1.��ְͨ��" << endl;
			cout << "2.����" << endl;
			cout << "3.�ϰ�" << endl;
			cin >> dSelect;
			Worker *worker = NULL;
			switch (dSelect)
			{
			case '1':worker = new Employee(newId, newName, 1);
				break;
			case '2':worker = new Manager(newId, newName, 2);
				break;
			case '3':worker = new Boss(newId, newName, 3);
				break;
			default:
				cout << "ѡ��ְλ����ȷ����������" << endl;
				Mod_Emp();
			}
			this->m_EmpArray[ret] = worker;
			cout << "�޸ĳɹ�" << endl;
		}
		else
			cout << "�޸�ʧ�ܣ����޴���" << endl;
	}
}
//����ְ��
void WorkerManager::Find_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "�ļ������ڻ��¼Ϊ��" << endl;
	}
	else {
		cout << "������ҷ�ʽ---1.ְ����Ų��ң�2.ְ����������" << endl;
		int newId;
		newId = _getch();
		if (newId == '1') {
			cout << "�������ְ�����" << endl;
			cin >> newId;
			newId = IsExist(newId);
			if (newId == -1) {
				cout << "���޴���" << endl;
			}
			else {
				cout << "��ְ����Ϣ����" << endl;
				m_EmpArray[newId]->showInfo();
			}
		}
		else if (newId == '2') {
			cout << "�������ְ������" << endl;
			string name;
			cin >> name;
			newId = IsExist(name);
			if (newId == -1) {
				cout << "���޴���" << endl;
			}
			else {
				cout << "��ְ����Ϣ����" << endl;
				m_EmpArray[newId]->showInfo();
			}
		}
		else {
			cout << "������������������" << endl;
			Find_Emp();
		}
	}
}
//����ְ��
void WorkerManager::Sort_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "�ļ�������" << endl;
	}
	else {
		//ѡ������ʽ 
		cout << "ѡ��ְ����ŵ�����ʽ��1.����2.����" << endl;
		int select;
		select = _getch();
		for (int i = 0; i < m_EmpNum; i++) {
			int minOrMax = i;
			for (int j = i + 1; j < m_EmpNum; j++) {
				if (select == '1') {
					if (m_EmpArray[minOrMax]->m_Id > m_EmpArray[j]->m_Id) {
						minOrMax = j;
					}
				}
				else   {
					if (m_EmpArray[minOrMax]->m_Id < m_EmpArray[j]->m_Id) {
						minOrMax = j;
					}
				}
			}
			if (i != minOrMax) {
				Worker*temp = m_EmpArray[i];
				m_EmpArray[i] = m_EmpArray[minOrMax];
				m_EmpArray[minOrMax] = temp;
			}
		}
		cout << "����ɹ����������" << endl;
		this->save();
		this->Show_Emp();
	}
}

//��պ���
void WorkerManager::Clean_File() {
	cout << "ȷ����գ�" << endl << "���������� 1,���������水�����" << endl;
	int select = 0;
	cin >> select;
	if (select == 1) {
		ofstream ofs(wenjian, ios::trunc);
		ofs.close();
		if (this->m_EmpArray != NULL) {
			for (int i = 0; i < this->m_EmpNum; i++) {
				if (this->m_EmpArray[i] != NULL) {
					delete this->m_EmpArray[i];

				}
				this->m_EmpNum = 0;
				delete[] this->m_EmpArray;
				this->m_EmpArray = NULL;
				this->m_FileIsEmpty = false;//�� û����
			}
		}
		cout << "��ճɹ�" << endl;
	}
	else {
		cout << "���˳���" << endl;
	}
}
//�˳�����
void WorkerManager::exitSystem() {
	cout << "��ӭ�´�ʹ��" << endl;
	system("pause");
	exit(0);//�˳�����
}
//���캯��  //���ڳ�ʼ�����򣬶�ȡ�ļ���
WorkerManager::WorkerManager() {
	ifstream ifs;
	ifs.open(wenjian, ios::in);//���ļ�
	if (!ifs.is_open()) {
		//�������ļ�������
		cout << "�ļ�������" << endl;
		//��ʼ������
		this->m_EmpNum = 0;
		//��ʼ��ָ��
		this->m_EmpArray = NULL;
		//��ʼ���ļ���־Ϊ�ձ�־
		m_FileIsEmpty = false;
		ifs.close();
	}
	else {
		char ch;
		ifs >> ch;//��ȡһ���ַ�
		if (ifs.eof()) {//��ȡһ���ַ����ٶ�ȡΪ��
			cout << "�ļ�Ϊ��" << endl;
			m_EmpNum = 0;
			m_FileIsEmpty = false;
			m_EmpArray = NULL;//�����ÿ�
			ifs.close();
		}
		else {
			m_EmpNum = get_EmpNum();
			cout << "ְ������Ϊ��" << m_EmpNum << endl;
			//�������ٷ��ص��ǵ�ַ����ֻ��һ��*�ţ��õ�����ָ�����һ��
			this->m_EmpArray = new Worker*[this->m_EmpNum];//���ٳ�ʼ�ռ�
			init_Emp();//��ʼ��Ա������ �ı�������д�����

		}
	}
}
//�ļ�����,��ȡ�ļ�����Ϣ
//ͳ������--��ʱ�ı��м�¼������
int WorkerManager:: get_EmpNum() {
	//��ȡ�ı�
	ifstream ifs;
	ifs.open(wenjian, ios::in);
	int id;
	string name;
	int dId;
	int num = 0;
	while (ifs>>id&&ifs>>name&&ifs>>dId)
	{
		//��¼����
		num++;
	}
	ifs.close();
	return num;
}
//��ʼ��Ա��
void WorkerManager::init_Emp() {
	int i = 0;
	ifstream ifs;
	ifs.open(wenjian, ios::in);
	int id;
	string name;
	int dId;
	while (ifs >> id && ifs >> name && ifs >> dId) {
		Worker *worker = NULL;//����һ��һ��ָ��
		if (dId == 1) {
			worker = new Employee(id, name, dId);//���ù��캯��������ֵ����Ӧ�������Ը�ֵ
		}
		else if (dId == 2) {
			worker = new Manager(id, name, dId);
		}
		else if (dId == 3) {
			worker = new Boss(id, name, dId);
		}
		this->m_EmpArray[i++] = worker; //����ָ�����ָ��һ��ָ��
	}
	m_FileIsEmpty = true;//��
	ifs.close(); //�ر��ı�
}
//��������
WorkerManager::~WorkerManager() {
	if (this->m_EmpArray != NULL) {
		delete[] this->m_EmpArray;
		m_EmpArray = NULL;
	}
}