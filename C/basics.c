// For files you make, `"..."` surround the file name.
#include "basics.h"

/* ABOUT */
// I made this file to be a basic guide to the C programming language. The
// goal was for this to be a summary of the basics of the language, with the
// audience being either students who are learning the language for school or
// someone who just wanted to get a quick overview of the language. For more
// information, check out the language specification(links below).

/* SPECIFICATION */
// For the language specification, see:
//    https://www.iso-9899.info/wiki/The_Standard
// For an overview of the standard library, see:
//    https://cplusplus.com/reference/clibrary/


/* NOTES */
// C is statically, and explicitally, typed and compiled.
// Variables AND Functions must be declared before use.
// Memory management can be done manually (malloc/free).

/* COMMENTS */
// `//` starts a single-line comment
/* `/*` starts a comment
   that can be multiple lines
   and the opposite ends it (like next line)
*/

// Function that prints out "Hello, World!"
void hello_world()
{
   printf("Hello, World!");
}

// Each C program starts with, and ends with the `main` function.
// In general, the functional prototype of `main` will look like this:
// int main(int argc, char **argv)
// but you don't have to have arguments.
int main(int argc, char **argv)
{
   // As always, a great place to start is with "Hello, World!"
   printf("Hello, World!\n");

   /* DATA TYPES */
   // Primit:
   // int      - integer
   // float    - floating point number
   // double   - double precision floating point
   // char     - character
   // unsigned - unsigned integer
   int myInt = 42;
   float myFloat = 3.14f;
   double myDouble = 2.71828;
   char myChar = 'A';
   unsigned int myUnsigned = 100;
   // TODO: Go in depth with things like `short` and `long`

   // NOTE: In "base" C, there is no "boolean" data type. C uses 0 for `false`
   //       and any non-zero integer for `true`. You can `#include` the boolean
   //       header file `stdbool.h` to use generic "boolean" styling.


   /* OPERATORS */
   // Assignment: =
   int number = 5;

   // Arithmetic: + - * / %
   int sum = 1 + 2;
   int product = 2 * 3;
   int quotient = 5 / 2;
   int remainder = 5 % 2;

   // Comparison: == != < > <= >=
   int isEqual = (sum == product);
   if (quotient == remainder)
      printf("Even\n");

   // Logical: && || !
   int logicalAnd = (1 && 0);  // 0 (false)
   int logicalOr = (1 || 0);   // 1 (true)
   int logicalNot = !1;        // 0 (false)

   // Bitwise: & |
   // TODO:


   /* EXPRESSIONS */
   int expr = (myInt + 5) * 2;
   // In C, assignments are considered expressions, so you could do something like:
   int a;
   int b = (a = 5);
   // First, `a` is assigned the value `5`, and then `b` is assigned the value `5`


   /* CONTROL FLOW */
   // Conditionals (`if` and `else`)
   if (myInt > 10)
   {
      printf("myInt is greater than 10\n");
   }
   else
   {
      printf("myInt is not greater than 10\n");
   }
   // You don't need brackets if the "block" only contains one statement, like:
   if (myInt > 10)
      printf("myInt is greater than 10\n");
   else if (myInt == 10)
      printf("myInt is equal to 10\n");
   else
      printf("myInt is not greater than 10\n");

   // Switch statement
   switch (myChar)
   {
      case 'A':
         printf("It's A\n");
         break;
      case 'B':
         printf("It's B\n");
      case 'C':
         printf("It's C\n");
         break;
      default:
         printf("Not A, B, or C\n");
   }
   // NOTE: Not having a `break` in the `case 'B'` means it will fall into `case 'C'`
   //       and execute it as well.

   // Loops
   // `for`
   for (int i = 0; i < 5; i++)
   {
      printf("i = %d\n", i);
   }
   // In older versions of C (before C99), the above style wasn't supported. You
   // had to declare the looping variable before the loop, like so:
   int i = 0;
   for (i = 0; i < 5; i++)
      printf("i = %d\n", i);

   // `while`
   int j = 0;
   while (j < 5)
   {
      printf("j = %d\n", j);
      j++;
   }

   // `do` ... `while`
   do {
      printf("j = %d\n", j);
      j--;
   } while (j > 0);
   // NOTE: The `j` used above is the same one from the while loop above.


   /* FUNCTIONS */
   // Function prototype: return_type name(parameters)
   hello_world();


   /* INPUT/OUTPUT */
   // TODO: Expand on the different I/O functions
   // printf - output to console
   // scanf  - input from console
   int num = 0;
   printf("Enter a number: ");
   scanf("%d", &num);


   /* ARRAYS & STRINGS */
   int arr[3] = {1, 2, 3};
   char str[] = "Hello";
   printf("First element: %d\n", arr[0]);
   printf("String: %s\n", str);


   /* POINTERS */
   int val = 10;
   int *ptr = &val;
   printf("Value: %d, Pointer: %p, Dereferenced: %d\n", val, (void*)ptr, *ptr);


   /* STRUCTS */
   struct point
   {
      int x;
      int y;
   };
   struct point p = {1, 2};
   printf("point: (%d, %d)\n", p.x, p.y);


   return 0;
}
