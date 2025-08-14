class Box<T> {
  value: T;
  constructor(value: T) {
    this.value = value;
  }

  getValue(): T {
    return this.value;
  }
}

const numberBox = new Box<number>(123);
console.log(numberBox.getValue());

const strBox = new Box<string>("Deekshitha");
console.log(strBox.getValue());
