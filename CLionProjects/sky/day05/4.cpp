//
// Created by Asaki on 2021/2/2.
//
#include<bits/stdc++.h>
using namespace std;
int a[100001],maxx;
int  main(){
    int s1,s2,s3,i,j,k;
    cin>>s1>>s2>>s3;
    for( i = 1;i<=s1;i++){
        for( j = 1; j<=s2;j++){
            for( k =1 ;k<=s3;k++){
               a[i+j+k]++;
               maxx=max(maxx,i+j+k);
            }
        }
    }
    int maxl=0,z;
    for(i =1;i<=maxx;i++){
        if(a[i]>maxl){
            maxl=a[i];
            z=i;
        }
    }
    cout<<z<<endl;
    return 0;
}
