//
// Created by Asaki on 2020/12/19.
//零钱
#include<iostream>
#include<algorithm>
using namespace std;
int n,m;
int s[105],p[105]={0},f=0;
int fax(int i,int sum)
{
    int j=0,q=0;
    if(i>=n)
        return 0;
    if(sum>m||f)
        return 0;
    if(sum==m)
    {
        f++;
        for(j=0;j<=i;j++){
            if(q&&p[j]==1)
                cout<<" ";
            if(p[j]){
                cout<<s[j];
                q++;
            }
        }
    }
    p[i]=1;
    fax(i+1,sum+s[i]);
    p[i]=0;
    fax(i+1,sum);
}
int main()
{
    int i;
    cin>>n>>m;  //n时硬币个数，m是要付款数
    for(i=0;i<n;i++)
        cin>>s[i];   //数组输入所有钱币数量
    sort(s,s+n);
    fax(0,0);    //fax被定义函数
    if(!f)
        cout<<"No Solution";
}