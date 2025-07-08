#lang scheme

;; ACKNOWLEDGEMENTS
; Most of the info in these files come from the official language specification or
; Logic Lambda's "Introduction to Scheme Programming (CSC240)" playlist on YouTube
; (https://www.youtube.com/playlist?list=PLm8dSOaqLPHKVPwBkk9UeAB2Lokl1xMJM).

;; SPECIFICATION
; For the language specification, see:
;   https://standards.scheme.org/
; For a quick overview of 'keywords' in the language, see:
;   https://en.wikipedia.org/wiki/Scheme_(programming_language)#Standard_forms
; For a quick overview of 'procedures' in the language, see:
;   https://en.wikipedia.org/wiki/Scheme_(programming_language)#Standard_procedures

;; COMMENTS
; ';' starts a single-line comment
#; ('#;' comments out a form)
#; (Can
      be
        multiple
          lines)
(newline)  ; Evaluates to "create a new line" (press the enter key)

;; FORMS
; Self-evaluating forms:
1                ; Numbers
"Hello, world!"  ; Strings
(newline)

; Procedures (something you want Scheme to evaluate)
; (<operator> <operand1> ...)
(+ 1 2)                 ; 1 + 2
(* 1 2 3 4)             ; 1 * 2 * 3 * 4
(+ 1 (- 2 3) (+ -4 5))  ; (1 + (2 - 3) + (-4 + 5))
(newline)


;; DATA TYPES
; - Numbers
; Standard numbers
8       ; Integer
3.14    ; Real
7/10    ; Rational
1+2i    ; Complex
; Prefix numbers
#b0101  ; binary
#o0101  ; octal
#d0101  ; decimal
#x0101  ; hexadecimal
; Suffix numbers
2.71s0  ; short
3.14f0  ; single (float)
3.14d0  ; double
2.71l0  ; long
; NOTE: You cannot use whitespace in the middle of the number!
(newline)

; - Primatives (Procedures)
+  ; Plus (addition)
-  ; Minus (subtraction)
*  ; Asterisk/Star (multiplication)
; Etc.
(newline)

; - Booleans
#t  ; true
#f  ; false
(newline)

; - Characters
#\a  ; the letter 'a'
#\A  ; the letter 'A'
(newline)

; - Strings
"stringy"
"this is a string"
(newline)

; - Literals
'a          ; outputs: a
(quote a)   ; outputs: a
''a         ; outputs: (quote a)
'(quote a)  ; outputs: (quote a)
(newline)

