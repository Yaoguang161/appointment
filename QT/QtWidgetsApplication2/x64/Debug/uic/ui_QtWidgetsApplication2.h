/********************************************************************************
** Form generated from reading UI file 'QtWidgetsApplication2.ui'
**
** Created by: Qt User Interface Compiler version 6.3.0
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_QTWIDGETSAPPLICATION2_H
#define UI_QTWIDGETSAPPLICATION2_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QGroupBox>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QTableWidget>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_QtWidgetsApplication2Class
{
public:
    QWidget *centralWidget;
    QTableWidget *tableWidget;
    QLabel *label_name;
    QLineEdit *lineEdit_name;
    QLabel *label_sex;
    QLabel *label_age;
    QLabel *label_address;
    QGroupBox *groupBox;
    QRadioButton *rbn_male;
    QRadioButton *rbn_female;
    QLineEdit *lineEdit_age;
    QLineEdit *lineEdit_address;
    QPushButton *pbn_add;
    QPushButton *pbn_del;
    QPushButton *pbn_alter;
    QPushButton *pushButton_4;

    void setupUi(QMainWindow *QtWidgetsApplication2Class)
    {
        if (QtWidgetsApplication2Class->objectName().isEmpty())
            QtWidgetsApplication2Class->setObjectName(QString::fromUtf8("QtWidgetsApplication2Class"));
        QtWidgetsApplication2Class->resize(840, 513);
        centralWidget = new QWidget(QtWidgetsApplication2Class);
        centralWidget->setObjectName(QString::fromUtf8("centralWidget"));
        tableWidget = new QTableWidget(centralWidget);
        tableWidget->setObjectName(QString::fromUtf8("tableWidget"));
        tableWidget->setGeometry(QRect(10, 10, 551, 481));
        label_name = new QLabel(centralWidget);
        label_name->setObjectName(QString::fromUtf8("label_name"));
        label_name->setGeometry(QRect(570, 40, 54, 16));
        lineEdit_name = new QLineEdit(centralWidget);
        lineEdit_name->setObjectName(QString::fromUtf8("lineEdit_name"));
        lineEdit_name->setGeometry(QRect(640, 40, 113, 20));
        label_sex = new QLabel(centralWidget);
        label_sex->setObjectName(QString::fromUtf8("label_sex"));
        label_sex->setGeometry(QRect(570, 90, 54, 16));
        label_age = new QLabel(centralWidget);
        label_age->setObjectName(QString::fromUtf8("label_age"));
        label_age->setGeometry(QRect(570, 150, 54, 16));
        label_address = new QLabel(centralWidget);
        label_address->setObjectName(QString::fromUtf8("label_address"));
        label_address->setGeometry(QRect(570, 200, 54, 16));
        groupBox = new QGroupBox(centralWidget);
        groupBox->setObjectName(QString::fromUtf8("groupBox"));
        groupBox->setGeometry(QRect(640, 70, 111, 51));
        rbn_male = new QRadioButton(groupBox);
        rbn_male->setObjectName(QString::fromUtf8("rbn_male"));
        rbn_male->setGeometry(QRect(10, 20, 31, 20));
        rbn_female = new QRadioButton(groupBox);
        rbn_female->setObjectName(QString::fromUtf8("rbn_female"));
        rbn_female->setGeometry(QRect(50, 20, 41, 20));
        lineEdit_age = new QLineEdit(centralWidget);
        lineEdit_age->setObjectName(QString::fromUtf8("lineEdit_age"));
        lineEdit_age->setGeometry(QRect(640, 150, 113, 20));
        lineEdit_address = new QLineEdit(centralWidget);
        lineEdit_address->setObjectName(QString::fromUtf8("lineEdit_address"));
        lineEdit_address->setGeometry(QRect(640, 200, 113, 20));
        pbn_add = new QPushButton(centralWidget);
        pbn_add->setObjectName(QString::fromUtf8("pbn_add"));
        pbn_add->setGeometry(QRect(570, 250, 75, 24));
        pbn_del = new QPushButton(centralWidget);
        pbn_del->setObjectName(QString::fromUtf8("pbn_del"));
        pbn_del->setGeometry(QRect(660, 250, 75, 24));
        pbn_alter = new QPushButton(centralWidget);
        pbn_alter->setObjectName(QString::fromUtf8("pbn_alter"));
        pbn_alter->setGeometry(QRect(740, 250, 75, 24));
        pushButton_4 = new QPushButton(centralWidget);
        pushButton_4->setObjectName(QString::fromUtf8("pushButton_4"));
        pushButton_4->setGeometry(QRect(614, 290, 181, 24));
        QtWidgetsApplication2Class->setCentralWidget(centralWidget);

        retranslateUi(QtWidgetsApplication2Class);

        QMetaObject::connectSlotsByName(QtWidgetsApplication2Class);
    } // setupUi

    void retranslateUi(QMainWindow *QtWidgetsApplication2Class)
    {
        QtWidgetsApplication2Class->setWindowTitle(QCoreApplication::translate("QtWidgetsApplication2Class", "QtWidgetsApplication2", nullptr));
        label_name->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\345\247\223\345\220\215:", nullptr));
        label_sex->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\346\200\247\345\210\253:", nullptr));
        label_age->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\345\271\264\351\276\204", nullptr));
        label_address->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\344\275\217\345\235\200", nullptr));
        groupBox->setTitle(QCoreApplication::translate("QtWidgetsApplication2Class", "GroupBox", nullptr));
        rbn_male->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\347\224\267", nullptr));
        rbn_female->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\345\245\263", nullptr));
        pbn_add->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\346\267\273\345\212\240", nullptr));
        pbn_del->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\345\210\240\351\231\244", nullptr));
        pbn_alter->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\344\277\256\346\224\271", nullptr));
        pushButton_4->setText(QCoreApplication::translate("QtWidgetsApplication2Class", "\345\210\240\351\231\244\346\237\220\344\270\200\345\215\225\345\205\203\346\240\274", nullptr));
    } // retranslateUi

};

namespace Ui {
    class QtWidgetsApplication2Class: public Ui_QtWidgetsApplication2Class {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_QTWIDGETSAPPLICATION2_H
