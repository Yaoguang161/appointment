- [1.数据格式](#1数据格式)
- [2.操作数指示符](#2操作数指示符)
- [3.数据传送指令](#3数据传送指令)


# 1.数据格式
|C声明|Intel数据类型|汇编代码后缀|大小(字节)|
|:--:|:--:|:--:|:--:|
|char|字节|b|1|
|short|字|w|2|
|int|双字|l|4|
|long|四字|q|8|
|char*|四字|q|8|
|float|单精度|s|4|
|double|双精度|l|8|

# 2.操作数指示符
|类型|格式|操作数值|名称|
|:--:|:--:|:--:|:--:|
|立即数|$Imm|Imm|立即数寻址|
|寄存数|r<sub>a</sub>|R[r<sub>a</sub>]|寄存器寻址|
|存储器|Imm|M[Imm]|绝对寻址|
|存储器|(r<sub>a</sub>)|M[R[r<sub>a</sub>]]|间接寻址|
|存储器|Imm(r<sub>b</sub>)|M[Imm + R[r<sub>b</sub>]]|(基址 + 偏移量) 寻址|
|存储器|(r<sub>b</sub>,r<sub>i</sub>)|M[R[r<sub>b</sub>] + R[r<sub>i</sub>]]|变址寻址|
|存储器|Imm(r<sub>b</sub>,r<sub>i</sub>)|M[Imm + R[r<sub>b</sub>] + R[r<sub>i</sub>]]|变址寻址|
|存储器|(,r<sub>i</sub>,s)|M[R[r<sub>i</sub>] * s]|比例变址寻址|
|存储器|Imm(,r<sub>i</sub>,s)|M[Imm + R[r<sub>i</sub>] * s]|比例变址寻址|
|存储器|(r<sub>b</sub>,r<sub>i</sub>,s)| M[ R[r<sub>b</sub>] + R[r<sub>i</sub>] * s]|比例变址寻址|
|存储器|Imm(r<sub>b</sub>,r<sub>i</sub>,s)| M[Imm + R[r<sub>b</sub>] + R[r<sub>i</sub>] * s]| 比例变址寻址|

# 3.数据传送指令
|指令|效果|描述|
|:--:|:--:|:--:|
|MOV &emsp;&emsp;&emsp;S,D|D←S|传送|
|movb||传送字节|
|movw||传送字|
|movl||传送双字|
|movq||传送四字|
|movabsp&emsp;&emsp;&emsp;I,R|R←I|传送绝对的四字|



