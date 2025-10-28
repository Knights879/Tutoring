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

/* COMMENTS */
// `//` starts a single-line comment
/* `/*` starts a comment
   that can be multiple lines
   and the opposite ends it (like next line)
*/

// Each C program starts with, and ends with the `main` function.
// In general, the functional prototype of `main` will look like this:
// int main(int argc, char **argv)
// but you don't have to have arguments.
int main(int argc, char **argv)
{
   // As always, a great place to start is with "Hello, World!"
   printf("Hello, World!\n");

   return 0;
}
