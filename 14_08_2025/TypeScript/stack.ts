class Stack<T> {
  items: T[] = [];

  push(item: T): void {
    this.items.push(item);
  }

  pop(): T | undefined {
    return this.items.pop();
  }

  peek(): T | undefined {
    return this.items[this.items.length - 1];
  }
}

const numberStack = new Stack<number>();
numberStack.push(2);
numberStack.push(7);
numberStack.push(5);
console.log(numberStack.peek());
console.log(numberStack.pop());
console.log(numberStack.peek());

const stringStack = new Stack<string>();
stringStack.push("Jungkook");
stringStack.push("Kookiee");
stringStack.push("Hobi");
console.log(stringStack.peek());
console.log(stringStack.pop());
console.log(stringStack.peek());
