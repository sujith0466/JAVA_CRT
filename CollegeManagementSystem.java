import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String department;
    int age;
    String email;

    public void getDetails(Scanner sc) {
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
    }

    public void printDetails() {
        System.out.printf("%-5d %-15s %-15s %-5d %-20s\n", id, name, department, age, email);
    }
}

class Teacher {
    int id;
    String name;
    String department;
    int age;
    String email;

    public void getDetails(Scanner sc) {
        System.out.print("Enter Teacher ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
    }

    public void printDetails() {
        System.out.printf("%-5d %-15s %-15s %-5d %-20s\n", id, name, department, age, email);
    }
}

public class CollegeManagementSystem {
    public static Student findStudentById(ArrayList<Student> students, int id) {
        for (Student s : students) if (s.id == id) return s;
        return null;
    }

    public static Teacher findTeacherById(ArrayList<Teacher> teachers, int id) {
        for (Teacher t : teachers) if (t.id == id) return t;
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        while (true) {
            System.out.println("\n--- College Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. View All Students");
            System.out.println("4. View All Teachers");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Search Teacher by ID");
            System.out.println("7. Update Student by ID");
            System.out.println("8. Update Teacher by ID");
            System.out.println("9. Delete Student by ID");
            System.out.println("10. Delete Teacher by ID");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.getDetails(sc);
                    if (findStudentById(students, student.id) == null) {
                        students.add(student);
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student ID already exists!");
                    }
                    break;

                case 2:
                    Teacher teacher = new Teacher();
                    teacher.getDetails(sc);
                    if (findTeacherById(teachers, teacher.id) == null) {
                        teachers.add(teacher);
                        System.out.println("Teacher added successfully!");
                    } else {
                        System.out.println("Teacher ID already exists!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- All Students ---");
                    System.out.printf("%-5s %-15s %-15s %-5s %-20s\n", "ID", "Name", "Department", "Age", "Email");
                    for (Student s : students) s.printDetails();
                    break;

                case 4:
                    System.out.println("\n--- All Teachers ---");
                    System.out.printf("%-5s %-15s %-15s %-5s %-20s\n", "ID", "Name", "Department", "Age", "Email");
                    for (Teacher t : teachers) t.printDetails();
                    break;

                case 5:
                    System.out.print("Enter Student ID to search: ");
                    int sid = sc.nextInt();
                    Student s = findStudentById(students, sid);
                    if (s != null) s.printDetails();
                    else System.out.println("Student not found!");
                    break;

                case 6:
                    System.out.print("Enter Teacher ID to search: ");
                    int tid = sc.nextInt();
                    Teacher t = findTeacherById(teachers, tid);
                    if (t != null) t.printDetails();
                    else System.out.println("Teacher not found!");
                    break;

                case 7:
                    System.out.print("Enter Student ID to update: ");
                    int usid = sc.nextInt();
                    Student us = findStudentById(students, usid);
                    if (us != null) {
                        System.out.println("Enter new details:");
                        us.getDetails(sc);
                        System.out.println("Student updated successfully!");
                    } else System.out.println("Student not found!");
                    break;

                case 8:
                    System.out.print("Enter Teacher ID to update: ");
                    int utid = sc.nextInt();
                    Teacher ut = findTeacherById(teachers, utid);
                    if (ut != null) {
                        System.out.println("Enter new details:");
                        ut.getDetails(sc);
                        System.out.println("Teacher updated successfully!");
                    } else System.out.println("Teacher not found!");
                    break;

                case 9:
                    System.out.print("Enter Student ID to delete: ");
                    int dsid = sc.nextInt();
                    Student ds = findStudentById(students, dsid);
                    if (ds != null) {
                        students.remove(ds);
                        System.out.println("Student deleted successfully!");
                    } else System.out.println("Student not found!");
                    break;

                case 10:
                    System.out.print("Enter Teacher ID to delete: ");
                    int dtid = sc.nextInt();
                    Teacher dt = findTeacherById(teachers, dtid);
                    if (dt != null) {
                        teachers.remove(dt);
                        System.out.println("Teacher deleted successfully!");
                    } else System.out.println("Teacher not found!");
                    break;

                case 11:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
