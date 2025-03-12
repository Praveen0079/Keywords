public class HospitalManagement {
    static class Patient {
        static String hospitalName = "City Hospital"; // Static variable shared among all patients
        static int totalPatients = 0; // Static counter for total patients admitted

        String name;
        final int patientID; // Final variable for unique patient identification
        int age;
        String ailment;

        // Constructor using 'this' to initialize attributes
        public Patient(String name, int patientID, int age, String ailment) {
            this.name = name;
            this.patientID = patientID;
            this.age = age;
            this.ailment = ailment;
            totalPatients++; // Increment total patient count
        }

        // Static method to get total number of patients admitted
        public static void getTotalPatients() {
            System.out.println("Total Patients Admitted: " + totalPatients);
        }

        // Method to display patient details (uses instanceof for validation)
        public void displayPatientInfo() {
            if (this instanceof Patient) {
                System.out.println("Patient Name: " + name);
                System.out.println("Patient ID: " + patientID);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
                System.out.println("Hospital: " + hospitalName);
            } else {
                System.out.println("Invalid object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating patient instances
        Patient patient1 = new Patient("John Doe", 101, 45, "Flu");
        Patient patient2 = new Patient("Jane Smith", 102, 32, "Fracture");

        // Display patient details
        patient1.displayPatientInfo();
        System.out.println();
        patient2.displayPatientInfo();

        System.out.println();
        // Display total patients admitted
        Patient.getTotalPatients();
    }
}
