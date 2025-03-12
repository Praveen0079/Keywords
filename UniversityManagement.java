public class UniversityManagement {
    static class Student {
        static String universityName = "Chitkara University"; // Static variable shared across all students
        static int totalStudents = 0; // Static counter for total students

        String name;
        final int rollNumber; // Final variable to ensure unique roll number
        String grade;

        // Constructor using 'this' to initialize attributes
        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++; // Increment total students count
        }

        // Static method to display total students
        public static void displayTotalStudents() {
            System.out.println("Total Students Enrolled: " + totalStudents);
        }

        // Method to display student details (uses instanceof for validation)
        public void displayStudentInfo() {
            if (this instanceof Student) {
                System.out.println("Student Name: " + name);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Grade: " + grade);
                System.out.println("University: " + universityName);
            } else {
                System.out.println("Invalid object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating student instances
        Student student1 = new Student("Mark Zuck", 101, "A");
        Student student2 = new Student("Virat Kohli", 102, "B+");

        // Display student details
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();

        System.out.println();
        // Display total students enrolled
        Student.displayTotalStudents();
    }
}
