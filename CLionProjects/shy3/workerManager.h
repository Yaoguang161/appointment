#pragma once//��ֹͷ�ļ��ظ�����
#include<iostream>//�������������ͷ�ļ�
using namespace std;//ʹ�ñ�׼�����ռ�
#include"worker.h"
//������
class WorkerManager {
public:
	//�˵�����
	void  Show_Menu();
	//�˳�����
	void exitSystem();

	//���ְ��
	void Add_Emp();
	//���溯��
	void save();
	//ͳ������--��ʱ�ı��м�¼������
	int get_EmpNum();
	//��ʼ��Ա��
	void init_Emp();
	//��ʾְ��
	void Show_Emp();
	//ɾ��ְ��
	void Del_Emp();
	//����ɾ��ְ���Ƿ����--���
	int IsExist(int id);
	//����ɾ��ְ���Ƿ����--����
	int IsExist(string id);
	//�޸�ְ��
	void Mod_Emp();
	//����ְ��
	void Find_Emp();
	//����ְ��
	void Sort_Emp();
	//��պ���
	void Clean_File();
	//���캯��
	WorkerManager();
	//��������
	~WorkerManager();
	


	//��¼�ļ��е���������
	int m_EmpNum;
	//Ա�������ָ��
	Worker ** m_EmpArray;
	//��־�ļ��Ƿ�Ϊ��
	bool m_FileIsEmpty;

};