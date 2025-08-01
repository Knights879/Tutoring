print("Hello World!")

# Comments can be done like this
"Or like this"

# Docstring is short for documentation string
# It is put in the first line of a module, function, class, or method like so:
def double(num):
    """Function to double the input value"""
    return 2 * num

# Prints out the Docstring
print(double.__doc__)


# MODULES

# Constants should be defined in a "module", which could mean a new file.
# Imagine the following:
# In file named "constant.py"
PI = 3.14159
GRAVITY = 9.8

# In file named "main.py"
# import constant
# print(constant.PI)
# print(constant.GRAVITY)


# VARIABLES

# Python is a "type inferred" language. That means we don't have to explicitly
# say what type of variable we are creating. Python will "infer" the type based
# on the value we use to initialize the variable.
test = 10
# This will set a = 5, b = 3.2, c = "Hello"
a, b, c = 5, 3.2, "Hello"
# All three vars will be set to 87
x = y = z = 87

# Python supports a lot of numerical types
# Binary literals
bi = 0b1010
# Decimal literals
dec = 100
# Octal literals NOTE: Octal in Python is not declared like it is in C
oct = 0o310
# Hexadecimal literals
hex = 0x12c

# Floating point examples
float1 = 8.7
float2 = 1.5e2

# Complex literals
imaginary = 3.14j

# Python has multiple ways to define Strings
string1 = "This is Python"
string2 = 'This is also Python'
char = "C"
# NOTE: the tabs will be printed along with the newline
multiline_str1 = """This is a multiline string with
                   more than one line of code."""
# NOTE: the tabs will be included but not the newline
multiline_str2 = "This is a multiline string with \
                  more than one line of code."
unicode = u"\u00dcnic\u00f6de"
raw_str = r"raw \n string"

# Python supports Boolean literals
# b1 will = True
b1 = (1 == True)
# b2 will = False
b2 = (1 == False)
# b3 will = 5 since True has the value 1
b3 = True + 4
# b4 will = 10 since False has the value 0
b4 = False + 10

# Python has one Special literal
# It is used to specify that the field has not been created
specLit = None

# Literal Collections
# List literals
fruits = ["apple", "mango", "orange"]
# Tuple literals
numbers = (1, 2, 3)
# Dict literals
alphabets = {'a':'apple', 'b':'ball', 'c':'cat'}
# Set literals
vowels = {'a', 'e', 'i', 'o', 'u'}


# PRINTING

# One way of printing a variable
print("There are", test, "tests here.")

# Another way of printing a variable
print(f"Here are {test} more tests.")

# A way to make a string variable I guess
x = f"Are you ready for another test?"
print(x)

# This can be done too
l = f"Python is "
r = f"versatile."
print(l + r)

# Prints 10 .'s
print("." * 10)

# Prints "te" on one line and "st" on the next
print("t" + "e")
print("s" + "t")

# Prints out "te st"
print("t" + "e", end = ' ')
print("s" + "t")

# Prints out "test"
print("t" + "e", end = '')
print("s" + "t")

# New line character is the same as in Java and C
print("Testing to see\nif this works")

# Sets up a format that you can use to print out strings or numbers or whatever
formatter = "{} {} {} {}"

print(formatter.format(1, 2, 3, 4))
print(formatter.format("one", "two", "three", "four"))
print(formatter.format(formatter, formatter, formatter, formatter))

formatter2 = "{}\n\t{}\n\t\t{}"

print(formatter2.format(1, 2, 3))
print(formatter2.format(formatter2, formatter2, formatter2))


# FUNCTIONS

# It's important that the "return" is tabbed
def changeme(mylist):
    "This changes a passed list into this function"
    mylist.append([1, 2, 3, 4])
    print("Values inside the function: ", mylist)
    return

mylist = [10, 20, 30]
changeme(mylist)
print("Value outside the function: ", mylist)

# eof
