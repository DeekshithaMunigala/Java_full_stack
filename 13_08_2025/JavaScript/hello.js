//   Exercise 1
function add(a, b) {
  //   console.log(a + b);
}

add(3, 4);
add("Deekshitha", " Munigala");
add(true, false);
add(true, true);
add(false, false);

// Exercise-2
let str = document.getElementById("heading").innerText;
// console.log(str);

document.getElementById("heading").innerHTML =
  "<b><i>JavaScript is a dynamic language</i></b>";

//   Excercise-3
function strLength() {
  let a = document.getElementById("strInput").value;
  //   console.log(a.length);
}

// Exercise-4
let sentenceInput = document.getElementById("sentence");
let p = document.getElementById("char");

sentenceInput.addEventListener("input", function () {
  let characterCount = 50 - sentence.value.length;
  p.innerText = `The characters left to enter are ${characterCount}`;
});

// Exercise-5
// **********VAR
// var only has gloal and functional scope but not block scope
// var x = 4;
// console.log(x);

// var x = 10; // can be redeclared and reassigned
// console.log(x);

// Block scope
// if (true) {
//   var y = 7;
//   console.log(y);
// }
// console.log(y);

// Functional or Local scope
// function log() {
//   var z = 10;
//   console.log(z);
// }
// log();
// console.log(z); // ReferenceError: z is not defined

//******** LET
// let has gloal, functional scope and block scope
// let a = 10;
// console.log(a);

// a = 20; // let can only be reassigned but can't be redeclared
// console.log(a);

// // Block scope
// if (true) {
//   let b = 12;
//   console.log(b);
// }
// // console.log(b); // ReferenceError: b is not defined

// // Functional or Local scope
// function print() {
//   let c = 2;
//   console.log(c);
//   console.log(a);
// }
// print();
// console.log(c); // ReferenceError: c is not defined

// **********CONST
// const has gloal, functional scope and block scope
// const a = 10;
// console.log(a);

// a = 20; // const can neither be redeclared nor reassigned
// console.log(a); // Assignment to constant variable.

// Block scope
// if (true) {
//   const b = 12;
//   console.log(b);
// }
// console.log(b); // ReferenceError: b is not defined

// Functional or Local scope
// function print() {
//   const c = 2;
//   console.log(c);
//   console.log(a);
// }
// print();
// console.log(c); // ReferenceError: c is not defined

// Exercise-6
let names = ["Deekshitha", "Varshini", "Amit", "Rahul", "John"];

let filteredUppercaseNames = names
  .filter((name) => name.length > 5)
  .map((name) => name.toUpperCase());
console.log(filteredUppercaseNames);

// Exercise-7
let persons = [
  {
    name: "amit",
    age: 30,
    city: "Hyderabad",
  },
  {
    name: "jhon",
    age: 17,
    city: "chennai",
  },
  {
    name: "rahul",
    age: 21,
    city: "pune",
  },
  {
    name: "raj",
    age: 21,
    city: "kerala",
  },
];

let eligibleToVote = persons.filter((person) => person.age >= 18);
console.log(eligibleToVote);
