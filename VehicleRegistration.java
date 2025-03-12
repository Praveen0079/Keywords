public class VehicleRegistration {
    static class Vehicle {
        static double registrationFee = 5000.0; // Static variable common for all vehicles

        String ownerName;
        final String registrationNumber; // Final variable for unique vehicle identification
        String vehicleType;

        // Constructor using 'this' to initialize attributes
        public Vehicle(String ownerName, String registrationNumber, String vehicleType) {
            this.ownerName = ownerName;
            this.registrationNumber = registrationNumber;
            this.vehicleType = vehicleType;
        }
 
        // Static method to update registration fee
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
            System.out.println("Registration Fee updated to: ₹" + registrationFee);
        }

        // Method to display vehicle details (uses instanceof for validation)
        public void displayVehicleInfo() {
            if (this instanceof Vehicle) {
                System.out.println("Owner Name: " + ownerName);
                System.out.println("Registration Number: " + registrationNumber);
                System.out.println("Vehicle Type: " + vehicleType);
                System.out.println("Registration Fee: ₹" + registrationFee);
            } else {
                System.out.println("Invalid object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Brad Pitt", "HP-71-4004", "Car");
        Vehicle vehicle2 = new Vehicle("Jack Sparrow", "HP-71-7971", "Bike");

        // Display vehicle details
        vehicle1.displayVehicleInfo();
        System.out.println();
        vehicle2.displayVehicleInfo();

        System.out.println();
        // Update and display new registration fee
        Vehicle.updateRegistrationFee(5500.0);
        System.out.println();

        // Display vehicle details after fee update
        vehicle1.displayVehicleInfo();
        System.out.println();
        vehicle2.displayVehicleInfo();
    }
}
