#include<stdio.h>
int main()
{
    int i[10];
    char c[10];
    i[1]=53;
    i[2]=66;
    i[3]=67;
    c[1]='5';
    c[2]='B';
    c[3]='C';
    (i[1]==c[1])?printf("hum"):printf("fail");
}