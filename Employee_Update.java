package EmployeeManagementSystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Update {
    public void updateFile(String id, String oldDetail, String newDetail) throws IOException {
        File file = new File("file" + id + ".txt");
        Scanner sc = new Scanner(file);
        StringBuilder fileContext = new StringBuilder();

        while (sc.hasNextLine()) {
            fileContext.append("\n").append(sc.nextLine());
        }

        FileWriter writer = new FileWriter(file);
        writer.write(fileContext.toString().replace(oldDetail, newDetail));
        writer.close();
    }
}
