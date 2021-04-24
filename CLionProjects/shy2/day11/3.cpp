//
// Created by Asaki on 2021/3/29.
//789. 数的范围
#include <iostream>

using namespace std;
const int N = 1e5 + 10;
int q[N];

int main(){
    int n, T;
    scanf("%d%d", &n, &T);
    for (int i = 0; i < n; i ++) scanf("%d", &q[i]);

    while(T --)
    {
        int x;
        scanf("%d", &x);

        int l = 0, r = n - 1;
        while(l < r)
        {
            int mid = l + r + 1 >> 1;
            if (q[mid] < x) l = mid;
            else r = mid - 1;
        }

        if (q[r + 1] != x) puts("-1 -1");
        else {
            printf("%d ", q[r] == x ? r : r + 1); // 可能左端点找不出小于`x`的最大值，若找到答案是r + 1， 找不到的话，答案是r

            l = 0, r = n - 1;
            while(l < r)
            {
                int mid = l + r >> 1;
                if (q[mid] > x) r = mid;
                else l = mid + 1;
            }

            printf("%d\n", q[r] == x? r : r - 1); // 可能右端点找不出大于`x`的最小值，若找到答案是r - 1， 找不到的话，答案是r
        }
    }
    return 0;
}
