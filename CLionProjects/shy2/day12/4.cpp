//
// Created by Asaki on 2021/4/7.
//7-2 查验身份证 (
#include<iostream>
using namespace std;
int w[17]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
int M[11]={1,0,'X'-'0',9,8,7,6,5,4,3,2};
bool valid(string s){
    int Z,sum=0;
    for(int i=0;i<17;i++){
        if(s[i]<'0'||s[i]>'9')return false;
        sum+=(s[i]-'0')*w[i];
    }
    Z=sum%11;
    return M[Z]==s[17]-'0';
}
int main() {
    bool allpass=true;
    int N;
    string s;
    scanf("%d",&N);
    while(N--){
        cin>>s;
        getchar();
        if(!valid(s)){
            cout<<s<<endl;
            allpass=false;
        }
    }
    if(allpass)cout<<"All passed";
    return 0;
}
