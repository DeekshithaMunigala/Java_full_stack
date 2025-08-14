var employeeList = [
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
function printEmployeeAndCount(employeeList) {
    console.log("Employee List : ");
    employeeList.forEach(function (emp) {
        console.log("ID : ".concat(emp.empId, ", Name : ").concat(emp.empName, ", Salary : ").concat(emp.salary));
    });
    return employeeList.length;
}
// const count = printEmployeeAndCount(employeeList);
// console.log(`Total number of employees : ${count}`);
console.log(printEmployeeAndCount(employeeList));
