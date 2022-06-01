- [0.写在前面的提醒](#0写在前面的提醒)
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
- [13.对话框创建](#13对话框创建)
- [14.标准对话框QMessageBox](#14标准对话框qmessagebox)
- [15.其他常用的标准对话框](#15其他常用的标准对话框)
- [16.界面布局](#16界面布局)
- [17.常用控件](#17常用控件)
  - [按钮组](#按钮组)
  - [QListWidget](#qlistwidget)
  - [QTreeWidget树控件](#qtreewidget树控件)
  - [QTableWidget 表格控件使用](#qtablewidget-表格控件使用)
  - [其他常用控件](#其他常用控件)
- [18.自定义空间封装](#18自定义空间封装)
- [19.Qt鼠标常用实践](#19qt鼠标常用实践)
- [20.定时器](#20定时器)
- [21.定时器2](#21定时器2)
- [22.事件分发器](#22事件分发器)
- [23.事件过滤器](#23事件过滤器)
- [24.QPainter绘图](#24qpainter绘图)
- [25.绘图高级设置](#25绘图高级设置)
- [26.绘图设备](#26绘图设备)
- [27.文件读写](#27文件读写)
  - [27.1读文件](#271读文件)
  - [27.2 写文件](#272-写文件)
  - [28.文件信息类](#28文件信息类)
  
# 0.写在前面的提醒
* 万一出现无法找到头文件的情况,可以试试将`#include <smallwidget.h>` 改成 `#include "smallwidget"`
* 添加设计师类时, 可以重新添加`qt class`
* .ui界面文件无法打开,或者打开就报错,可以谷歌修改一下启动方式(exe),使用原生的方式启动,不要用vs自带的启动方式
* 

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
* 注意: qt添加资源需要编译,不然不会显示出来


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

# 13.对话框创建
* ## 13.1对话框分类:
* 模态对话框 与 非模态对话框
  * 模态对话框 不可以对其他窗口进行操作
  * 非模态对话框  可以对其他窗口进行操作
  * 模态对话框创建
    * `QDialog dlg(this);`
    * `dlg.exec()`
  * 非模态对话框创建
    * `QDialog* dlg2 = new QDialog(this);`
    * `dlg2->show();`
    * 设置属性 `dlg2->setAttribute(Qt::WA_DeleteOnClose);` 即对话框不关闭
  
 
# 14.标准对话框QMessageBox
* 利用静态成员函数可以弹出警告,询问,信息,错误对话框
* 参数1: 父窗口;参数二: 标题; 参数3:提示信息; 参数4:按键类型; 参数5: 默认关联回车按键;
* `QMessageBox::question(this, "询问", "question", QMessageBox::Save | QMessageBox::Cancel, QMessageBox::Cancel)`
* 返回值代表用户选择按钮
 

# 15.其他常用的标准对话框
* 颜色对话框 `QColor color = QColorDialog::getColor(Qt::red);`
* 文件对话框`QString fileName = QFileDialog::getOpenFileName(this, "打开文件", "C:\\Users\\Asaki\\Desktop", "(*.txt)");`
* 字体对话框
``` C++
		bool flag;
		QFont font = QFontDialog::getFont(&flag, QFont("华文彩云", 36));
		qDebug() << "字体" << font.family().toUtf8().data()
			<< "字号" << font.pointSize()
			<< "是否加粗: " << font.bold()
			<< "是否倾斜" << font.italic();
```

# 16.界面布局
1. 设计登录窗口(经典宽高369px,270px)
2. 有用户名,密码,编辑框,登录和退出按钮
3. 灵活运用弹簧进行界面布局

# 17.常用控件
## 按钮组
* `QPushButton`最常用按钮,里面可以加图片
* `QToolButton`工具按钮,用于显示图片
  * `toolButtonStyle`设置显示图片和文件
  * `autoRalse`透明凸起效果
* `QRadioButton`单选按钮
  * 默认选中 `setChecked(true)`
* `QCheckBox`复选按钮
  * `stateChanged`信号
  * 未选中  0
  * 半选中 1
  * 选中  2
## QListWidget
1. 创建项`QListWidgetItem* item = new QListWidgetItem("锄禾日当午");`
2. 将项目添加到控件中
3. `ui->listWidget->addItem(item);`
4. 设置对其方式`item->setTextAlignment(Qt::AlignHCenter);`
5. `ui->listWidget->additems(list);` 可以一次性放入所有内容

## QTreeWidget树控件
1. 设置头 `ui.treeWidget->setHeaderLabels(QStringList() << "英雄" << "英雄简介");`
2. 创建根项目`QTreeWidgetItem* liItem = new QTreeWidgetItem(QStringList() << "力量");`
3. 将根放入树控件中`ui.treeWidget->addTopLevelItem(liItem);`
4. 挂载子项目`QTreeWidgetItem* l1 = new QTreeWidgetItem(heroL1);`
	`liItem->addChild(l1);`


## QTableWidget 表格控件使用
1.	设置列  `ui->tableWidget->setColumnCount(3);`
2.	设置水平表头  `ui->tableWidget->setHorizontalHeaderLabels(QStringList()<<"姓名"<<"性别"<<"年龄");`
3.	设置行数  `ui->tableWidget->setRowCount(5);`
4.	设置正文 
5.	`ui->tableWidget->setItem(行,列 , new QTableWidgetItem(“字符串”));`
## 其他常用控件
1.	栈控件  
  a.	`ui->stackedWidget->setCurrentIndex(0); `   
  b.	切换栈显示内容
2. 下拉框
	a. `ui->comboBox->addItem("奔驰");  `
  b. 设置选中   
  c. `ui->comboBox->setCurrentIndex(2);  `
  d. `ui->comboBox->setCurrentText("拖拉机");`  
3.	Qlabel显示图片
  ```C++
    	ui->label_img->setPixmap(QPixmap(":/Image/butterfly.png"));
  ```
4. 	QLabel显示gif图片
  a. `QMovie * movie =new QMovie(":/Image/mario.gif");`
  b. `ui->label_movie->setMovie(movie);`
  c. `movie->start();`


# 18.自定义空间封装
1. 右键项目- 添加新文件
2. Qt -Qt设计师界面类 (vs中使用添加qt class会出现头文件和cpp文件,ui文件,不要自己单独一个一个添加,没有关联起来)
3. 在ui文件中设计自定义空间
4. 在主窗口中 拖拽 widget做提升的操作
5. 在自定义控件中 封装对外接口
   1. SpinBox 和 slider 控件交互
   2. getData 获取显示数字
   3. setData设置数字


# 19.Qt鼠标常用实践
1. 鼠标进入 `EnterEvent`
2. 鼠标离开 `LeaveEvent`
3. 鼠标按下 `MousePressEvent`
4. 鼠标释放 `MouseReleaseEvent`
5. 鼠标移动 `MouseMoveEvent`
6. 获取 x和y的坐标 `ev->x()` 和 `ev->y()`
7. 判断如果左键按下 `ev->button()` 或者移动 `ev->butons() & `
8. 设置鼠标追踪状态 `setMouseTracking(true)`

# 20.定时器
1. 定时器时间 `void timerEvent(QTimerEvent *e);`
2. 启动定时器 `id1 = startTimer(毫秒)`
3. 判断具体定时器的标志 `e->timerId() == id1`

# 21.定时器2
1. 通过定时器类实现  `QTimer类`
2. 创建定时器对象 `QTimer *timer1 = new QTimer(this);`
3. 开启定时器 `timer1 ->start(x毫秒)`
4. 每隔x毫秒 会抛出一个信号timeout出来
5. 监听信号处理逻辑
6. 暂停定时器 `time1 -> stop();`

# 22.事件分发器
* 用途: 用于分发事件
* 原型: `bool event(QEvent *e)`
* 返回值如果是`true`用户代表用户自己处理事件,不在向下分发
  

# 23.事件过滤器
1. 给控件安装过滤器 `ui.label->installEventFilter(this);`
2. 重写过滤器事件
`bool Widget::eventFilter(QObject* obj, QEvent* e)`

# 24.QPainter绘图
1. 绘图事件 `void painEvent(QPaintEvent);`
2. 创建画家 `QPainter painter(this);` this代表绘图设备
3. 画线,圆,矩形,文字
4. 设置画笔, `QPen painter.setPen()` 设置笔宽度,风格
5. 设置画刷 `QBrush painter.setBrush();` 设置画刷风格


# 25.绘图高级设置
1. 设置抗锯齿 `painter.setRenderHint(QPainter::Antialiasing);`
2. 移动画家 `painter.translate(100,0);`
3. 保存画家状态 `painter.save();`
4. 取出画家状态 `painter.restore();`
5. 利用画家画资源图片`painter.drawPixmap(posX,0,QPixmap(":/Image/Luffy.png"));`
6. 手动调用绘图事件 `update();`

# 26.绘图设备
1. `QPixmap` 对不同的平台显示做了优化
2. `QImage` 可以对像素级进行访问
3. `Qpicture`  记录和重新绘图指令


# 27.文件读写
## 27.1读文件
1. `QFile file(文件路径)`
2. `file.open() `指定打开方式, `QIODevice::ReadOnly`
3. 利用`file.readAll`一次性全部读取
4. 利用`file.readLine`按行读取
5. `file.close`关闭文件对象
6. 读取`gbk`格式
   1. `QTextCodec *codec = QTextCodec::codecForName("gbk");`
   2. `codec0>toUnicode(array)`
## 27.2 写文件
1. `QFile file(路径)`
2. `file.open(QIODevice::Append); //QIODevice::Append 追加的方式写文件
3. `file.write("啊啊啊啊");`
4. `file.colse();`


## 28.文件信息类
1. `QFileInfo(路径)`
2. `info`获取文件信息
3. 后缀名: `suffix` 文件大小 : `size` 文件名: `filename` 文件路径 `filePath`
4. 创建日期: create() //已经弃用可以使用`info.fileTime(QFileDevice::FileBirthTime)`替换

