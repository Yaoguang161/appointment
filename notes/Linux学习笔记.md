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

# 3.软链接与硬链接

软链接:   为了保证软连接可以任意搬移,创建时晚上务必使用绝对路径

硬链接:   修改其中一个文件,其硬链接的文件也会发生变化.操作系统给每一个文件赋予唯一的 `inode,` 当有相同的 `inode` 的文件存在时, 彼此同步.删除时,只将硬链接计数减一. 减为0 时, `inode`被释放.

1. `ln -s file file.s` :  软链接相当于`windows`中的快捷方式 (第一个文件使用绝对路径)
2. `ln file file.hard`: 硬链接 相当于指针,同一个地址指向三个文件.但是思想不同,指针对于内存,硬链接对于硬盘,但是硬链接有着相同的`Inode`,即相同的文件编号.



# 4 .查看修改用户和用户组

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

略



# 9.gcc编译

1. gcc编译可以执行 4 步骤: 预编译, 编译,汇编,链接

   ![](https://image.isk.ink///image/20220121140506.png)



2. `gcc -I./inc hello.c -o hello` 指定头文件的目录,在`/inc`下

3. `gcc -o` 是指定编译后的文件名

4. `gcc  hello.c -o hello2 -g` : 生成调试语句, 可以使用`gdb`调试,然后`gdb hello2`

# 10.动态库与静态库

## 10.1对比

静态库: 对空间要求较低,而时间要求较高的核心程序中(即占用大,耗时少).

动态库: 对时间要求较低,对空间要求较高(即占用小,耗时大)

## 10.2静态库制作及使用

1. 将.c 生成 .o文件    `gcc -c add.c -o add.o`

2. 使用 ar 工具 制作静态库

    `arr rcs lib库名.a  add.o sub.o  div.o`
3. 头文件首位
    * 源码在前,库在后
    * 例如 : `gcc test.c libmymath.a -o test -Wall (libmymath.a是库,test.c是c文件,test是生成文件)`

4. 
   
## 10.3动态库及使用
1. 将`.c`生成`.o`文件  (生成与位置无关的代码 -fPIC)
    `gcc -c add.c -o add.o -fPIC`
2. 使用`gcc -shared`制作动态库
        `gcc -shared lib库名.so add.o sub.o div.o`
3. 编译可执行程序时,指定所使用的的动态库. -l: 指定库名 -L: 指定库路径.
      `gcc test.c -o a.out -lmymath -L./lib` (注意:-l后面有没有空格都可以,-L后面也没有空格都可)
4. 运行可以执行程序 `./a.out` 出错! ! !
     原因: 
        *  连接器: 工作于链接阶段































   

   

   

   















