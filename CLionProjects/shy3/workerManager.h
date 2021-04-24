#pragma once//防止头文件重复包含
#include<iostream>//包含输入输出流头文件
using namespace std;//使用标准命名空间
#include"worker.h"
//管理类
class WorkerManager {
public:
	//菜单界面
	void  Show_Menu();
	//退出函数
	void exitSystem();

	//添加职工
	void Add_Emp();
	//保存函数
	void save();
	//统计人数--打开时文本中记录的人数
	int get_EmpNum();
	//初始化员工
	void init_Emp();
	//显示职工
	void Show_Emp();
	//删除职工
	void Del_Emp();
	//查找删除职工是否存在--编号
	int IsExist(int id);
	//查找删除职工是否存在--姓名
	int IsExist(string id);
	//修改职工
	void Mod_Emp();
	//查找职工
	void Find_Emp();
	//排序职工
	void Sort_Emp();
	//清空函数
	void Clean_File();
	//构造函数
	WorkerManager();
	//析构函数
	~WorkerManager();
	


	//记录文件中的人数个数
	int m_EmpNum;
	//员工数组的指针
	Worker ** m_EmpArray;
	//标志文件是否为空
	bool m_FileIsEmpty;

};