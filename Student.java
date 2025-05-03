//. Assign and print the roll number, phone number and address of two 
students having names "Ram" and "Sanjay" respectively by creating two 
objects of class 'Student'


// Define the Student class
class Student {
    // Declare instance variables
    String name;
    int roll_no;
    String phone;
    String address;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println(); // For spacing between students
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create first student object
        Student student1 = new Student();
        student1.name = "Ram";
        student1.roll_no = 1;
        student1.phone = "9876543210";
        student1.address = "123 Main Street";

        // Create second student object
        Student student2 = new Student();
        student2.name = "Sanjay";
        student2.roll_no = 2;
        student2.phone = "9123456780";
        student2.address = "456 Park Avenue";

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
    }
}
