#lang scheme

;; ABOUT
; I made this file to be a basic guide to the Scheme programming language. The
; goal was for this to be a summary of the language specification, with the
; audience being either students who are learning the language for school or
; someone who just wanted to get a quick overview of the language. For more
; information, check out the language specification (links below).

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

;; NOTE
; This guide mainly follows the R5RS standard.


;; COMMENTS
; ';' starts a single-line comment
#; ('#;' comments out a form)
#; (Can
      be
        multiple
          lines)
(newline)  ; Evaluates to "create a new line" (press the enter key)

;; FORMS
"FORMS"
; Self-evaluating forms:
1                ; Numbers
"Hello, world!"  ; Strings
#\A              ; Characters
#t               ; Booleans
(newline)

; Procedures (something you want Scheme to evaluate)
; (<operator> <operand1> ...)
(+ 1 2)                 ; 1 + 2
(* 1 2 3 4)             ; 1 * 2 * 3 * 4
(+ 1 (- 2 3) (+ -4 5))  ; (1 + (2 - 3) + (-4 + 5))
; (lambda <formals> <body>)  ; where <formals> is a list of arguments
(lambda (n) (* n n))      ; outputs: <procedure:...>
; NOTE: This defines a procedure that is not bound to anything.
((lambda (n) (* n n)) 5)  ; outputs: 25
(newline)


;; DATA TYPES
"DATA TYPES"
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

; - Procedures (Primatives)
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
; Literal expressions in Scheme are "external representations" of objects, or
; forms, using the "literal" characters that "define" them. For example, the
; number 8 is an object with the integer value 8, but the "external representation"
; of the number is "literal" character '8'. An example with a Scheme form is
; (+ 1 2). This is a procedure that evaluates 1 + 2, resulting in 3, but the
; "external representation" is "literal" sequence of characters "(+ 1 2)".
; 'obj
; (quote obj)
'a               ; outputs: a
(quote a)        ; outputs: a
'(+ 1 2)         ; outputs: (+ 1 2)
(quote (+ 1 2))  ; outputs: (+ 1 2)
''a              ; outputs: (quote a)
'(quote a)       ; outputs: (quote a)
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
; The 'cons' or 'quote' procedures can create a pair.
; (cons obj1 obj2)  ; must pass exactly two objects
; NOTE: 'cons' can also create lists (more on cons in section "LISTS & PAIRS").
(cons 0 1)
(cons '0 '1)
(quote (a . b))
'(0 . 1)
(newline)

; - Lists
; The 'list' procedure will create a list
(list 1 2 3)
(list 'a 'b 'c)
'(a b c)
(quote (a b c))
(newline)


;; DEFINITIONS
"DEFINITIONS"
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
; NOTE: The variable 'set!' is used on must be bound, E.X. via 'define',
;       in the same scope as the 'set!' call, or the top level/global scope.
myNum
(set! myNum 10)
myNum
(set! myNum (+ 8 7))
myNum
(newline)

; - Let, Let*, & Letrec
; (let/let*/letrec <bindings> <body>)
; The three "lets" allows us to define a local block of code (a local scope)
(define a 2)
(define b 3)
; 'let' computes the initial values BEFORE the variables are bound
(let ((a 1) (b 1))  ; Creates a LOCAL 'a' and 'b', giving them the value of 1
  (* a b))          ; This operation uses the LOCAL 'a' and 'b'
; outputs: 1
(let ((a 1) (b a))  ; Because the init vals are computed first, 'b' is assigned
  (* a b))          ; the GLOBAL 'a' value of 2, not the LOCAL 'a' value of 1
; outputs: 2
; 'let*' binds the variables sequentially, so the first binding happens then the
; second binding happens, and so on...
(let* ((a 1) (b 1))  ; In this case nothing changes, because the initial values
  (* a b))           ; are not tied to any variables
; outputs: 1
(let* ((a 1) (b a))  ; Because the '(b a)' binding happens AFTER the '(a 1)',
  (* a b))           ; 'b' is assigned the LOCAL value of 'a', which is 1
; outputs: 1
; 'letrec' binds all the variables to undefined values, and then the initial
; values are computed and assigned to their corresponding variable
; NOTE: Because 'letrec' binds the vars BEFORE any computations of init vals,
;       it will give an error if it is not possible to evaluate any of the init
;       vals (usually from involving locally bound vars in the init vals).
;       Because of this, 'letrec' is generally used when the init vals are
;       lambdas.
(letrec ((a 1) (b a))  ; This still works because it is possible to evaluate all
  (* a b))             ; init vals, in this case by evaluating the init val of
                       ; 'a' BEFORE the init val of 'b'.
; outputs: 1
#;(letrec ((a b) (b a))  ; Because both variables are recursively defined by each
    (* a b))             ; other, the init vals cannot be evaluated, which results
                         ; in an error.
