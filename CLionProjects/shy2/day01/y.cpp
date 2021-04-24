//
// Created by Asaki on 2020/11/4.
//

#include <bits/stdc++.h>
using namespace std;
int main(){
     int n;
     int cot=0;
     cin>>n;
     while (n!=1) {
         if (n % 2 == 0) {
             n = n / 2;
         } else {
             n = (3 * n + 1)/2;
         }
         cot++;
     }
     cout<<cot<<endl;

    return 0;
}