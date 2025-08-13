const email = document.getElementById("email");
const emailError = document.getElementById("email-error");
const password = document.getElementById("password");
const passwordError = document.getElementById("password-error");
const loginBtn = document.getElementById("loginBtn");

function validateEmail() {
  const emailValue = email.value.trim();
  if (emailValue === "") {
    emailError.innerText = "Email can't be empty";
    emailError.style.display = "block";
    return false;
  } else if (!email.checkValidity()) {
    emailError.innerText = "Invaild email address";
    emailError.style.display = "block";
    return false;
  }

  const atIndex = emailValue.indexOf("@");
  const dotIndex = emailValue.lastIndexOf(".");

  if (
    atIndex < 1 ||
    dotIndex < atIndex + 2 ||
    dotIndex === emailValue.length - 1
  ) {
    emailError.innerText = "Invalid email address";
    emailError.style.display = "block";
    return false;
  }
  emailError.style.display = "none";
  return true;
}

function validatePassword() {
  const passwordValue = password.value.trim();

  if (passwordValue === "") {
    passwordError.innerText = "Password can't be empty";
    passwordError.style.display = "block";
    return false;
  } else if (passwordValue.length < 10) {
    passwordError.innerText = "Password can't be less than 10 charcters";
    passwordError.style.display = "block";
    return false;
  }
  passwordError.style.display = "none";
  return true;
}

email.addEventListener("blur", validateEmail);
password.addEventListener("blur", validatePassword);

email.addEventListener("input", validateEmail);
password.addEventListener("input", validatePassword);

loginBtn.addEventListener("click", function (e) {
  e.preventDefault();
  const isEmailValid = validateEmail();
  const isPasswordValid = validatePassword();
  if (isEmailValid && isPasswordValid) {
    alert("Login successful!");
  }
});
