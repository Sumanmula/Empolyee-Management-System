package EmployeeManagementSystem;
import java.io.File;
import java.util.Scanner;

public class Employee_Show {
    public void viewFile(String id) throws Exception {
        File file = new File("file" + id + ".txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
