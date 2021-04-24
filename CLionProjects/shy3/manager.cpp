#include<iostream>
using namespace std;
#include"manager.h"

//显示个人信息
void Manager::showInfo(){
	cout << "职工编号" << this->m_Id
		<< "\t姓名" << this->m_Name
		<< "\t岗位" << this->getDeptName()
		<< "\t完成老板交给的任务" << endl;
}

//获取职工岗位名称
string Manager::getDeptName() {
	return string("经理");
}

//构造函数  //传入数据保存
Manager:: Manager(int  id, string name, int dId) {
	this->m_Id = id;
	this->m_Name = name;
	this->m_DeptId = dId;
}