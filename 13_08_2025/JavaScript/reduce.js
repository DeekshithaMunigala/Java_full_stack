// Exercise-8
let employees = [
  {
    empName: "amit",
    empId: "E01",
    role: "manager",
    empSalary: 90000,
  },
  {
    empName: "raj",
    empId: "E02",
    role: "QA",
    empSalary: 70000,
  },
  {
    empName: "amit",
    empId: "E03",
    role: "manager",
    empSalary: 80000,
  },
  {
    empName: "rahul",
    empId: "E04",
    role: "Developer",
    empSalary: 95000,
  },
];

let totalSalary = employees
  .filter((emp) => emp.role === "manager")
  .reduce((total, emp) => total + emp.empSalary, 0);
console.log(`The total salary drawn by all managers is : ${totalSalary}`);
