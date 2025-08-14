function pair(first, second) {
    return [first, second];
}
var numberAndString = pair(42, "Deekshitha");
console.log(numberAndString);
var objectAndArray = pair({ firstName: "Deekshitha", secondName: "Munigala" }, [1, 2, 3]);
console.log(objectAndArray);
var stringAndBoolean = pair("Deekshitha", true);
console.log(stringAndBoolean);
