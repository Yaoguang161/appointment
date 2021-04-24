#include<iostream>
using namespace std;
#include"employee.h"

//显示个人信息
void Employee::showInfo() {
	cout << "职工编号" << this->m_Id
		<< "\t姓名" << this->m_Name
		<< "\t岗位" << this->getDeptName()
		<<"\t完成经理交给的任务"<< endl;
}

//获取职工岗位名称
string Employee::getDeptName() {
	return string("员工");
}

//构造函数  //传入数据保存
Employee::Employee(int  id,string name ,int dId) {
	 this->m_Id=id; 
	 this->m_Name=name;
	 this->m_DeptId=dId;
}

