var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var calc = new Calculator();
console.log("The sum of the numbers is : ".concat(calc.add(2, 5)));
console.log("The difference of the numbers is : ".concat(calc.subtract(12, 2)));