; - Symbols
; Symbols are objects that we can use to see if two symbols are spelled the same.
; Symbols are unique/static.
(symbol? 'Hello)   ; outputs: #t  ; because it is a literal string
(symbol? "Hello")  ; outputs: #f  ; because it is a String object
(symbol? '1)       ; outputs: #f  ; because Scheme treats it as an integer
(symbol? '1abc)    ; outputs: #t  ; because Scheme treats it as a literal string
(newline)

; - Pairs
(cons 0 1)
(cons '0 '1)
'(0 . 1)
(quote (a . b))
(newline)

; - Lists
(list 1 2 3)
(list 'a 'b 'c)
'(a b c)
(quote (a b c))
(newline)


;; DEFINITIONS
; - Define
; We can use 'define' to associate a name to a value.
(define myNum 7)
(define myStr "Test")
(define doubleIt
  (lambda (x)
    (* 2 x)))
(newline)

; - Set
; We can use 'set!' to assign a value to a variable.
#; (NOTE: The variable 'set!' is used on must be bound, E.X. via 'define',
          in the same scope as the 'set!' call, or the top level/global scope.)
myNum
(set! myNum 10)
myNum
(set! myNum (+ 8 7))
myNum
(newline)

; - Let
; TODO
; let
; let*
; letrec
(newline)


;; INPUT & OUTPUT
; TODO
(newline)


;; PREDICATES
; - Types of Numbers
(number? 4)
(real? 3.21)
(complex? 1+2i)
(integer? 5)
(rational? 5/2)
; NOTE: Scheme will try to be "smart" with its decisions. E.X.
#;      (real? 3+0i)    ; outputs: #t  ; because the imaginary part is 0
; Practice: How would you define this in Scheme?
#;      (integer? 2.0)  ; outputs: #t  ; because (= x (round x)) is true
; Practice: How would you define this in Scheme?
(newline)

; - Properties of Numbers
(exact? 1)
(inexact? 1.2)

(zero? 0)
(positive? 1)
(negative? -1)
(odd? 1)
(even? 2)
(newline)

; - Booleans
(boolean? #t)
(boolean? 1)
(newline)

; - Equivalence
(eq? 1 1)     ; Strictest, refer to the same obj
(eqv? 1 1)    ; Slightly less strict than 'eq?'
(equal? 1 1)  ; Least strict, refer to equivalent obj
(newline)

; - Strings
(define myStr2 "Hello")
(string? myStr2)
(string=? "Hello" myStr2)
(string=? "Hello" (symbol->string 'Hello))
(newline)

; - Pairs
(pair? (cons '1 '2))
(newline)

; - Lists
(define myList (list 1 2 3))
(list? myList)
(null? myList)  ; Is the list empty?
(newline)


;; FUNCTIONS ON NUMBERS
(= 1 2 3)   ; True if all arguments are equal  ; NOTE: Only for numbers!
(< 1 2 3)   ; True if all elements are greater than the previous element
(> 1 2 3)   ; True if all elements are less than the previous element
(<= 1 2 3)  ; True if all elements are greater than or equal to the previous element
(>= 1 2 3)  ; True if all elements are less than or equal to the previous element

(max 1 2)   ; Returns the maximum of the arguments
(min 1 2)   ; Returns the minimum of the arguments

(abs -3)    ; Returns the absolute value of the argument

(quotient 5 2)   ; Integer division
(remainder 5 2)  ; Remainder of integer division
(modulo 5 2)     ; Modulus of integer division
; NOTE: 'remainder' and 'modulo' start to differ when negatives are involved.

(floor 3.1)
(ceiling -2.7)
(truncate 1.1)
(round 3.14159)
(newline)


;; BOOLEAN FUNCTIONS
(not #t)     ; Only returns '#t' if the argument is false
(and #t #f)  ; Does use short-circuit evaluation
(or #t #f)
(newline)


;; SYMBOLS, CHARACTERS, & STRINGS
; TODO


;; CONDITIONALS
; (if <test> <true_option>)
; (if <test> <true_option> <false_option>)
(if (= 1 1) 'true 'false)
(if (5 < 3)
    'true
    'false)

; (cond <clause1> <clause2> ...)
; Each clause is of the form: (<test> <expr1> ...)
(cond ((> 2 2) 'greater)
      ((< 2 2) 'less)
      (else 'equal))
(newline)


;; ITERATION
; TODO
(newline)


;; LISTS & PAIRS
(define myPair (cons 'x 'y))
(define myList2 (list 'a 'b 'c))
; - Fundemental operations
; -- Element access
(car myPair)   ; Returns the first element in a pair
(cdr myPair)   ; Returns the second element in a pair
(car myList2)  ; Returns the first element in the list
(cdr myList2)  ; Returns the list minus the first element
(newline)

; -- Constuction
(cons 'z myList2)  ; Creates a list/pair out of the arguments
(list 'a 'b 'c)    ; Creates a list out of the arguments
(append myList2 '(x y z))  ; Appends the list '(x y z)' onto the list 'myList2'
; NOTE: (cons myList2 '(x y z))    ; outputs: ((a b c) x y z)
;       (append myList2 '(x y z))  ; outputs: (a b c x y z)
(newline)

; -- Properties
(length myList2)  ; Returns the length of the list
(newline)

; - Additional operations
(reverse myList2)  ; Returns a NEW list that is the reverse of the given list
; NOTE: That means it allocates a new list, and does not modify the original.
(cadr myList2)     ; Returns the second element in the list
(cddr myList2)     ; Returns the list minus the first two elements
; NOTE: Scheme provides up to four layers of 'car'/'cdr'. E.X. 'cddddr'
; Practice: How could you define 'cddddr'?
(newline)















