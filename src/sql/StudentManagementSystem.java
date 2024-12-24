package sql;
import java.sql.*;
import java.util.*;

class Student {
    int id;
    String name;
    double marks;
    double attendance;
    boolean ra;

    public Student(int id, String name, double marks, double attendance) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
        this.ra = attendance < 75.0;
    }
}

public class StudentManagementSystem {
    static final String DB_URL = "jdbc:mysql://localhost:3306/student";
    static final String USER = "root";
    static final String PASSWORD = "rk6122003";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to the database!");

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Student Details");
                System.out.println("2. Display Student Details");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addStudentDetails(conn, scanner);
                        break;
                    case 2:
                        displayStudentDetails(conn, scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addStudentDetails(Connection conn, Scanner scanner) {
        try {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            System.out.print("Enter Attendance Percentage: ");
            double attendance = scanner.nextDouble();

            boolean ra = attendance < 75.0;

            String query = "INSERT INTO students (id, name, marks, attendance, ra) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setDouble(3, marks);
                pstmt.setDouble(4, attendance);
                pstmt.setBoolean(5, ra);
                pstmt.executeUpdate();
                System.out.println("Student details added successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayStudentDetails(Connection conn, Scanner scanner) {
        try {
            System.out.print("Enter Student ID to fetch details: ");
            int id = scanner.nextInt();

            String query = "SELECT * FROM students WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, id);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    System.out.println("\nStudent Details:");
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Marks: " + rs.getDouble("marks"));
                    System.out.println("Attendance: " + rs.getDouble("attendance") + "%");
                    System.out.println("RA: " + (rs.getBoolean("ra") ? "Yes" : "No"));
                } else {
                    System.out.println("Student not found!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

