function pair<T, U>(first: T, second: U): [T, U] {
  return [first, second];
}

let numberAndString = pair(42, "Deekshitha");
console.log(numberAndString);

let objectAndArray = pair(
  { firstName: "Deekshitha", secondName: "Munigala" },
  [1, 2, 3]
);
console.log(objectAndArray);

let stringAndBoolean = pair("Deekshitha", true);
console.log(stringAndBoolean);
