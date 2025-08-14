var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (item) {
        this.items.push(item);
    };
    Stack.prototype.pop = function () {
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        return this.items[this.items.length - 1];
    };
    return Stack;
}());
var numberStack = new Stack();
numberStack.push(2);
numberStack.push(7);
numberStack.push(5);
console.log(numberStack.peek());
console.log(numberStack.pop());
console.log(numberStack.peek());
var stringStack = new Stack();
stringStack.push("Jungkook");
stringStack.push("Kookiee");
stringStack.push("Hobi");
console.log(stringStack.peek());
console.log(stringStack.pop());
console.log(stringStack.peek());
