#include<iostream>
#include<stdlib.h>

int main()
{
    int length = 0;
    int *Arr = NULL;

    cout<<"Enter the elements:\n";
    cin>>length;

    Arr =new int[length];
    if(Arr == NULL)
    {
        cout<<"memory does not gets allocated succefuly";
    }
    else
    {
        cout<<"memory get allocated successfuly:\n";

    }
    delete [] Arr;
}
