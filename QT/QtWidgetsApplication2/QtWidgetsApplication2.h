#pragma once

#include <QtWidgets/QMainWindow>
#include <QLabel>
#include "ui_QtWidgetsApplication2.h"
#include <QTableWidget>

class QtWidgetsApplication2 : public QMainWindow
{
	Q_OBJECT


public:
	QtWidgetsApplication2(QWidget* parent = nullptr);
	~QtWidgetsApplication2();

public slots:
	void on_pbn_add_clicked();
	void on_pbn_del_clicked();
	void on_pbn_release_clicked();
	void on_pbn_alter_clicked();


private:
	Ui::QtWidgetsApplication2Class ui;
};
