import random

a = int(input('Input lower-bound -- '))
#a = int(a)
b = int(input('Input upper-bound -- '))
#b = int(b)
c = int(input('Input step -- '))
#c = int(c)

print(random.randrange(a, b, c))
