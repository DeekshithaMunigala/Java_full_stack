const loginBtn = document.getElementById("loginBtn");
const logoutBtn = document.getElementById("logoutBtn");

function updateStatus() {
  const storedUser = localStorage.getItem("userName");
  if (storedUser) {
    console.log(`Logged in as: ${storedUser}`);
  } else {
    console.log("Not logged in");
  }
}

loginBtn.addEventListener("click", () => {
  const userName = document.getElementById("userName").value;
  const password = document.getElementById("password").value;

  if (userName && password) {
    localStorage.setItem("userName", userName);
    updateStatus();
    alert("Login successful!");
  } else {
    alert("Please enter both userId and password.");
  }
});

logoutBtn.addEventListener("click", () => {
  localStorage.removeItem("userId");
  updateStatus();
  userName.value = "";
  password.value = "";
  alert("Logged out successfully!");
});

updateStatus();
