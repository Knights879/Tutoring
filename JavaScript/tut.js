"use strict";

function doSomething1() {
   //
}

const doSomething2 = () => {
   //
};

// Goes to

export default function doSomething3() {
   //
}

export const doSomething4 = () => {
   //
};

// Objects

const person1 = {
   name: "Name",
   age: 0,
   isMale: true,
};

const name1 = person1.name;
const age1 = person1.age;
const isMale1 = person1.isMale;

// Goes to

const { name2, age2, isMale2 } = person1;

// Or

const name3 = "Name";
const age3 = 0;
const isMale3 = true;

const person2 = {
   name3,
   age3,
   isMale3,
};

const person3 = { ...person2, name3: "Name2" };

// Map and filter

const names = ["Name1", "Name2", "Name3"];
const names2 = [...names, "Name4"];

names.map((name) => {
   console.log(name);
});

// A return statement in the function passed to map will change the elements in the array

names.map((name) => {
   return name + "1";
});

names.filter((name) => {
   return name !== "Name1";
});
