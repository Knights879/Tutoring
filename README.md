# Work in Progress

I will be updating this periodically with things that I come up with in my tutoring sessions, or things that I think are important and should be mentioned.

## Languages

[C](https://github.com/Knights879/Tutoring/tree/main/C)

[C++](https://github.com/Knights879/Tutoring/tree/main/C%2B%2B)

[Java](https://github.com/Knights879/Tutoring/tree/main/Java)

[JavaScript](https://github.com/Knights879/Tutoring/tree/main/JavaScript)

[Python](https://github.com/Knights879/Tutoring/tree/main/Python)

[Scheme](https://github.com/Knights879/Tutoring/tree/main/Scheme)

### Other

Here is a commented example of an [.editorconfig](https://github.com/Knights879/Tutoring/blob/main/.editorconfig) file that we can use to force our editors to style/format the source files in a folder/repo a particular way so that we are all seeing the files the same way.

Here is a commented example of a [makefile](https://github.com/Knights879/Tutoring/blob/main/makefile) that is used with the `make` command to make build automation for C/C++ programs easier.

## Tips

### Learning a New Language

Whenever you are learning a new language, **always** find the official language specification/standard library documentation and bookmark it so that you can reference it as you learn. For larger languages like Java and Python, it is nice to have both, so that you know the syntax/behavior of the language as well as what the standard libraries have to offer. While the language specification will often include the standard library, I prefer to find a place that is dedicated to listing the library out in a more readable manner.

- `C`[^1] - [Specification](https://www.iso-9899.info/wiki/The_Standard)[^2] / [Library](https://cplusplus.com/reference/clibrary/)
- `C++`* - [Specification](https://www.open-std.org/jtc1/sc22/wg21/docs/standards)[^2] / [Library](https://cplusplus.com/reference/)
- `Java` - [Specification](https://docs.oracle.com/javase/specs/index.html)[^2] / [Library](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)
- `JavaScript (ECMAScript)` - [Specification](https://ecma-international.org/publications-and-standards/standards/ecma-262/)[^2] / [Library](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects)
- `Python` - [Specification](https://docs.python.org/3/reference/index.html#reference-index) / [Library](https://docs.python.org/3/library/index.html#library-index)
- `Scheme` - [Specification / Library](https://standards.scheme.org/)

[^1]: For some reason the ISO wants to make you pay like $200 for the official specification, but versions of them are publically available for free.

[^2]: These are links that have links to the different versions of the language. So just click on the PDF/HTML link of the version you want.

### Comments

When commenting, we are always balancing the line between over-commenting and under-commenting.

When deciding if you are **over-commenting**, a great rule of thumb is:

> If the comment is just explaining what the code is doing in English, **delete the comment**.

A good way to tell if you are **under-commenting** is:

> Whenever you are doing something in an unconventional way, or what you are doing is very nuanced, to the point where the average programmer would not be able to easily figure out what/why you are doing something, **you should make a comment**.

A good example of this could be found with [fast inverse square root](https://en.wikipedia.org/wiki/Fast_inverse_square_root) (a good video explanation of the algorithm can be found [here](https://youtu.be/p8u_k2LIZyo)). The average programmer would not be able to easily see how the calculation is being done, so a comment would be helpful, even if it is as simple as:

```c
// Calculated using bit manipulation and Newton's method
```

When asking yourself if you are over-commenting or under-commenting, a good thing to ask yourself is:

> "Will the average programmer know what this code segment is doing?"

If the answer is yes, then you should not put a comment. If the answer is no, then you could consider putting a comment and the comment should be just long and detailed enough to explain the concept of what you are doing with the code segment.

| NOTE: |
| :--- |
| This repo is ***over***-commented for educational purposes. In general, your files should not be this commented (unless instructed by your professor/employer to do so). This level of detail would be something that is best saved for a design document. |

### Styling

TODO
