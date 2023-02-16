#include "QtWidgetsApplication2.h"
#include "ui_QtWidgetsApplication2.h"

QtWidgetsApplication2::QtWidgetsApplication2(QWidget* parent)
	: QMainWindow(parent)
{
	ui.setupUi(this);

	//表头
	QStringList header;
	header << "name" << "sex" << "age" << "address";

	ui.tableWidget->setColumnCount(header.size());                        // 设置表格的列数
	ui.tableWidget->setHorizontalHeaderLabels(header);                    // 设置水平头
	ui.tableWidget->setRowCount(5);                                       // 设置总行数
	ui.tableWidget->setEditTriggers(QAbstractItemView::NoEditTriggers);   // 设置表结构默认不可编辑

	//设置默认为"男"
	ui.rbn_male->setChecked(true);
	// 填充数据
	QStringList NameList;   //姓名列表
	NameList << "zhang" << "li" << "wang";
	QStringList SexList;    //性别列表
	SexList << "man" << "man" << "woman";
	qint32 AgeList[3] = { 24,25,26 };//年龄数组
	QStringList AddressList;   //住址列表
	AddressList << "guangdong" << "shandong" << "henan";


	// 针对获取元素使用NameList[x] 和使用 NameList.at(x)效果相同
	for (int x = 0; x < 3; x++)
	{
		int col = 0;
		// 添加姓名
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(NameList[x]));
		// 添加性别
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(SexList.at(x)));
		// 添加年龄
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(QString::number(AgeList[x])));
		// 添加住址
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(AddressList.at(x)));
	}

}
void QtWidgetsApplication2::on_pbn_add_clicked()
{
	QString username = ui.lineEdit_name->text();
	QString usersex = "man";
	int userage = 0;
	QString useraddress = ui.lineEdit_address->text();

	if (ui.rbn_male->isChecked())
		usersex = "man";
	if (ui.rbn_female->isChecked())
		usersex = "woman";

	userage = (ui.lineEdit_age->text()).toInt();

	//添加之前,先判断username是否存在于TableWidget中,如果存在返回0不存在返回1
	bool isEmpty = ui.tableWidget->findItems(username, Qt::MatchExactly).empty();
	if (isEmpty)
	{
		ui.tableWidget->insertRow(0);    // 在行首添加一行空列表
		ui.tableWidget->setItem(0, 0, new QTableWidgetItem(username));
		ui.tableWidget->setItem(0, 1, new QTableWidgetItem(usersex));
		ui.tableWidget->setItem(0, 2, new QTableWidgetItem(QString::number(userage)));
		ui.tableWidget->setItem(0, 3, new QTableWidgetItem(useraddress));
	}
}


void QtWidgetsApplication2::on_pbn_del_clicked()
{
	bool isEmpty = ui.tableWidget->findItems(ui.lineEdit_name->text(), Qt::MatchExactly).empty();
	if (!isEmpty)
	{
		// 定位到所在行行号
		int row = ui.tableWidget->findItems(ui.lineEdit_name->text(), Qt::MatchExactly).first()->row();
		// 释放资源
		ui.tableWidget->removeRow(row);
	}
}

void QtWidgetsApplication2::on_pbn_alter_clicked()
{
	QTableWidgetItem* cellItem;

	// 取出当前选中行
	int curr_row = ui.tableWidget->currentRow();
	qDebug() << curr_row;

	// 循环列数
	for (int col = 0; col < ui.tableWidget->columnCount(); col++)
	{
		// 寻找到当前列的指针
		cellItem = ui.tableWidget->item(curr_row, col);
		// 循环输出列名称
		qDebug() << cellItem->text().toStdString().data();
		// 先来处理第一个姓名,读出来并写回到列表第0列
		if (col == 0)
			cellItem->setText(ui.lineEdit_name->text());
		// 判断性别,并分别写回到第1列
		if (col == 1)
		{
			if (ui.rbn_male->isChecked())
				cellItem->setText("man");
			if (ui.rbn_female->isChecked())
				cellItem->setText("woman");
		}
		// 判断年龄,并写回到第3列
		if (col == 2)
			cellItem->setText(ui.lineEdit_age->text());
		if (col == 3)
			cellItem->setText(ui.lineEdit_address->text());
	}
}

void QtWidgetsApplication2::on_pbn_release_clicked()
{
	int row = ui.tableWidget->currentRow();
	qDebug() << row;

	QTableWidgetItem* table = ui.tableWidget->currentItem();
	delete(table);//释放当前单元格
}


QtWidgetsApplication2::~QtWidgetsApplication2()
{}
