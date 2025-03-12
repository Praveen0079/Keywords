public class EmployeeManagement {
    public static class Employee {
        String companyName = "Universal"; // Static variable shared across all employees
        static int totalEmployees = 0; // Static counter for total employees

        String name;
        final int id; // Final variable to ensure unique employee ID
        String designation;

        // Constructor using 'this' to initialize attributes
        public Employee(String name, int id, String designation) {
            this.name = name; 
            this.id = id;
            this.designation = designation;
            totalEmployees++; // Increment total employees count
        }

        // Static method to display total employees
        public static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }

        // Method to display employee details (uses instanceof for validation)
        public void displayEmployeeInfo() {
            if (this instanceof Employee) {
                System.out.println("Employee Name: " + name);
                System.out.println("Employee ID: " + id);
                System.out.println("Designation: " + designation);
                System.out.println("Company: " + companyName);
            } else {
                System.out.println("Invalid object.");
            }
        }
    }
        public static void main(String[] args) {
            // Creating employee instances
            Employee emp1 = new Employee("Tony Stark", 101, "Genius");
            Employee emp2 = new Employee("Bruce Wayne", 102, "Batman");

            // Display employee details
            emp1.displayEmployeeInfo();
            System.out.println();
            emp2.displayEmployeeInfo();

            System.out.println();
            // Display total employees
            Employee.displayTotalEmployees();
        }
}
