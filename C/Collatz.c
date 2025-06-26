#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int test = 0;
long long unsigned int collatz(long long unsigned int num, int printOption/*, int *test*/)
{
   // int test = 0;

   if (num < 1){
      if (printOption == 1)
         printf("You didn't follow the instructions. Enter a postive integer greater than 0.\n");
      return 0;
   }

   if (num == 1)
   {
      if (printOption == 1)
         printf("The Collatz Conjecture holds. The process took %d steps to reach 1.\n", test);
      return 1;
   }

   if (num % 2 == 0)
   {
      if (printOption == 1)
         printf("The number is even.  %d / 2 = %d\n", num, num / 2);
      num /= 2;
   }
   else if (num % 2 != 0)
   {
      if (printOption == 1)
         printf("The number is odd.  (3 * %d) + 1 = %d\n", num, 3 * num + 1);
      num = 3 * num + 1;
   }
   else
      return -1;

   test++;
   collatz(num, printOption); // , &test);
}

int main(void)
{
   long long unsigned int n = 1, test = 0;
   int printOption = 0; // , counter = 0;

   printf("If you would like to print out each step, enter 1. Otherwise enter any number that is not 1. %d", printOption);
   scanf("%d", &printOption);
   printf("Enter any positive integer greater than 0 and less than %d. If you want to stop, enter a number less than 1.\n", INT_MAX);
   scanf("%d", &n);

   while (n > 1)
   {
      test = collatz(n, printOption); // , &counter);
      scanf(" %d", &n);
   }
   // if (test = 1)
   //   printf("The Collatz Conjecture holds. The process took %d steps to reach 1.\n", counter);
   // else
   //   printf("You good.");

   return 0;
}
