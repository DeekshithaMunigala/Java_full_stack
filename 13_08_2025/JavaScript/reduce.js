// Exercise-8
let employees = [
  {
    empName: "amit",
    empId: "E01",
    role: "manager",
    empSalary: 90000,
  },
  {
    empName: "raj",
    empId: "E02",
    role: "QA",
    empSalary: 70000,
  },
  {
    empName: "amit",
    empId: "E03",
    role: "manager",
    empSalary: 80000,
  },
  {
    empName: "rahul",
    empId: "E04",
    role: "Developer",
    empSalary: 95000,
  },
];

let totalSalary = employees
  .filter((emp) => emp.role === "manager")
  .reduce((total, emp) => total + emp.empSalary, 0);
console.log(`The total salary drawn by all managers is : ${totalSalary}`);

// Exercise-9
// persons list is already in the hello.js so not needed to include here we can still access it

// for (let i = 0; i < persons.length; i++) {
//   if (persons[i].age > 18) {
//     persons[i].ageStatus = "Adult";
//   } else {
//     persons[i].ageStatus = "Minor";
//   }
// }

// console.log(persons);

// Exercise-10
let newPersonsList = persons.map((person) => {
  if (person.age > 18) {
    person.ageStatus = "Adult";
  } else {
    person.ageStatus = "Minor";
  }
  return person;
});
console.log(newPersonsList);

// Exercise-11
let date = new Date(2030, 7, 13);

let weekDays = [
  "Sunday",
  "Monday",
  "Tuesday",
  "Wednesday",
  "Thursday",
  "Friday",
  "Saturday",
];

let dayName = weekDays[date.getDay()];
console.log(dayName);
console.log(date.getDay());

// Exercise-12

let name = "madam";

let palindrome = name.split("").reverse().join("");

if (name === palindrome) {
  console.log(`The string ${name} is a palindrome`);
} else {
  console.log(`The string ${name} is not a palindrome`);
}

let reverse = "";
for (let i = name.length - 1; i >= 0; i--) {
  reverse += name[i];
}
console.log(reverse);

if (reverse === name) {
  console.log(`The string ${name} is a palindrome`);
} else {
  console.log(`The string ${name} is not a palindrome`);
}
