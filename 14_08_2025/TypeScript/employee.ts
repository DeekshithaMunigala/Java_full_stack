interface Employee {
  empId: number;
  empName: string;
  salary: number;
}

let employeeList: Employee[] = [
  {
    empId: 1,
    empName: "Alice",
    salary: 50000,
  },
  {
    empId: 2,
    empName: "Bob",
    salary: 60000,
  },
  {
    empId: 3,
    empName: "Charlie",
    salary: 55000,
  },
];

function printEmployeeAndCount(employeeList: Employee[]): number {
  console.log("Employee List : ");
  employeeList.forEach((emp) => {
    console.log(
      `ID : ${emp.empId}, Name : ${emp.empName}, Salary : ${emp.salary}`
    );
  });

  return employeeList.length;
}

// const count = printEmployeeAndCount(employeeList);
// console.log(`Total number of employees : ${count}`);

console.log(printEmployeeAndCount(employeeList));
