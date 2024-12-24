package sql;
import java.sql.*;
import java.util.*;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isValidName() {
        return !name.matches(".[!@#$%^&(),.?\":{}|<>].*");
    }

    public boolean isValidPhoneNumber() {
        return phoneNumber.matches("\\d{10}");
    }
}

public class TelephoneDirectory {
    private static Connection connection;

    public static void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telephone", "root", "rk6122003");
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    public static void createContact(Contact contact) {
        if (!contact.isValidName()) {
            System.out.println("Invalid name: Name should not contain special characters.");
            return;
        }

        if (!contact.isValidPhoneNumber()) {
            System.out.println("Invalid phone number: Must be a 10-digit number.");
            return;
        }

        try {
            String query = "INSERT INTO contact (name, phone_number) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, contact.name);
            stmt.setString(2, contact.phoneNumber);
            stmt.executeUpdate();
            System.out.println("Contact added successfully.");
        } catch (SQLException e) {
            System.out.println("Error creating contact: " + e.getMessage());
        }
    }

    public static void updateContact(String oldName, Contact newContact) {
        if (!newContact.isValidName()) {
            System.out.println("Invalid name: Name should not contain special characters.");
            return;
        }

        if (!newContact.isValidPhoneNumber()) {
            System.out.println("Invalid phone number: Must be a 10-digit number.");
            return;
        }

        try {
            String query = "UPDATE contact SET name = ?, phone_number = ? WHERE name = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, newContact.name);
            stmt.setString(2, newContact.phoneNumber);
            stmt.setString(3, oldName);
            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Contact updated successfully.");
            } else {
                System.out.println("Contact not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating contact: " + e.getMessage());
        }
    }

    public static void deleteContact(String name) {
        try {
            String query = "DELETE FROM contact WHERE name = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Contact deleted successfully.");
            } else {
                System.out.println("Contact not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting contact: " + e.getMessage());
        }
    }

    public static void displayContacts() {
        try {
            String query = "SELECT * FROM contact";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String phoneNumber = rs.getString("phone_number");
                System.out.println("Name: " + name + ", Phone: " + phoneNumber);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching contacts: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        connectToDatabase();

        while (true) {
            System.out.println("1. Create Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Contact Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = scanner.nextLine();

                Contact contact = new Contact(name, phone);
                createContact(contact);

            } else if (choice == 2) {
                System.out.print("Enter the name of the contact to update: ");
                String oldName = scanner.nextLine();
                System.out.print("Enter New Contact Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter New Phone Number: ");
                String newPhone = scanner.nextLine();

                Contact newContact = new Contact(newName, newPhone);
                updateContact(oldName, newContact);

            } else if (choice == 3) {
                System.out.print("Enter the name of the contact to delete: ");
                String name = scanner.nextLine();
                deleteContact(name);

            } else if (choice == 4) {
                displayContacts();

            } else if (choice == 5) {
                break;
            }
        }

        scanner.close();
    }
}
