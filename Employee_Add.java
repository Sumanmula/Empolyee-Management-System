package EmployeeManagementSystem;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee_Add {
    public void createFile() {
        Scanner sc = new Scanner(System.in);
        EmployDetail emp = new EmployDetail();
        emp.getInfo();

        try {
            File file = new File("file" + emp.employ_id + ".txt");
            if (file.createNewFile()) {
                FileWriter myWriter = new FileWriter(file);
                myWriter.write("Employee ID       : " + emp.employ_id + "\n" +
                               "Employee Name     : " + emp.name + "\n" +
                               "Father's Name     : " + emp.father_name + "\n" +
                               "Employee Contact  : " + emp.employ_contact + "\n" +
                               "Email Information : " + emp.email + "\n" +
                               "Employee position : " + emp.position + "\n" +
                               "Employee Salary   : " + emp.employ_salary);
                myWriter.close();
                System.out.println("\nEmployee has been Added :)\n");
            } else {
                System.out.println("\nEmployee already exists :(");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print("\nPress Enter to Continue...");
        sc.nextLine();
    }
}
