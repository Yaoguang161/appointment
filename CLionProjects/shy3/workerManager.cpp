#include<iostream>
using namespace std;
#include"workerManager.h"
#include"string"
#include"boss.h"
#include"manager.h"
#include"employee.h"
#include<conio.h>
#include<fstream>//秒输入
#define wenjian "wenjian.txt"
//菜单界面
void WorkerManager::Show_Menu() {
	cout << "*********************************" << endl;
	cout << "*******欢迎使用职工管理系统******" << endl;
	cout << "******** 0.退出管理系统 *********" << endl;
	cout << "******** 1.增加职工信息 *********" << endl;
	cout << "******** 2.显示职工信息 *********" << endl;
	cout << "******** 3.删除职工信息 *********" << endl;
	cout << "******** 4.修改职工信息 *********" << endl;
	cout << "******** 5.查找职工信息 *********" << endl;
	cout << "******** 6.按照编号排序 *********" << endl;
	cout << "******** 7.清空所有文档 *********" << endl;
	cout << "*********************************" << endl;
	cout << endl;
}

//添加职工
void WorkerManager::Add_Emp() {
	cout << "请输入添加职工数量" << endl;
	//添加职工数量
	int addNum = 0;
	cin >> addNum;
	if (addNum > 0) {
		//计算空间大小  开辟新空间
		Worker **newSpace = new  Worker*[addNum + m_EmpNum];
		if (this->m_EmpArray != NULL) {//将原先的数据保存到新数组中
			for (int i = 0; i < this->m_EmpNum; i++) {
				newSpace[i] = this->m_EmpArray[i];
			}
		}
		//输入新数据
		for (int i = 0; i < addNum; i++) {
			int id;
			string name;
			char dId;
			cout << "请输入第" << i + 1 << "个新职工编号" << endl;
			cin >> id;
			cout << "请输入第" << i + 1 << "个新职工姓名" << endl;
			cin >> name;
			cout << "请选择该职工岗位" << endl << "1.普通职工"
				<< endl << "2.经理" << endl << "3.老板" << endl;
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
				cout << "选择职位不正确，重新输入" << endl;
				i--;
				break;
			}
			newSpace[i + m_EmpNum] = worker;
		}
		//释放原来空间
		delete[] this->m_EmpArray;
		this->m_EmpArray = newSpace; //两个都是二级指针
		this->m_EmpNum = addNum + m_EmpNum;//1231231
		cout << "成功添加" << addNum << "名员工" << endl;
		m_FileIsEmpty = true;
		save();//调用保存函数
	}
	else {
		cout << "输入有误" << endl;
	}

}
//保存函数
void WorkerManager::save() {
		//保存至文档
		ofstream du;
		du.open(wenjian, ios::out);
		for (int i = 0; i <this->m_EmpNum ; i++) {
			du << m_EmpArray[i]->m_Id << " "
				<< m_EmpArray[i]->m_Name << " "
				<< m_EmpArray[i]->m_DeptId << endl;
		}
		du.close();

}
//打印所有员工信息
void WorkerManager::Show_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "文件中无信息" << endl;
	}
	else {
		for (int i = 0; i < m_EmpNum; i++) {
			this->m_EmpArray[i]->showInfo();
		}
	}
}

