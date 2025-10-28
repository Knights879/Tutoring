#include <stdio.h>
#include <stdlib.h>

int main()
{
   int num = 5;
   int *ptr = &num;

   printf("%d\n", num);
   printf("%p\n", &num);
   printf("%p\n", ptr);
   printf("%d\n", *ptr);
   // printf("%d\n", *num);

   return 0;
}
