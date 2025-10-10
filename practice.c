// #include<stdio.h>
// #include<stdlib.h>

// int main()
// {
//     int length =0;
//     int *Arr = NULL;
//     printf("enter the element");
//     scanf("%d",&length);

//     Arr = (int*)calloc(length,sizeof(int));

//     if(Arr==NULL)
//     {
//         printf("unable to allocate the memory\n");
//     }
//     else
//     {
//         printf("memory get alloacated\n");
  
//     }
//     free(Arr);
//     return 0;
// }

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *Arr = NULL;
    Arr =(int*)malloc(5*sizeof(int));

    Arr=(int*)realloc(Arr,3*sizeof(int));
    if(Arr = NULL)
    {
        printf("memory get deallocated\n");
    }
    else
    {
        printf("memory gets deallocated");
    }
    
    free(Arr);
    return 0;

}