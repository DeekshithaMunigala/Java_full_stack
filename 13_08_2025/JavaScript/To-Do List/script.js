const input = document.getElementById("task");
const addBtn = document.getElementById("addBtn");
const taskList = document.getElementById("task-list");

addBtn.addEventListener("click", function () {
  const task = input.value;

  const li = document.createElement("li");
  li.innerText = task;

  const delBtn = document.createElement("button");
  delBtn.innerText = "Delete";

  delBtn.addEventListener("click", function () {
    taskList.removeChild(li);
  });

  li.appendChild(delBtn);
  taskList.appendChild(li);

  input.value = "";
});
