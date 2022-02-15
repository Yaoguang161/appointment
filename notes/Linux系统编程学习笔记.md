
- [1.Linux文件介绍](#1linux文件介绍)
- [2.文件操作](#2文件操作)
  - [2.1文件编辑操作](#21文件编辑操作)
  - [2.2 Linux系统文件类型](#22-linux系统文件类型)
  - [2.3文件查看操作](#23文件查看操作)
- [3.软链接与硬链接](#3软链接与硬链接)
- [4.查看修改用户和用户组](#4查看修改用户和用户组)
- [5.find命令](#5find命令)
- [6.grep命令: 找文件内容](#6grep命令-找文件内容)
- [7.压缩文件和下载文件](#7压缩文件和下载文件)
- [8.Vim基本操作](#8vim基本操作)
  - [8.1 vim基本操作-跳转和删字符](#81-vim基本操作-跳转和删字符)
  - [8.2 vim基本操作-删除](#82-vim基本操作-删除)
  - [8.3 vim基本操作-复制粘贴](#83-vim基本操作-复制粘贴)
  - [8.4 vim基本操作-查找和替换](#84-vim基本操作-查找和替换)
  - [8.5 vim基本操作-其他(分屏)](#85-vim基本操作-其他分屏)
- [9.gcc编译](#9gcc编译)
- [10.动态库与静态库](#10动态库与静态库)
  - [10.1对比](#101对比)
  - [10.2静态库制作及使用](#102静态库制作及使用)
  - [10.3动态库及使用](#103动态库及使用)
- [11. gdb调试工具 (大前提,程序是你自己写的)](#11-gdb调试工具-大前提程序是你自己写的)
  - [11.1基础指令](#111基础指令)
  - [11.2 其他指令](#112-其他指令)
- [12.Makefile项目管理](#12makefile项目管理)
- [13.open函数()](#13open函数)
- [14.link函数和UNlink隐式回收](#14link函数和unlink隐式回收)
  - [14.1link函数](#141link函数)
  - [14.2Unlink函数](#142unlink函数)
- [15.文件目录rwx权限差异](#15文件目录rwx权限差异)
- [16.目录操作函数](#16目录操作函数)
  - [16.1 opendir函数和closedir函数](#161-opendir函数和closedir函数)
  - [16.2read函数和write函数](#162read函数和write函数)
- [17.文件描述符fd](#17文件描述符fd)
  - [17.1文件描述符合打开文件之间的关系](#171文件描述符合打开文件之间的关系)
- [18.阻塞.非阻塞](#18阻塞非阻塞)
- [19.递归遍历目录](#19递归遍历目录)
- [20.重定向dup和dup2](#20重定向dup和dup2)
- [21.fcntl函数实现dup](#21fcntl函数实现dup)
- [22.进程相关概念](#22进程相关概念)
- [23.进程控制块PCB](#23进程控制块pcb)
- [24.进程控制](#24进程控制)
  - [24.1fork函数](#241fork函数)
  - [24.2父子进程gdb调试](#242父子进程gdb调试)
  - [24.3孤儿进程](#243孤儿进程)
  - [24.4僵尸进程](#244僵尸进程)
  - [24.5wait函数和waitpid函数](#245wait函数和waitpid函数)
  - [24.6exec函数族](#246exec函数族)
- [25.进程间通信](#25进程间通信)
  


# 1.Linux文件介绍

`Linux`系统中 "所见皆文件" 

1. `bin`:主要可执行文件
2. `boot` 开机时加载的系统文件
3. `etc` 用户的配置文件和用户信息
4. `home` 存放用户
5. `lib` 库文件
6. `root` 管理员宿主目录(家目录)
7. `usr` 用户安装的第三方库或者文件,用户资源管理文件

# 2.文件操作

## 2.1文件编辑操作

1. `ls -Rl` 递归展示所有文件信息
2. `which` 查看指定命令所在路径
3. `rmdir  文件名`: 删除空目录
4. `cp 文件A 文件B`: 拷贝文件

## 2.2 Linux系统文件类型

* 普通文件:  -

* 目录文件: d

* 字符设备文件:  c

* 块设备文件 :  b

* 软连接 : l

* 管道文件 : p

* 套接字: s

* 未知文件

  Linux中一共有八种文件

## 2.3文件查看操作

1. `cat 文件名`: 查看当前文件的内容
2. `tac 文件名`: 倒着显示文件中的内容(查看日志会使用)
3. `more 文件名`: 可以分屏显示文件(按空格翻页
4. `head 文件名`: 显示默认前10行
5. `tail 文件名`: 显示后10行
6. `tree 文件名`: 按树形显示文件目录
7. `readlink 文件名`: 读取符号连接文件本身内容,得到链接所指向的文件名. 

# 3.软链接与硬链接

软链接:   为了保证软连接可以任意搬移,创建时晚上务必使用绝对路径

硬链接:   修改其中一个文件,其硬链接的文件也会发生变化.操作系统给每一个文件赋予唯一的 `inode,` 当有相同的 `inode` 的文件存在时, 彼此同步.删除时,只将硬链接计数减一. 减为0 时, `inode`被释放.

1. `ln -s file file.s` :  软链接相当于`windows`中的快捷方式 (第一个文件使用绝对路径)
2. `ln file file.hard`: 硬链接 相当于指针,同一个地址指向三个文件.但是思想不同,指针对于内存,硬链接对于硬盘,但是硬链接有着相同的`Inode`,即相同的文件编号.



# 4.查看修改用户和用户组

1. `whoami` : 查看当前用户(`root` 或普通用户)
2. `exit` : 退出`root`用户
3. `chmod  u+x  文件名`: 给文件加一个执行权限.
4. `sudo adduser 新用户名:` 添加用户
5. `sudo chown 新用户名 待修改文件名`:  修改文件所属权限.
6. `sudo addgroup 新用户组:` 添加新用户组



# 5.find命令

1. `find ./ - maxdepth 1 - name '*.jpg'` : 查找一层目录下的所有.jpg文件
2. `find ./ - maxdepth 2 - name '*.jpg':` 查找两层目录下的所有.jpg文件

find命令: 找文件

   * `-type` 按文件类型搜索 `d/p/s/c/b/l/f` : 文件
   * `-name` 按文件名搜索 
     * `find ./ -name "file*.jpg"`
   * -`maxdepth` 指定搜索深度,. 应作为第一个参数出现.
     * `find ./ -maxdepth 1 -name "*.jpg"`

   * `-size` 按文件大小搜索 .单位 : k,M,G

     * `find  /home/itcast -size +20M -size -50M`

     

     -`atime ,mtime , ctime` 天 `amin ,mmin,cmin`分钟

     `-exec`: 将find搜索的结果集执行某一指定命令

     `-ok:` 以交互的方式,将find搜索的结果集执行某一指定命令

     

     

     

# 6.grep命令: 找文件内容

1. grep -r 'copy' ./ -n
2. ps aux | grep 'cupsd' --检索教程结果集.

# 7.压缩文件和下载文件





略



# 8.Vim基本操作

## 8.1 vim基本操作-跳转和删字符

`i` 进入编辑模式，光标前插入字符 

`a` 进入编辑模式，光标后插入字符

`o` 进入编辑模式，光标所在行的下一行插入

`I` 进入编辑模式，光标所在行的行首插入

`A` 进入编辑模式，光标所在行的行末插入字符

`O` 进入编辑模式，光标所在行的上一行插入字符

`s` 删除光标所在字符并进入编辑模式

`S` 删除光标所在行并进入编辑模式

`x` 删除光标所在字符，工作模式不变

`dw` 删除光标所在单词，要求光标在首字母上，如果不在首字母，只会删除当前位置到单词
末，工作模式不变

`D`  删除光标所在位置到行末，工作模式不变

`0`(数字) 光标移到行首，工作模式不变

`$` 光标移到行尾，工作模式不变

`d0` 删除光标所在位置到行首，工作模式不变

`d$` 删除光标所在位置到行末，工作模式不变



命令模式下的光标移动

`h` 左移

`j` 下移

`k` 上移

`l` 右移


命令模式下行跳转

`line-G`  缺点是没有回显

末行模式下行跳转

`:line-回车`

跳转首行

`gg` （命令模式）


跳转末行

`G`  （命令模式）

自动缩进

在这之前要进行vimrc修改，不然自动缩进是8个空格

ubuntu的vimrc位置在`/etc/vim/vimrc`

在文件末尾添加三行：

`set tabstop=4`    //设置制表符宽度为4

`set softtabstop=4`  // 设置软制表符宽度为4

`set shiftwidth=4 `   // 设置缩进空格数为4

`gg=G `（命令模式），无回显




大括号跳转

命令模式下，光标处于左大括号时，使用`%`跳转到对应右大括号，再按`%`跳回去。

其他括号也可以这样





## 8.2 vim基本操作-删除

替换单个字符

`r `命令模式下替换光标选中字符

一段删除，即删除指定区域

光标选中要删除的首字符，按v进入可视模式，再使用hjkl移动到要删除的末尾，按`d`删除

删除整行：

`dd`，删除光标所在行

`n+dd` ，删除从光标开始的n行


## 8.3 vim基本操作-复制粘贴

`yy` 复制光标所在行

`p`  向后粘贴剪切板内容，如果复制整行，这里是粘贴在光标所在位置的下一行

`P`  向前粘贴剪切板内容，如果是整行，这里是粘贴在光标所在位置的上一行


这里提一下，上一节里的dd，不是删除，而是剪切，小时的内容去了剪切板，而不是删掉了
p和P粘贴会出现换行，主要原因是复制整行时，会把行末的换行符也复制下来。


`n-yy ` 复制光标所在位置的n行，包括光标所在行


## 8.4 vim基本操作-查找和替换
查找

`/+findname `  命令模式下查找

按回车键启动查找后，按`n`，会自动找下一个，`N`跳到上一个


查找光标所在单词

光标在目标单词上时，`*`或者`#`查找下一个，这里不要求光标必须在首字母上

替换：末行模式下进行

单行替换  

光标置于待替换行，   :`s` /待替换词/替换词

全文替换
`:%s `/待替换词/替换词           这个默认替换每行的首个，一行有多个目标词时，后面的不会变

`:%s` /待替换词/替换词/g       真正意义上的全局替换

区域替换
`:24,35s` /待替换词/替换词/g     替换24-35行之间的目标词



末行模式下历史命令

`Ctrl-p` 上一条命令

`Ctrl-n` 下一条命令


## 8.5 vim基本操作-其他(分屏)

命令模式下

`u`  撤销操作

`Ctrl-r`  反撤销


分屏，末行模式下

`:sp`   水平分屏

`:vsp ` 竖直分屏

`分屏命令+filename`，分屏并打开这个文件

分屏后屏幕切换，`Ctrl-w-w`

使用`:q`退出光标所在窗口

使用`:qall`退出所有窗口


从vim中跳转`manpage`，命令模式下

将光标放在待查看单词上，按`K`，默认看第一卷
`n+K`，查看第n卷



查看宏定义：命令模式
	光标放在待查看词上，`[+d`即可查看


vim下使用shell命令：末行模式
	`:! + 命令`
操作后，会切换至终端显示结果，出现如下画面，按Enter后回到vim界面




# 9.gcc编译

1. gcc编译可以执行 4 步骤: 预编译, 编译,汇编,链接

   ![image-20220119235432296](C:\Users\Asaki\AppData\Roaming\Typora\typora-user-images\image-20220119235432296.png)



2. `gcc -I./inc hello.c -o hello` 指定头文件的目录,在`/inc`下

3. `gcc -o` 是指定编译后的文件名

4. `gcc  hello.c -o hello2 -g` : 生成调试语句, 可以使用`gdb`调试,然后`gdb hello2`

5. 参数:
      * -I: 指定头文件所在目录文件
      * -c: 只做预处理,编译,汇编.得到二进制文件 ! ! !
      * -g: 编译时添加调试语句. 主要支持 gdb 调试
      * -Wall: 显示所有警告信息.
      * -D: 向程序中"动态" 注册宏定义, #define NAME VALUE
      * -l: 指定动态库库名
      * -L: 指定动态库路径

# 10.动态库与静态库

## 10.1对比

静态库: 对空间要求较低,而时间要求较高的核心程序中(即占用大,耗时少).

动态库: 对时间要求较低,对空间要求较高(即占用小,耗时大)

## 10.2静态库制作及使用

1. 将.c 生成 .o文件    `gcc -c add.c -o add.o`

2. 使用 ar 工具 制作静态库

    `arr rcs lib库名.a  add.o sub.o  div.o`
3. 头文件守卫
    * 源码在前,库在后
    * 例如 : `gcc test.c libmymath.a -o test -Wall (libmymath.a是库,test.c是c文件,test是生成文件)`
    ```C++
    #ifndef _HEAD_H_
    #define _HEAD_H_
    .....
    #endif
    
## 10.3动态库及使用
1. 将`.c`生成`.o`文件  (生成与位置无关的代码 -fPIC)
    `gcc -c add.c -o add.o -fPIC`
2. 使用`gcc -shared`制作动态库
        `gcc -shared lib库名.so add.o sub.o div.o`
3. 编译可执行程序时,指定所使用的的动态库. -l: 指定库名 -L: 指定库路径.
      `gcc test.c -o a.out -lmymath -L./lib` (注意:-l后面有没有空格都可以,-L后面也没有空格都可)
4. 运行可以执行程序 `./a.out` 出错! ! ! ---ldd a.out --> "not found"
      error while loading shared libraries: libxxx.so: cannot open shared object file: no such file or directory
     原因: 

        * 链接器: 工作于链接阶段  工作需要 -l 和 -L
        * 动态链接器:  工作于程序运行阶段,工作时需要提供动态库所在目录位置.
        * 
                    1)  临时生效: 通过环境变量来改变: `export LD_LIBRARY_PATH=动态库路径`
                        ./a.out 成功 (临时生效,终端重启环境变量失效)

                    2)  永久生效,写入终端配置文件. .bashrc  建议使用绝对路径
                        1) `vi ~/.bashrc
                        2) 写入 export LD_LIBRARY_PATH=动态库路径 保存
                        3) ..bashrc/  source .bshrc /重启终端 --> 让修改后的.bashrc生效
                        4) ./a.out 成功!!!
                      
                    3)  拷贝自定义动态库 到 /lib (标准C库所在目录位置,不太推荐)
                    4)  配置文件法: 
                        1) 修改/etc/ld.so.conf   sudo vi /etc/ld.so.conf  
                        2) 添加你的共享库的绝对路径
                        3) 更新查找共享库的路径使生效 sudo ldconfig -v
                        4) 测试你的程序可否找到共享库 ldd a.out
                        5) ./a.out
                   

5. `ldd a.out` 一个命令可以查看a.out执行时需要加载那些动态库,以及路径

6. 注意: 
   1. 动态库是否加载到内存,取决与程序是否运行
   2. 动态库每次加载的位置不固定
   3. 动,静态库共存时,编译器默认使用动态库
   
   
   
# 11. gdb调试工具 (大前提,程序是你自己写的)
## 11.1基础指令
 * `-g`: 使用改参数编译可执行文件
    `gdb a.out`
 * `list:` `list 1`:列出源码,根据源码指定行号设置断点.
 * `b`:  `b 20` 在20行设置断点
 * `d/delete`: `d 20`在20行取消断点.
 * `run/r`: 运行程序
 * `n/next`: 下一条指令(会越过函数)
 * `s/step`: 下一条指令(会进入函数,但不会进入系统函数)
 * `p/print`: `p i `查看变量的值
 * `continue`: 继续执行断点后续指令,到下一个断点,如果没有直接结束程序
 * `quit`: 退出gdb当前调试
 * `until`: 到指定行接着运行
## 11.2 其他指令
 * `run`: 使用run 查找段错误出现位置.
 * `finish`: 结束当前函数调用,返回到函数调用点(常用于进入无法进入系统函数时,退出当前函数)
 * `set args`: 设置main函数命令行参数
 * `run 字串1 字串2 ...`: 设置main函数命令行参数
 * `info b`: 查看当前断点信息(设置条件断点 b 41 if i = 5)(41行设置断点,如果i =5时,断点才生效)
 * `b 20 if i = 5`: 设置条件断点
 * `ptype j(arr[k]`: 查看变量类型(例如 type = int, type = int *)
 * `bt/backtrace`: 查看函数的调用的栈帧和层级关系,列出当前程序正存活着的栈帧.
 * `frame 0(1)`: 根据编号切换栈帧(因为变量会调用另一个函数,换到另一个函数的栈帧中去看)
 * `display j`: 设置跟踪j参数(可有多个),然后按n/next
 * `undisplay 1`: 取消跟踪1编号的参数 (取消设置跟踪变量,使用跟踪变量的编号)


# 12.Makefile项目管理
    一个规则,两个函数,三个变量
 * 一个规则:
 *  命名: makefile Makefile(如果名字不叫makefile 需要加 -f 例如: make -f m6)
  ``` 
    目标: 依赖条件 
          (一个tab缩进) 命令
          1.目标的时间必须晚于依赖条件的时间,否则,更新目标
          2.依赖条件如果不存在,找寻新的规则去产生依赖.
    ALL: 指定makefile的终极目标(一般makefile的第一行为终极目标,不加all只运行第一行)
     
  ```
例如
 ```makefile
 ALL:a.out
hello.o:hello.c
        gcc -c hello.c -o hello.o
add.o:add.c
        gcc -c add.c -o add.o
sub.o:sub.c
        gcc -c sub.c -o sub.o
div1.o:div1.c
        gcc -c div1.c -o div1.o

a.out:hello.o add.o sub.o div1.o
        gcc hello.o add.o sub.o div1.o -o a.out
 ```
```makefile
a.out:hello.o add.o sub.o div1.o
        gcc hello.o add.o sub.o div1.o -o a.out

hello.o:hello.c
        gcc -c hello.c -o hello.o
add.o:add.c
        gcc -c add.c -o add.o
sub.o:sub.c
        gcc -c sub.c -o sub.o
div1.o:div1.c
        gcc -c div1.c -o div1.o
```
 * 两个函数: 
    1. src = $(wildcard ./*.c):匹配当前工作目录下的所有.c文件.将文件名组成列表,赋值给变量src
    2. obj = $(patsubst %.c, %.o, &(src)): 将参数3中,包含参数1的部分,替换成参数2.(obj = add.o sub.o div1.o)

    clean: (没有依赖) 
        ```makefile
        -rm -rf $(obj) a.out "-":的作用是删除不存在的文件时,不报错.顺序执行结束.
        ```
    例子:
``` makefile
src = $(wildcard *.c) # add.c sub.c div1.c hello.c
obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o

All:a.out

a.out: $(obj)
    gcc $(obj) -o a.out

add.o:add.c
    gcc -c add.c -o add.o
sub.o:sub.c
    gcc -c sub.c -o sub.o
hello.o:hello.c
    gcc -c hello.c -o hello.o
div1.o:div1.c
    gcc -c div1.c -o div1.o


clean:
    -rm -rf $(obj) a.out
```


* 三个自动变量:

        1) $@: 在规则的命令中,表示规则中的目标
        2) $^: 在规则的命令中,表示所有依赖条件
        3) $<: 在规则的命令中,表示第一个依赖条件.如果将该变量应用在规则模式中,它可将依赖条件中的依赖一次取出,套用模式规则.
改写:
``` makefile
src = $(wildcard *.c) # add.c sub.c div1.c hello.c
obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o

All:a.out

a.out: $(obj)
    gcc $^ -o $@

add.o:add.c
    gcc -c $< -o $@
sub.o:sub.c
    gcc -c $< -o $@
hello.o:hello.c
    gcc -c $< -o $@
div1.o:div1.c
    gcc -c $< -o $@


clean:
    -rm -rf $(obj) a.out
```


* 模式规则(接近最终效果):
``` makefile
src = $(wildcard *.c) # add.c sub.c div1.c hello.c
obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o

All:a.out

a.out: $(obj)
    gcc $^ -o $@

%.o:%.c
    gcc -c $< -o $@

clean:
    -rm -rf $(obj) a.out
```
* 静态模式规则:
    ``` makefile
    src = $(wildcard *.c) # add.c sub.c div1.c hello.c
    obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o
    
    All:a.out
    
    a.out: $(obj)
        gcc $^ -o $@
    
    #静态模式规则,指定给谁用
    $(obj):%.o:%.c
        gcc -c $< -o $@
    
    clean:
        -rm -rf $(obj) a.out
    ```
* 小知识:
   * make clean -n 模拟删除,但是不会删除,让你知道你会删除哪些文件
   * .PHONY: clean ALL : 加上伪目标,可以让你在目录下有名叫clean,ALL文件时使用make命令不出错
   * 参数: -n 模拟执行make,make clean命令
           -f 指定文件执行make命令

* 最终形态
    ``` makefile
    src = $(wildcard *.c) # add.c sub.c div1.c hello.c
    obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o
    
    All:a.out
    
    a.out: $(obj)
        gcc $^ -o $@
    
    $(obj):%.o:%.c
        gcc -c $< -o $@
    
    clean:
        -rm -rf $(obj) a.out
    
     .PHONY: clean ALL   
    ```
* 可以选择调参版本的:

    ``` makefile
    src = $(wildcard *.c) # add.c sub.c div1.c hello.c
    obj = $(patsubst %.c,%.o,$(src)) # add.o sub.o div1.o hello.o
    
    myArgs= -Wall -g
    
    All:a.out
    
    a.out: $(obj)
        gcc $^ -o $@ $(myArgs)
    
    $(obj):%.o:%.c
        gcc -c $< -o $@ $(myArgs)
    
    clean:
        -rm -rf $(obj) a.out
    
     .PHONY: clean ALL   
    ```
* 练习题: 把.c文件放在src文件下,.o文件放在obj文件下,a.out放在makefile同级目录下,头文件放在ins文件下

    ``` makefile
    src = $(wildcard ./src/*.c) # ./src/add.c ./src/sub.c
    obj = $(patsubst ./src/%.c,./obj/%.o,$(src)) # ./obj/add.o ./obj/sub.o
    
    inc_path =./inc
    
    myArgs= -Wall -g
    
    All:a.out
    
    a.out: $(obj)
        gcc $^ -o $@ $(myArgs)
    
    $(obj):./obj/%.o:./src/%.c
        gcc -c $< -o $@ $(myArgs) -I $(inc_path)
    
    clean:
        -rm -rf $(obj) a.out
    
     .PHONY: clean ALL   
    ```
* 作业: 将.c文件生成.out文件,clean删除所有.out文件
  
    ```makefile
    src = $(wildcard *.c)
    target = $(patsubst %.c, % , $(src))
    
    ALL: $(target)
    
    %:%.c
        gcc $< -o $@
    
    clean: 
        -rm -rf $(target)
    
    .PHONY: clean ALL
    ```



# 13.open函数()
* open函数:

```C++        
        int open(char *pathname, int flags)   #inlcude<unistd.h>
            参数:
                pathname: 欲打开的文件名
                flags: 文件打开方式:     #include<fcntl.h>
                    O_RDONLY | O_WRONLY | O_RDWR(只读,只写,读写)
                    O_CREAT|O_APPEND|O_TRUNC|O_EXCLO_NONBLOCK(创建|追加|截断为零|判断是否存在|非阻塞)
            返回值:
                成功: 打开文件所得到对应的 文件描述符(整数)
                失败: -1, 设置errno

        int open(char *pathname, int flags,mode_t mode)
            参数:
                pathname: 欲打开的文件名
                flags: 文件打开方式:
                    O_RDONLY | O_WRONLY | O_RDWR(只读,只写,读写)
                    O_CREAT|O_APPEND|O_TRUNC|O_EXCLO_NONBLOCK(创建|追加|截断为零|判断是否存在|非阻塞)
                mode: 参数3使用的前提,参2指定了O_CREAT. 取值8进制数,用来描述文件的访问权限. rwx 0664
                 创建文件最终权限 = mode & ~umask   
            返回值:
                成功: 打开文件所得到对应的 文件描述符(整数)
             失败: -1, 设置errno
```
* close函数:
        int close(int fd):
* 错误处理函数:     与errno相关.
    ```C++
    printf("xxx errno: %d \n",errno);
    char *strerror(int errnum);
                printf("xxx error: %s\n",strerror(errno));
    ```


# 14.link函数和UNlink隐式回收
## 14.1link函数
* 给文件改名:
    ```C++
     #include<stdio.h>
     #include<stdlib.h>
     #include<string.h>
     #include<unistd.h>
     #include<pthread.h>
      int main(int argc,char *argv[]){
         link(argv[1],argv[2]);
         unlink(argv[1]);
            return 0;
        }
    
        //运行时: ./myMv t.c test.c 运行myMv程序,将t.c改成test.c
    ```

## 14.2Unlink函数
* unlink函数: 删除一个文件的目录项.  
  * `int unlink(const char *pathname); 成功: 0; 失败: -1 设置errno为相应值.`      
  * 注意: Linux下删除文件的机制: 不断将`st nlink -1`,直至减到0为止.无目录项对应的文件,将会被操作系统择机释放.(具体文件由系统调度算法决定.)  
  * 因此,我们删除文件,从某种意义上说,只是让文件具备了被释放的条件.要等到所有打开该文件的进程关闭该系统,系统才会挑时间将该文件释放掉.
    ```C++
        #include<stdio.h>
        #include<unistd.h>
        #include<string.h>
        int main(){
            int fd,ret;
            char *p = "test of unlink \n";
            char *p = "after write something. \n";
    
            fd = open("temp.txt",O_RDWR | O_CREAT | O_TRUNC, 0644);
            if(fd < 0){
                perror("open temp error");
                exit(1);
            }
    
            ret = unlink("temp.txt");  //具备了被释放的条件
            if(ret < 0){
                perror("unlink error");
                exit(1);    
            }
    
            ret = write(fd,p,strlen(p));
            if(ret ==  -1){
                perror("----write error");
            }
    
            printf("hi! I'm printf\n");
            ret = write(fd,p2,strlen(p2));
            if(ret == -1){
                perror("----write error");
            }
    
            printf("Enter anykey continue\n");
            getchar();
    
            close(fd);
    
            return 0;
        }
        //temp.txt临时存在,运行结束后被干掉.
    
    ```
* 隐式回收:(尽量不要使用)   
    当进程结束运行时,所有该进程打开的文件会被关闭,申请的内存空间会被释放.系统的这一特征被称之为隐式回收系统资源.


# 15.文件目录rwx权限差异
|   | r  |w   |x
:---|:--:|:--:|:---  
文件| 文件的内容可以被查看<br>cat,more,less...   |内容可以被修改<br>vi |可以运行一个进程<br>./文件名
目录|目录可以被浏览<br>ls,tree... |创建,删除,修改文件<br>mv,touch,mkdir... | 可以被打开,进入<br>cd...


# 16.目录操作函数
## 16.1 opendir函数和closedir函数
```C++
    #include<stdio.h>
    #include<stdlib.h>
    #include<string.h>
    #include<unistd.h>
    #include<dirent.h>
    #include<pthread.h>
    int main(int argc, char *argv[]){
        DIR * dp;
        struct dirent *sdp;

        dp = opendir(argv[1]);
        if(dp == NULL){
            perror("opendir error");
            exit(1);
        }

        while((sdp = readdir(dp)) != NULL){
            if((strcmp(sdp->d_name,".") == 0))
                continue;            
            if((strcmp(sdp->d_name,"..") == 0))
                continue;

                printf("%s\t",sdp->d_name);
        }
        printf("\n");
        closedir(dp);
        return 0;
    }
    //./myls .. 显示上一级目录的所有文件(不显示. 和 ..),
    //./myls . 显示当前目录的所有文件(不显示. 和 ..),
```
```C++
    //三个函数
     DIR * opendir(char *name);
     int  closedir(DIR *dp);
     struct dirent *readdir(DIR *dp);
        struct dirent{
            inode
            char dname[256];
        }

```
## 16.2read函数和write函数
* read函数:  
     `ssize_t read(int fd, void *buf, size_t count);  `  
    ```
        参数:  
            fd: 文件描述符
            buf:存数据的缓冲区
            count: 缓冲区大小
        返回值: 
            0: 读到文件末尾.
            成功:   >0 读到的字节数.
            失败:   -1, 设置errno
            -1: 并且errno = EAGIN 或 EWOULDBLOCK,说明不是read失败,而是read在以非阻塞方式读取一个设备文件(网络文件),并且文件无数据
    
    ```
* write函数:
  `ssize_t write(int fd,const void *buf, size_t count)`
  ```
        参数:
            fd:文件描述符号
            buf: 代写出数据的缓冲区
            count: 数据大小.
        返回值: 
            成功: 写入的字节数
            失败: -1, 设置errno
  ```
  
# 17.文件描述符fd

* 在Linux系统中一切皆可以看成是文件，文件又可分为：普通文件、目录文件、链接文件和设备文件。  
* 文件描述符（file descriptor）是内核为了高效管理已被打开的文件所创建的索引，其是一个非负整数（通常是小整数），用于指代被打开的文件，所有执行I/O操作的系统调用都通过文件描述符。  
* 程序刚刚启动的时候，
  * 0是标准输入，  
  * 1是标准输出，
  * 2是标准错误。
  * 如果此时去打开一个新的文件，它的文件描述符会是3。  
  ————————————————

* 由于进程级文件描述符表的存在，不同的进程中会出现相同的文件描述符，它们可能指向同一个文件，也可能指向不同的文件

## 17.1文件描述符合打开文件之间的关系
每一个文件描述符会与一个打开文件相对应，同时，不同的文件描述符也会指向同一个文件。相同的文件可以被不同的进程打开也可以在同一个进程中被多次打开。系统为每一个进程维护了一个文件描述符表，该表的值都是从0开始的，所以在不同的进程中你会看到相同的文件描述符，这种情况下相同文件描述符有可能指向同一个文件，也有可能指向不同的文件。具体情况要具体分析，要理解具体其概况如何，需要查看由内核维护的3个数据结构。
 1. 进程级的文件描述符表
 2. 系统级的打开文件描述符表
 3. 文件系统的i-node表



PCB进程控制块: 本质 结构体.  
成员: 文件描述符表.  
文件描述符: 0/1/2/3/4...../1023  表中可用的最小的.  
0 - STDIN_FILENO  
1 - STDOUT_FILENO  
2 - STDERR_FILENO  

# 18.阻塞.非阻塞
是设备文件.网络文件的属性.  
产生阻塞的场景.读设备文件.读网络文件.(读常规文件无阻塞概念)  
/dev/tty  -- 终端文件.  
`open("/dev/tty",O_RDWR | O_NONBLOCK)` --设置 / dev/tty 非阻塞状态.(默认为阻塞状态)


# 19.递归遍历目录
```C++
        #include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        #include <unistd.h>
        #include <sys/stat.h>
        #include <dirent.h>
        #include <pthread.h>

        void isFile(char *name);

        // 打开目录读取,处理目录
        void read_dir(char *dir, void (*func)(char *))
        {
            char path[256];
            DIR *dp;
            struct dirent *sdp;

            dp = opendir(dir);
            if (dp == NULL) {
                perror("opendir error");
                return;
            }
            // 读取目录项
            while((sdp = readdir(dp)) != NULL) {
                if (strcmp(sdp->d_name, ".") == 0 || strcmp(sdp->d_name, "..") == 0) {
                    continue;
                }
                //fprintf();
                // 目录项本身不可访问, 拼接. 目录/目录项
                sprintf(path, "%s/%s", dir, sdp->d_name);

                // 判断文件类型,目录递归进入,文件显示名字/大小
                //isFile(path);    
                (*func)(path);
            }

            closedir(dp);

            return ;
        }

        void isFile(char *name)

            int ret = 0;
            struct stat sb;

            // 获取文件属性, 判断文件类型
            ret = stat(name, &sb);
            if (ret == -1) {
                perror("stat error");
                return ;
            }
            // 是目录文件
            if (S_ISDIR(sb.st_mode)) {
                read_dir(name, isFile);
            }
            // 是普通文件, 显示名字/大小
            printf("%10s\t\t%ld\n", name, sb.st_size);

            return;
        }


        int main(int argc, char *argv[])
        {
            // 判断命令行参数
            if (argc == 1) {
                isFile(".");
            } else {
                isFile(argv[1]);
            }

            return 0;
        }

```

# 20.重定向dup和dup2
`dup`和`dup2`也是两个非常有用的调用，它们的作用都是用来复制一个文件的描述符。

`dup（)`:也称之为文件描述符复制函数，在某些场景下非常有用，比如：标准输入/输出重定向
```C++
    dup 和 dup2：

	int dup(int oldfd);		文件描述符复制。

		oldfd: 已有文件描述符

		返回：新文件描述符。

	int dup2(int oldfd, int newfd); 文件描述符复制。重定向。

```

# 21.fcntl函数实现dup
```C++
fcntl 函数实现 dup：

	int fcntl(int fd, int cmd, ....)

	cmd: F_DUPFD

	参3:  	被占用的，返回最小可用的。

		未被占用的， 返回=该值的文件描述符。
```
# 22.进程相关概念
* 程序: 死的.只占用磁盘空间.                        --剧本.
* 进程: 活的.运行起来的程序.占用内存,cpu等系统资源.  -- 戏曲.



# 23.进程控制块PCB
* 进程ID
* 进程状态(5种):
  1. 初始态
  2. 就绪态(等待cpu分配时间片)
  3. 运行态
  4. 挂起态(等待除CPU以外的其他资源主动放弃cpu)
  5. 终止态
* 当前工作目录(Current Working Directory)  
* umask掩码
* 文件描述符
* 和信号相关的信息
* 用户ID和组ID


# 24.进程控制
## 24.1fork函数
`pid_t fork(void)`:
创建子进程。父子进程各自返回。父进程返回子进程pid。 子进程返回 0.  

`getpid();getppid();`
循环创建N个子进程模型。 每个子进程标识自己的身份。
```C++
        #include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        #include <unistd.h>
        #include <pthread.h>

        int main(int argc, char *argv[])
        {
            printf("before fork-1-\n");     // 在fork之前打印,父进程执行,只执行一次
            printf("before fork-2-\n");
            printf("before fork-3-\n");
            printf("before fork-4-\n");

            pid_t pid = fork();             // 创建子进程
            if (pid == -1) {
                perror("fork error");
                exit(1);

            } else if (pid == 0) {          // 子进程
                
                printf("---child is created\n");

            } else if (pid > 0) {           // 父进程

                printf("---parent process: my child is %d\n", pid);
            }
            
            printf("===================end of file\n");  // 父子进程各自执行一次.

            return 0;
        }


        /*
            最后一句话出现两遍,中间父子进程先后无关
            执行结果特殊:
            before fork-1-
            before fork-2-
            before fork-3-
            before fork-4-
            ---parent process: my child is 7969
            ---child is created
            ===================end of file
            ===================end of file
        */
```
* 练习题:循环创建多个子进程  
```C++
        #include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        #include <unistd.h>
        #include <pthread.h>

        int main(int argc, char *argv[])
        {
            int i;

            for (i = 0; i < 5; i++) {       
                if (fork() == 0)        // 循环期间, 子进程不 fork
                    break;
            }
            if (5 == i) {       // 父进程, 从 表达式 2 跳出
                sleep(5);
                printf("I'm parent \n");
            } else {            // 子进程, 从 break 跳出
                sleep(i);
                printf("I'm %dth child\n", i+1);
            }

            return 0;
        }

```
fork后:  
1. 父子进程相同的  :
   
   刚fork后。 data段、text段、堆、栈、环境变量、全局变量、宿主目录位置、进程工作目录位置、信号处理方式

2. 父子进程不同的:
   
   进程id、返回值、各自的父进程、进程创建时间、闹钟、未决信号集
3. 父子进程共享:
   
   1. 文件描述符
   2. mmap映射区
   3. 读时共享,写时复制  ---------------全局变量

注意: fork后先产生父进程还是子进程不确定,取决于内核所使用的的调度算法

## 24.2父子进程gdb调试
* gdb调试：
	* 设置父进程调试路径：set follow-fork-mode parent (默认)

	* 设置子进程调试路径：set follow-fork-mode child

## 24.3孤儿进程
孤儿进程：
父进程先于子进终止，子进程沦为“孤儿进程”，会被 init 进程领养(init进程干不死)。

## 24.4僵尸进程
僵尸进程：
子进程终止，父进程尚未对子进程进行回收，子进程残留资源(PCB)在此期间，子进程为“僵尸进程”。  kill 对其无效。(杀死方法,把父进程干死,然后僵尸进程变成孤儿进程,然后被操作系统回收)


## 24.5wait函数和waitpid函数
```
wait函数：	回收子进程退出资源， 阻塞回收任意一个。

	pid_t wait(int *status)

	参数：（传出） 回收进程的状态。

	返回值：成功： 回收进程的pid

		失败： -1， errno

	函数作用1：	阻塞等待子进程退出

	函数作用2：	清理子进程残留在内核的 pcb 资源

	函数作用3：	通过传出参数，得到子进程结束状态

	
	获取子进程正常终止值：

		WIFEXITED(status) --》 为真 --》调用 WEXITSTATUS(status) --》 得到 子进程 退出值。

	获取导致子进程异常终止信号：

		WIFSIGNALED(status) --》 为真 --》调用 WTERMSIG(status) --》 得到 导致子进程异常终止的信号编号。

```
```
waitpid函数：	指定某一个进程进行回收。可以设置非阻塞。		
	waitpid(-1, &status, 0) == wait(&status);

	pid_t waitpid(pid_t pid, int *status, int options)

	参数：
		pid：指定回收某一个子进程pid

			> 0: 待回收的子进程pid

			-1：任意子进程

			0：同组的子进程。

		status：（传出） 回收进程的状态。

		options：WNOHANG 指定回收方式为，非阻塞。

	返回值：

		> 0 : 表成功回收的子进程 pid

		0 : 函数调用时， 参3 指定了WNOHANG， 并且，没有子进程结束。

		-1: 失败。errno


总结：

	wait、waitpid	一次调用，回收一个子进程。

			想回收多个。while 


```
--------------------
```C++

        #include <stdio.h>
        #include <stdlib.h>
        #include <unistd.h>
        #include <sys/wait.h>

        int main(void)
        {
            pid_t pid, wpid;
            int status;

            pid = fork();
            if (pid == 0) {
                printf("---child, my id= %d, going to sleep 10s\n", getpid());
                sleep(10);
                printf("-------------child die--------------\n");
                return 73;
            } else if (pid > 0) {
                //wpid = wait(NULL);          // 不关心子进程结束原因
                wpid = wait(&status);       // 如果子进程未终止,父进程阻塞在这个函数上
                if (wpid == -1) {
                    perror("wait error");
                    exit(1);
                }
                if (WIFEXITED(status)) {        //为真,说明子进程正常终止. 
                    printf("child exit with %d\n", WEXITSTATUS(status));

                }
                if (WIFSIGNALED(status)) {      //为真,说明子进程是被信号终止.

                    printf("child kill with signal %d\n", WTERMSIG(status));
                }

                printf("------------parent wait finish: %d\n", wpid);
            } else {
                perror("fork");
                return 1;
            }

            return 0;
        }

```
* 小作业:  回收第三个子进程

```C++
        #include <stdio.h>
        #include <stdlib.h>
        #include <string.h>
        #include <unistd.h>
        #include <sys/wait.h>
        #include <pthread.h>


        int main(int argc, char *argv[])
        {
            int i;
            pid_t pid, wpid, tmpid;

            for (i = 0; i < 5; i++) {       
                pid = fork();
                if (pid == 0) {       // 循环期间, 子进程不 fork 
                    break;
                }
                if (i == 2) {
                    tmpid = pid;
                    printf("--------pid = %d\n", tmpid);
                }
            }

            if (5 == i) {       // 父进程, 从 表达式 2 跳出
        //      sleep(5);

                //wait(NULL);                           // 一次wait/waitpid函数调用,只能回收一个子进程.
                //wpid = waitpid(-1, NULL, WNOHANG);    //回收任意子进程,没有结束的子进程,父进程直接返回0 
                //wpid = waitpid(tmpid, NULL, 0);       //指定一个进程回收, 阻塞等待
                printf("i am parent , before waitpid, pid = %d\n", tmpid);

                //wpid = waitpid(tmpid, NULL, WNOHANG);   //指定一个进程回收, 不阻塞
                wpid = waitpid(tmpid, NULL, 0);         //指定一个进程回收, 阻塞回收
                if (wpid == -1) {
                    perror("waitpid error");
                    exit(1);
                }
                printf("I'm parent, wait a child finish : %d \n", wpid);

            } else {            // 子进程, 从 break 跳出
                sleep(i);
                printf("I'm %dth child, pid= %d\n", i+1, getpid());
            }

            return 0;
        }


```
* 小作业: 回收多个子进程
```C++
            // 回收多个子进程

            #include <stdio.h>
            #include <stdlib.h>
            #include <string.h>
            #include <unistd.h>
            #include <sys/wait.h>
            #include <pthread.h>


            int main(int argc, char *argv[])
            {
                int i;
                pid_t pid, wpid;

                for (i = 0; i < 5; i++) {       
                    pid = fork();
                    if (pid == 0) {       // 循环期间, 子进程不 fork 
                        break;
                    }
                }

                if (5 == i) {       // 父进程, 从 表达式 2 跳出
                    /*
                    while ((wpid = waitpid(-1, NULL, 0))) {     // 使用阻塞方式回收子进程
                        printf("wait child %d \n", wpid);
                    }
                    */
                    while ((wpid = waitpid(-1, NULL, WNOHANG)) != -1) {     //使用非阻塞方式,回收子进程.
                        if (wpid > 0) {
                            printf("wait child %d \n", wpid);
                        } else if (wpid == 0) {
                            sleep(1);
                            continue;
                        }
                    }

                } else {            // 子进程, 从 break 跳出
                    sleep(i);
                    printf("I'm %dth child, pid= %d\n", i+1, getpid());
                }

                return 0;
            }


```


## 24.6exec函数族
```
exec函数族：

	使进程执行某一程序。成功无返回值，失败返回 -1

	int execlp(const char *file, const char *arg, ...);		借助 PATH 环境变量找寻待执行程序

		参1： 程序名

		参2： argv0

		参3： argv1

		...： argvN

		哨兵：NULL

	int execl(const char *path, const char *arg, ...);		自己指定待执行程序路径。

	int execvp();

ps ajx --> pid ppid gid sid
```
# 25.进程间通信
* IPC 进程间通信
* 目前常用的进程间通信的方法有:
  1. 管道(使用最简单)
  2. 信号(开销最小);
  3. 共享映射区(无血缘关系)
  4. 本地套接字(最稳定)