; outputs: ERROR
(newline)


;; INPUT & OUTPUT
; TODO
(newline)


;; PREDICATES
"PREDICATES"
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
"FUNCTIONS ON NUMBERS"
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
"BOOLEAN FUNCTIONS"
(not #t)     ; Only returns '#t' if the argument is false
(and #t #f)  ; Does use short-circuit evaluation
(or #t #f)
(newline)


;; SYMBOLS, CHARACTERS, & STRINGS
; TODO


;; CONDITIONALS
"CONDITIONALS"
; (if <test> <true_option>)
; (if <test> <true_option> <false_option>)
(if (= 1 1) 'true 'false)
(if (< 5 3)
    'true
    'false)

; (cond <clause1> <clause2> ...)
; Each clause is of the form: (<test> <expr1> ...)
(cond ((> 2 2) 'greater)
      ((< 2 2) 'less)
      (else 'equal))
(newline)


;; ITERATION
"ITERATION"
; - do
; 'do' is a standard form used for looping. Specifically, it is a binding construct
; similar to 'lambda' or the "lets". The syntax for using 'do' is:
#; (do ((<var1> <init1> <step1>)
        ...)
       (<test> <expr1> ...)
     <command> ...)
; Before iteration begins, each <init> is evaluated, then each <var> is bound in
; memory, and then the corresponding <init> results are assigned to their <var>s.
; Each iteration starts by evaluating <test>. If <test> is true (#t), then all of
; the following <expr>s are evaluated and the last one is returned. If <test> is
; false (#f), then all <command> expressions are evaluated, then the <step>s are
; evaluated to update <var>s, and then the next iteration begins.

; Here is an example that sums up the elements in a list:
(do ((x '(1 2 3 4 5) (cdr x))
     (sum 0 (+ sum (car x))))
    ((null? x) sum))
; NOTE: In this example we create two <var>s and have no <command>s

; Here is an example that creates a list and prints the value added to the list
; during each iteration:
(do ((lst (list) (append lst (list i)))
     (i 0 (+ i 1)))
    ((> i 3) (newline) lst)
  (display i)
  (write-char #\space))
; NOTE: In this example we have two <var>s, two <command>s, and two expressions
;       that will be evaluated after the <test> finally fails, with the final
;       expression, 'lst', being returned.

; - let
; (let <var> <bindings> <body>)
; A "named let" can also be used to create a loop. It is basically the same
; syntax and has similar functionality to 'let' with the difference being it
; creates a procedure in <body> whose name is <var> and body is <body>. This
; means that we can use recursion with this looping construct (by calling the
; procedure <var> within <body>).

; Here is an example that returns the list of non negative numbers from a list
; of numbers:
(let loop ((nums '(3 -2 1 6 -5))
           (non-negs '()))
  (cond ((null? nums) non-negs)
        ((>= (car nums) 0)
          (loop (cdr nums)
                (cons (car nums) non-negs)))
        ((< (car nums) 0)
          (loop (cdr nums)
                non-negs))))
; Practice: Notice that the positive numbers are returned in reverse. Why is that,
;           and how would you fix that so they are in their original order?
; Practice: Extend the loop to also create a list of the negative numbers.
(newline)


;; LISTS & PAIRS
"LISTS & PAIRS"
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
; 'cons' creates a pair/list out of two arguments
(cons 'z myList2)       ; outputs: (z a b c)
(cons myList2 'z)       ; outputs: ((a b c) . z)
(cons myList2 myList2)  ; outputs: ((a b c) a b c)
; NOTE: 'cons'  will only result in a list if the second argument is a list.
; NOTE: The first argument of 'cons' will always be treated as single element
;       (even if it is a list).
; 'list' creates a list out of the arguments
(list 'a 'b 'c)    ; outputs: (a b c)
(append myList2 '(x y z))  ; Appends the list '(x y z)' onto the list 'myList2'
#; NOTE: (cons myList2 '(x y z))    ; outputs: ((a b c) x y z)
#;       (append myList2 '(x y z))  ; outputs: (a b c x y z)
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
