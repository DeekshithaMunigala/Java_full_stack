const cities = ["Tokyo", "New York", "Paris", "London", "Sydney", "Berlin"];

console.log(cities);

const button = document.getElementById("loadCitiesBtn");
const dropdown = document.getElementById("cityDropdown");

button.addEventListener("click", function () {
  dropdown.innerHTML = '<option value="">--Select a city--</option>';

  const sordtedCities = cities.sort();

  sordtedCities.forEach((city) => {
    const option = document.createElement("option");

    option.value = "city";
    option.textContent = city;
    dropdown.appendChild(option);
  });
});
