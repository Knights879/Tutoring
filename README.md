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

Here is a commented example of an [.editorconfig](https://github.com/Knights879/Tutoring/blob/main/.editorconfig) file that we can use to force our editors to style/format the source files in a folder/repo in a particular way so that we are all seeing the files the same way.

Here is a commented example of a [makefile](https://github.com/Knights879/Tutoring/blob/main/makefile) that is used with the `make` command to make build automation for C/C++ programs easier.

## Tips

### General

As a programmer, you should be comfortable with typing symbols (as they are used so often) and "navigation" keys (`HOME`, `END`, `INS`, `DEL`, `PG UP`, `PG DN`, and the `arrow keys`). Know the behavior of these "navigation" keys and use them to your advantage.

### Keyboard Shortcuts

| EXTREMELY USEFUL TIP: |
| :--- |
| **Know your keyboard shortcuts!** |

[Here is a great list of common keyboard shortcuts.](https://en.wikipedia.org/wiki/Table_of_keyboard_shortcuts)

> `CTRL/ALT` in combination with "navigation" keys changes the behavior of them to make them more "powerful." `SHIFT` in combination with "navigation" keys allows you to select text. These two combinations can be combined to allow for fast and precise select of chunks of text.

There are a lot of keyboard shortcuts that can save you time and make you **far** more productive. Whatever editor/IDE you use to program should have a list of shortcuts that are available to you, and almost all of them allow you to modify or add your own shortcuts.

Some common keyboard shortcuts I would **highly** recommend:

- `CTRL/ALT` + `Arrow left/right` - Moves left/right by a word
- `CTRL/ALT` + `Arrow up/down` - Moves a line of code up/down
- `CTRL/ALT` + `Backspace/DEL` - Deletes a word
- `CTRL/ALT` + `/` - Comments out a line (you can select multiple lines and use this command to comment them all out)
- `CTRL/ALT` + `SHIFT` + `T` - Reopens the last closed tab
- Folding/Unfolding shortcuts - There are a lot of different options, so see how your editor implements them

Some of these may not be available by default, in which case I recommend adding them.

A lot of keyboard shortcuts are fairly universal, so you can use them in different applications like Microsoft Word or your web browser.

### Learning a New Language

Whenever you are learning a new language, don't use tools like autocomplete and linting. While these are very helpful tools that makes programming easier and faster, they are crutches that can stunt growth and development. Only use them once you have a solid grasp of the language. Also, don't copy and paste code. Manually type out the code segment to get used to typing out code in the language.

Whenever you are learning a new language, **always** find the official language specification/standard library documentation and bookmark it so that you can reference it as you learn. For larger languages, like Java and Python, it is nice to have both so that you know the syntax/behavior of the language as well as what the standard libraries have to offer. While the language specification will often include the standard library, I prefer to find a place that is dedicated to listing the library out in a more readable manner.

- `C`[^1] - [Specification](https://www.iso-9899.info/wiki/The_Standard)[^2] / [Library](https://cplusplus.com/reference/clibrary/)
- `C++`[^1] - [Specification](https://www.open-std.org/jtc1/sc22/wg21/docs/standards)[^2] / [Library](https://cplusplus.com/reference/)
- `Java` - [Specification](https://docs.oracle.com/javase/specs/index.html)[^2] / [Library](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/module-summary.html)
- `JavaScript (ECMAScript)` - [Specification](https://ecma-international.org/publications-and-standards/standards/ecma-262/)[^2] / [Library](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects)
- `Python` - [Specification](https://docs.python.org/3/reference/index.html#reference-index) / [Library](https://docs.python.org/3/library/index.html#library-index)
- `Scheme` - [Specification / Library](https://standards.scheme.org/)

[^1]: For some reason the ISO wants to make you pay like $200 for the official specification, but versions of them are publically available for free.

[^2]: These are links that have links to the different versions of the language. So just click on the PDF/HTML link of the version you want.

### Comments

When commenting, we are always balancing the line between over-commenting and under-commenting.

A good way to tell if you are **over-commenting** is:

> If the comment is just explaining what the code is doing in English, **delete the comment**.

A good way to tell if you are **under-commenting** is:

> Whenever you are doing something in an unconventional way, or what you are doing is very nuanced, to the point where the average programmer would not be able to easily figure out what/why you are doing something, **you should make a comment**.

A good example of this could be found with [fast inverse square root](https://en.wikipedia.org/wiki/Fast_inverse_square_root) (a good video explanation of the algorithm can be found here, [Fast Inverse Square Root — A Quake III Algorithm](https://youtu.be/p8u_k2LIZyo)). The average programmer would not be able to easily see how the calculation is being done, so a comment would be helpful, even if it is as simple as:

```c
// Calculated using bit manipulation and Newton's method
```

When deciding if you should add a comment or not, a good thing to ask yourself is:

> "Will the average programmer know what this code segment is doing?"

If the answer is yes, then you should not put a comment. If the answer is no, then you could consider putting a comment and the comment should be just long and detailed enough to explain the concept of what you are doing with the code segment.

| NOTE: |
| :--- |
| This repo is ***over***-commented for educational purposes. In general, your files should not be this commented (unless instructed by your professor/employer to do so). This level of detail would be something that is best saved for a design document. |

### Styling

One of the most important things to understand about styling is that **it's *(mostly)* subjective**! *For the most part*, it's an opinion, so what one person considers good styling may not be considered good styling to another person. However, there ***is* some objectivity** to styling. In order to understand the objectivity of styling, you need to understand *who* styling if for.

> Styling is done for humans.

Some languages, like Python, take this so seriously that they enforce styling through the syntax of the language. But for the majority of languages, how you style your code has no impact on the program itself[^3]. Compilers will almost always (except in cases like Python) ignore your comments and "miscellaneous" whitespace characters and will never include them in the compiled program. So, why do we style our code?

> Styling is for making our code more readable to humans. That human can be anyone who might look at your code, including you!

In general, one of the best guidelines for styling is **consistency**; pick a style and stick to it. For example:

```c
if (condition)
{
   // do something
}
else
{
   // do something else
}
```

and

```c
if (condition) {
   // do something
}
else {
   // do something else
}
```

and

```c
if (condition) {
   // do something
} else {
   // do something else
}
```

Each style is valid, so choose the style that works for you. But once you make a choice, you should stick to it, **throughout the entire program**.

[^3]: It is important to know when your "styling" choice goes too far and causes a syntax error. At that point it is not a matter of style, it is a matter of syntax. Example: You cannot space out a variable name like `numRows` into `num Rows`, as the compiler will see `num` and `Rows` as two seperate identifiers, causing a syntax error.

## Setup

### Hardware

I use a standard, QWERTY keyboard and a mouse with side buttons.

### Operating System

I use Windows (currently Windows 11). I have experience with MacOS, but do not use it regularly.

### Software

#### VSCode

I use VSCode for programming. It is highly customizable and relatively lightweight. It is easy to add extensions, and while VSCode comes with a lot of built-in features/support, including languages, you may want to download some additional extensions. All the most common languages should come with VSCode by default, but it may not include additional features/functionality that you may find useful. As for other languages that are not supported by default, you can simply search for them in the extensions search bar and install extensions that add things like sytnax highlighting and linting (the basics), as well as other useful functionality like allowing you to run and debug code.

**If you are using VSCode, make sure you have the following language extensions:**

For C/C++ programming:

- [C/C++ Extension Pack](https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools-extension-pack) - It includes `C/C++`, `C/C++ Themes`, and `CMake Tools`.

For Java programming:

- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) - It includes seven extensions, but the main ones you will likely use for school are the Language Support, Project Manager, and Debugger.

For Python:

- [Python](https://marketplace.visualstudio.com/items?itemName=ms-python.python)
- [Python Debugger](https://marketplace.visualstudio.com/items?itemName=ms-python.debugpy)
- [Pylance](https://marketplace.visualstudio.com/items?itemName=ms-python.vscode-pylance)

For JavaScript:

- Built-in support

| NOTE: |
| :--- |
| While these add functionality for the languages in VSCode, they do **not** add the languages themselves. You will need to do that yourself by downloading the languages onto your machine and make sure VSCode knows where they are located. |
