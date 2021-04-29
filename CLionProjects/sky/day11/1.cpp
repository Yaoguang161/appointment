//
// Created by Asaki on 2021/3/29.
//
#include <stdio.h>
int main()
{
    char c;
    printf("please input a character:");
    c=getchar();
    if(c<32)
        printf("This is a control character\n");
    else if(c>='0'&&c<='9')
        printf("This is a digit\n");
    else if(c>='A'&&c<='Z')
        printf("This is a capital letter\n");
    else if(c>='a'&&c<='z')
        printf("This is a small letter\n");
    else
        printf("This ia a other character\n");
    return 0;
}