class Calculator {
  add(a: number, b: number): number {
    return a + b;
  }

  subtract(a: number, b: number): number {
    return a - b;
  }
}

const calc = new Calculator();

console.log(`The sum of the numbers is : ${calc.add(2, 5)}`);
console.log(`The difference of the numbers is : ${calc.subtract(12, 2)}`);
