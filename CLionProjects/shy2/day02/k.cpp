//
// Created by Asaki on 2020/11/14.
//


#include<stdio.h>
int main(int argc, char* argv[])
    {
        for (int i = 0; i <= 10; i++)
        {
            for (int j = 0; j <= 5; j++)
            {
                for (int k = 0; k <= 2; k++)
                {
                    if (i+j*2+k*5==10)
                    {
                        printf("一角 %d，两角 %d，五角 %d\n", i, j, k);
                    }
                }
            }
        }

    return 0;
}