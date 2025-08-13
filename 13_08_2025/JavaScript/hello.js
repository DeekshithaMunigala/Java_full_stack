//   Exercise 1
function add(a, b) {
  console.log(a + b);
}

add(3, 4);
add("Deekshitha", " Munigala");
add(true, false);
add(true, true);
add(false, false);

// Exercise-2
let str = document.getElementById("heading").innerText;
console.log(str);

document.getElementById("heading").innerHTML =
  "<b><i>JavaScript is a dynamic language</i></b>";
