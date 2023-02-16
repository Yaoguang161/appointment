#include "QtWidgetsApplication2.h"
#include "ui_QtWidgetsApplication2.h"

QtWidgetsApplication2::QtWidgetsApplication2(QWidget* parent)
	: QMainWindow(parent)
{
	ui.setupUi(this);

	//��ͷ
	QStringList header;
	header << "name" << "sex" << "age" << "address";

	ui.tableWidget->setColumnCount(header.size());                        // ���ñ�������
	ui.tableWidget->setHorizontalHeaderLabels(header);                    // ����ˮƽͷ
	ui.tableWidget->setRowCount(5);                                       // ����������
	ui.tableWidget->setEditTriggers(QAbstractItemView::NoEditTriggers);   // ���ñ�ṹĬ�ϲ��ɱ༭

	//����Ĭ��Ϊ"��"
	ui.rbn_male->setChecked(true);
	// �������
	QStringList NameList;   //�����б�
	NameList << "zhang" << "li" << "wang";
	QStringList SexList;    //�Ա��б�
	SexList << "man" << "man" << "woman";
	qint32 AgeList[3] = { 24,25,26 };//��������
	QStringList AddressList;   //סַ�б�
	AddressList << "guangdong" << "shandong" << "henan";


	// ��Ի�ȡԪ��ʹ��NameList[x] ��ʹ�� NameList.at(x)Ч����ͬ
	for (int x = 0; x < 3; x++)
	{
		int col = 0;
		// �������
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(NameList[x]));
		// ����Ա�
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(SexList.at(x)));
		// �������
		ui.tableWidget->setItem(x, col++, new QTableWidgetItem(QString::number(AgeList[x])));
		// ���סַ
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

	//���֮ǰ,���ж�username�Ƿ������TableWidget��,������ڷ���0�����ڷ���1
	bool isEmpty = ui.tableWidget->findItems(username, Qt::MatchExactly).empty();
	if (isEmpty)
	{
		ui.tableWidget->insertRow(0);    // ���������һ�п��б�
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
		// ��λ���������к�
		int row = ui.tableWidget->findItems(ui.lineEdit_name->text(), Qt::MatchExactly).first()->row();
		// �ͷ���Դ
		ui.tableWidget->removeRow(row);
	}
}

void QtWidgetsApplication2::on_pbn_alter_clicked()
{
	QTableWidgetItem* cellItem;

	// ȡ����ǰѡ����
	int curr_row = ui.tableWidget->currentRow();
	qDebug() << curr_row;

	// ѭ������
	for (int col = 0; col < ui.tableWidget->columnCount(); col++)
	{
		// Ѱ�ҵ���ǰ�е�ָ��
		cellItem = ui.tableWidget->item(curr_row, col);
		// ѭ�����������
		qDebug() << cellItem->text().toStdString().data();
		// ���������һ������,��������д�ص��б��0��
		if (col == 0)
			cellItem->setText(ui.lineEdit_name->text());
		// �ж��Ա�,���ֱ�д�ص���1��
		if (col == 1)
		{
			if (ui.rbn_male->isChecked())
				cellItem->setText("man");
			if (ui.rbn_female->isChecked())
				cellItem->setText("woman");
		}
		// �ж�����,��д�ص���3��
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
	delete(table);//�ͷŵ�ǰ��Ԫ��
}


QtWidgetsApplication2::~QtWidgetsApplication2()
{}
