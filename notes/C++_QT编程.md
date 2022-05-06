- [1.QT简介](#1qt简介)
- [2.pro文件介绍](#2pro文件介绍)
- [3.qt项目创建](#3qt项目创建)
- [4.快捷键](#4快捷键)
- [5.QPushButton按钮](#5qpushbutton按钮)
- [6.对象模型(对象树)](#6对象模型对象树)
- [7.QT中信号和槽基本使用](#7qt中信号和槽基本使用)
- [8.自定义信号和槽](#8自定义信号和槽)
  - [8.1自定义信号](#81自定义信号)
  - [8.2自定义槽函数](#82自定义槽函数)
  - [8.3发生重载时](#83发生重载时)
  - [8.4将QString 转为 Char *](#84将qstring-转为-char-)
- [9.信号和槽的扩展](#9信号和槽的扩展)
- [10.qt4信号和槽的写法](#10qt4信号和槽的写法)
- [11.Lambda表达式](#11lambda表达式)
- [12.QMainWindow](#12qmainwindow)
  - [12.1资源文件添加(vs2019方式不太一样)](#121资源文件添加vs2019方式不太一样)
  
# 1.QT简介
* 1991年由奇趣科技开发
* 支持的平台: XP,win7,win8,win10,mac,嵌入式linux
* qt分为商业版和开源版

# 2.pro文件介绍
```C++
QT       += core gui   //qt包含的模块

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets  //当你的qt版本大于4 多一个widgets模块

TARGET = 01_Qtfirst  //生成的.exe程序的名称
TEMPLATE = app     //模板


SOURCES += main.cpp\    //源文件
        mywidget.cpp

HEADERS  += mywidget.h  //头文件

```

# 3.qt项目创建
* 项目名称不能有空格和中文
* 项目路径不能有中文路径
* 创建窗口的三大基类
    * Qwidget
    * QMainWindow
    * QDialog
* Main函数中
    * QApplication a 应用程序对象在QT中有且仅有一个
    * MyWidget w 窗口对象
    * w.show 函数显示窗口
    * return a.exec() 进入消息循环机制,阻塞功能
```C++
#include "mywidget.h"
#include <QApplication>  //应用程序类

//程序的入口 argc命令行变量数量   命令行变量的数组
int main(int argc, char *argv[])
{

    //a 应用程序对象  在QT中 应用程序对象 有且仅有一个
    QApplication a(argc, argv);

    //通过 窗口类 实例化对象
    MyWidget w;
    //窗口类是不会默认弹出的,需要调用show方法进行显示
    w.show();

    //a.exec() 进入消息循环机制 阻塞功能
    return a.exec();
}

```

# 4.快捷键
* 运行 `Ctrl + R`
* 编译 `Ctrl + B`
* 查询 `Ctrl + F`
* 注释 `Ctrl + /`
* 帮助文档 `F1`
* 字体缩放 `ctrl + 鼠标滚轮`
* 整行代码移动  `ctrl + shitf + ↑ ↓`
* 自动对齐 `ctrl + i`
* 同名之间的.h .cpp切换   ` F4`
* 帮助文档 F1 左侧列表按钮  或`F:\Qt\qt\5.6\mingw49_32\bin\assistant.exe` QT帮助文档


# 5.QPushButton按钮
* `QpushButton * btn = new QPushButton;` 创建按钮对象
* `but->setParent(this)` 设置父亲
* 设置显示文本 `setText`
* 移动 `move`
* 重置窗口大小 `resize`
* 设置固定窗口大小 `setFixedSize`
* 设置窗口标题 `setWindowTitle`



# 6.对象模型(对象树)
* 一定层度上简化类内存回收机制
* 当创建创建的对象 指定的父亲是由QObject 或者 Object 派生的类时候,这个对象被加载到对象树上,当窗口关闭的时候,树上的对象也会被释放掉
  
# 7.QT中信号和槽基本使用
* 需求: 点击按钮关闭窗口
* 连接 connect(信号的发送者,发送的信号,信号的接受者,处理的函数)
* `connect(myBtn,&MyPuhsButton::cliked,this,&MyWidget::close)`
  

# 8.自定义信号和槽
## 8.1自定义信号
1. 自定义信号写在 signals下
2. 返回值是void
3. 只需要声明, 不需要实现
4. 可以只有参数,可以发生重载
## 8.2自定义槽函数
1. 写在public或者全局函数 或 public slot 或者lambda
2. 返回值是void
3. 需要声明,也需要实现
4. 可以有参数,可以发生重载
## 8.3发生重载时
当信号和槽发生重载时,需要利用函数指针明确指出函数地址.
* `void (Teacher:: *teacherSignal)(QString) = &Teacher::hungry;`
## 8.4将QString 转为 Char *
1. `.toUtf8()`转为`QByteArray`数据类型
2. `.data() `转为`Char * `类型


# 9.信号和槽的扩展
1. 信号是可以连接信号  
2. 信号可以断开连接  
3. 一个信号可以连接多个槽函数  
4. 多个信号可以连接同一个槽函  
5. 信号和槽函数的参数类型必须一一对应,
信号的参数个数 可以多余槽函数的参数个数,但是反之不可以,参数类型还是要一一对应


# 10.qt4信号和槽的写法
* 优势: 参数直观
* 劣势: 参数类型不做匹配检测
* qt4 本质:  `SIGNAL(hungry(int)与SLOT(treat(QString))` 不匹配

# 11.Lambda表达式
* 组成 :[]()mutable  -> type{}组成
* []中可以加= & a  &a ...推荐使用 = 
* () 形参列表 
* {} 实现体
* mutable 可以修改按值传递进来的拷贝
* -> type 代表lambda表达式返回值类型

# 12.QMainWindow
* QMainWindow是一个为用户提供主窗口的类,是许多应用程序的基础
* 包含
  * 1. 一个菜单栏
  * 2. 多个工具栏
  * 3. 多个锚接部件
  * 4. 一个状态栏
  * 5. 一个中心部件
* 1. 菜单栏 只能有一个
  * `QMenuBar* bar = menuBar();`
  * `setMenuBar(bar)`设置到窗口中
  * `QMenu* menu = bar->addMenu("文件")`添加菜单
  * `QAction* newAction = menu->addAction("新建");` 添加菜单项
  * 添加分割线`fileMenu->addSeparator();`
* 2. 工具栏 可以有多个
  * ` QToolBar* toolbar = new QToolBar();`
  * `addToolBar(默认停靠范围 Qt::LeftToolBarArea,toolbar);` 添加到窗口中
  * 设置只允许左右停靠. `setAllowedArea`
  * 设置浮动.`setFloatable`
  * 设置移动 `setMovable`
* 3. 状态栏只能有一个
  * `QStatusBar* stBar = statusBar();`
  * `setStatusBar(stBar);`
  * `stBar->addWidget(label1);`左侧信息添加
  * `stBar->addPermanentWidget(label2);`左侧信息添加
* 4. 铆接部件 可以有多个
  * `QDockWidget* dockWidget = new QDockWidget`
  * `addDockWidget(Qt::BottomDockWidgetArea,dock);` 添加到窗口中
  * `	dock->setAllowedAreas(Qt::LeftDockWidgetArea | Qt::RightDockWidgetArea);`设置后期的停靠范围
* 5. 核心部件 只能有一个
  * `setCentralWidget(edit);`

## 12.1资源文件添加(vs2019方式不太一样)
* 将资源文件放入项目下
* 右键项目->添加文件 ->Qt->Qt Recourse File
* 给资源文件起名 res 生成 res.qrc
* 用编辑的方式打开 res.qrc
* 添加前置  - 添加文件
* 使用" : + 前缀名 + 文件名"