// 删除职工
void WorkerManager::Del_Emp() {
	;
	if (!this->m_FileIsEmpty) {
		cout << "文件中为空" << endl;
	}
	else {//开始删除
		int id;
		cout << "删除人员编号" << endl;
		cin >> id;
		id = IsExist(id);
		if (id == -1) {
			cout << "查无此人" << endl;
		}
		else {
			for (int i = id; i < this->m_EmpNum - 2; i++) {
				this->m_EmpArray[i] = this->m_EmpArray[i + 1];
			}
			delete m_EmpArray[this->m_EmpNum-1];
			m_EmpArray[this->m_EmpNum-1] = NULL;
			this->m_EmpNum--;//人数减一
			this->save();
			cout << "删除成功" << endl;
			//人数为零的时候需要将文件标志更改为空  还未写
		}
	}

}
//查找职工是否存在---依据编号
int WorkerManager::IsExist(int id) {
	int index = -1;//是否查找到的标志
	for (int i = 0; i < this->m_EmpNum; i++) {
		if (this->m_EmpArray[i]->m_Id == id) {
			index = i;
			break;
		}
	}
	return index;
}
//查找职工是否存在---依据姓名
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
//修改职工
void WorkerManager::Mod_Emp() {
	if (this->m_FileIsEmpty) {
		cout << "文件不存在或记录为空,无法修改" << endl;
	}
	else {
		cout << "请输入修改职工的编号：" << endl;
		int id;
		cin >> id;
		int ret = this->IsExist(id);
		if (ret != -1) {
			//查找到职工编号
			delete this->m_EmpArray[ret];
			int newId = 0;
			string newName = "";
			int dSelect = 0;
			cout << "查到：" << id << "号职工，请输入新职工号：" << endl;
			cin >> newId;
			cout << "请输入新姓名：" << endl;
			cin >> newName;
			cout << "请输入岗位：" << endl;
			cout << "1.普通职工" << endl;
			cout << "2.经理" << endl;
			cout << "3.老板" << endl;
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
				cout << "选择职位不正确，重新输入" << endl;
				Mod_Emp();
			}
			this->m_EmpArray[ret] = worker;
			cout << "修改成功" << endl;
		}
		else
			cout << "修改失败，查无此人" << endl;
	}
}
//查找职工
void WorkerManager::Find_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "文件不存在或记录为空" << endl;
	}
	else {
		cout << "输入查找方式---1.职工编号查找，2.职工姓名查找" << endl;
		int newId;
		newId = _getch();
		if (newId == '1') {
			cout << "输入查找职工编号" << endl;
			cin >> newId;
			newId = IsExist(newId);
			if (newId == -1) {
				cout << "查无此人" << endl;
			}
			else {
				cout << "该职工信息如下" << endl;
				m_EmpArray[newId]->showInfo();
			}
		}
		else if (newId == '2') {
			cout << "输入查找职工姓名" << endl;
			string name;
			cin >> name;
			newId = IsExist(name);
			if (newId == -1) {
				cout << "查无此人" << endl;
			}
			else {
				cout << "该职工信息如下" << endl;
				m_EmpArray[newId]->showInfo();
			}
		}
		else {
			cout << "输入有误，请重新输入" << endl;
			Find_Emp();
		}
	}
}
//排序职工
void WorkerManager::Sort_Emp() {
	if (!this->m_FileIsEmpty) {
		cout << "文件不存在" << endl;
	}
	else {
		//选择排序方式 
		cout << "选择职工编号的排序方式：1.升序，2.降序" << endl;
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
		cout << "排序成功，排序后结果" << endl;
		this->save();
		this->Show_Emp();
	}
}

//清空函数
void WorkerManager::Clean_File() {
	cout << "确认清空？" << endl << "继续操作按 1,返回主界面按任意键" << endl;
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
				this->m_FileIsEmpty = false;//假 没东西
			}
		}
		cout << "清空成功" << endl;
	}
	else {
		cout << "已退出！" << endl;
	}
}
//退出函数
void WorkerManager::exitSystem() {
	cout << "欢迎下次使用" << endl;
	system("pause");
	exit(0);//退出程序
}
//构造函数  //用于初始化程序，读取文件等
WorkerManager::WorkerManager() {
	ifstream ifs;
	ifs.open(wenjian, ios::in);//读文件
	if (!ifs.is_open()) {
		//运行则文件不存在
		cout << "文件不存在" << endl;
		//初始化人数
		this->m_EmpNum = 0;
		//初始化指针
		this->m_EmpArray = NULL;
		//初始化文件标志为空标志
		m_FileIsEmpty = false;
		ifs.close();
	}
	else {
		char ch;
		ifs >> ch;//读取一个字符
		if (ifs.eof()) {//读取一个字符后再读取为空
			cout << "文件为空" << endl;
			m_EmpNum = 0;
			m_FileIsEmpty = false;
			m_EmpArray = NULL;//数组置空
			ifs.close();
		}
		else {
			m_EmpNum = get_EmpNum();
			cout << "职工个数为：" << m_EmpNum << endl;
			//堆区开辟返回的是地址，故只加一个*号，得到二级指针的下一级
			this->m_EmpArray = new Worker*[this->m_EmpNum];//开辟初始空间
			init_Emp();//初始化员工数据 文本中数据写入程序

		}
	}
}
//文件存在,读取文件中信息
//统计人数--打开时文本中记录的人数
int WorkerManager:: get_EmpNum() {
	//读取文本
	ifstream ifs;
	ifs.open(wenjian, ios::in);
	int id;
	string name;
	int dId;
	int num = 0;
	while (ifs>>id&&ifs>>name&&ifs>>dId)
	{
		//记录人数
		num++;
	}
	ifs.close();
	return num;
}
//初始化员工
void WorkerManager::init_Emp() {
	int i = 0;
	ifstream ifs;
	ifs.open(wenjian, ios::in);
	int id;
	string name;
	int dId;
	while (ifs >> id && ifs >> name && ifs >> dId) {
		Worker *worker = NULL;//创建一个一级指针
		if (dId == 1) {
			worker = new Employee(id, name, dId);//调用构造函数，传入值给相应对象属性赋值
		}
		else if (dId == 2) {
			worker = new Manager(id, name, dId);
		}
		else if (dId == 3) {
			worker = new Boss(id, name, dId);
		}
		this->m_EmpArray[i++] = worker; //二级指针接受指向一级指针
	}
	m_FileIsEmpty = true;//真
	ifs.close(); //关闭文本
}
//析构函数
WorkerManager::~WorkerManager() {
	if (this->m_EmpArray != NULL) {
		delete[] this->m_EmpArray;
		m_EmpArray = NULL;
	}
}