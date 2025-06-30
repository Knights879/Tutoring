"use strict";

var x = findMinValue(3, 5);

function findMinValue(a, b) {
   if (a < b)
      return a;
   else
      return b;
}

console.log(x);

var i = 12;
var j = 30;
var k = 28;

function product(a, b, c) {
   return a * b * c;
}

console.log(product(i, j, k));
