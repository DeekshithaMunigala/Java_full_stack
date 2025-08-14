// Exercise-1
let numbers = [1, 2, 3, 4, 5];

const sum = (numbers) =>
  numbers.reduce((total, num) => {
    return total + num;
  }, 0);

console.log(sum(numbers));

// Exercise-2
const doubleNumbers = (numbers) => numbers.map((num) => num * 2);
console.log(doubleNumbers(numbers));

// Exercise-3
class Util {
  getDate() {
    const today = new Date();
    let day = today.getDate();
    let month = today.getMonth() + 1;
    const year = today.getFullYear();

    day = day < 10 ? "0" + day : day;
    month = month < 10 ? "0" + month : month;

    return `${day}-${month}-${year}`;
  }

  getPIValue() {
    return Math.PI;
  }

  convertC2F(celsius) {
    return (celsius * 9) / 5 + 32;
  }

  getFibonacci(n) {
    if (n <= 0) return [];
    if (n === 1) return [0];
    if (n === 2) return [0, 1];

    let fib = [0, 1];
    for (let i = 2; i < n; i++) {
      fib.push(fib[i - 1] + fib[i - 2]);
    }
    return fib;
  }
}

const Util1 = new Util();

console.log(Util1.getDate());
console.log(Util1.getPIValue());
console.log(Util1.convertC2F(32));
console.log(Util1.getFibonacci(5));

// Exercise-4
class BankAccounts {
  constructor(accNumber, balance) {
    this.accNumber = accNumber;
    this.balance = balance;
  }

  deposit(amount) {
    this.balance += amount;

    return `The amount deposited in the account ${this.accNumber} is ${amount} and total saving ${this.balance}`;
  }

  withdraw(amount) {
    this.balance -= amount;

    if (amount <= this.balance) {
      return `The amount withdrawn from the account ${this.accNumber} is ${amount} and total saving ${this.balance}`;
    } else {
      return `Insufficent amount`;
    }
  }
}

const newBankAccounts = new BankAccounts("1456797273", 10000);
console.log(newBankAccounts.deposit(7000));
console.log(newBankAccounts.withdraw(1000));

// Exercise-5
class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `${this.make} ${this.model} ${this.year}`;
  }
}

class Car extends Vehicle {
  constructor(make, model, year, numOfDoors) {
    super(make, model, year);
    this.numOfDoors = numOfDoors;
  }

  getInfo() {
    return `Car: ${this.make} ${this.model}, Year: ${this.year}, Doors: ${this.numOfDoors}`;
  }
}

const myVehicle = new Vehicle("toyato", "Corolla", 2020);
console.log(myVehicle.getInfo());

const myCar = new Car("toyato", "Corolla", 2020, 4);
console.log(myCar.getInfo());

// Exercise- 6
const movie = {
  movieName: "RRR",
  movieLanguage: "Telugu",
  imdbRating: 9.8,
};

// console.log(movie.movieName, movie.movieLanguage, movie.imdbRating);

const { movieName, movieLanguage, imdbRating } = movie;

console.log(
  `movieName : ${movieName}, movieLanguage : ${movieLanguage}, imdbRating : ${imdbRating}`
);

// Exercise-7
// Spread Operator
const obj1 = {
  a: 1,
  b: 2,
};

const obj2 = {
  b: 3,
  c: 4,
};

const mergedObj = { ...obj1, ...obj2 };
console.log(mergedObj);

// Exercise-8
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const newArr = [4, 5, ...arr1, 6, 7, ...arr2, 8, 9];
console.log(newArr);

// Exercise-9
function sumUsingSpread(a, b, c) {
  return a + b + c;
}

console.log(sumUsingSpread(...arr1));

// Exercise-10
function sumNumbers(...numbers) {
  return numbers.reduce((sum, num) => sum + num, 0);
}

console.log(sumNumbers(3, 4, 5, 6));

// Exercise-12
function separateFirstRest(...args) {
  const [firstArgument, ...rest] = args;
  return { firstArgument, ...rest };
}

console.log(separateFirstRest(7, 45, 67, 84));
console.log(separateFirstRest("a", "b", "c"));
