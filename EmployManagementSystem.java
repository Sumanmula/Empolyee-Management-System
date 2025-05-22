package EmployeeManagementSystem;
import java.util.Scanner;

public class EmployManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        Employee_Show epv = new Employee_Show();

        int choice = 0;
        mainMenu.menu();

        while (choice != 5) {
            System.out.print("\nPlease Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    Employee_Add ep = new Employee_Add();
                    ep.createFile();
                    mainMenu.menu();
                }
                case 2 -> {
                    System.out.print("\nPlease Enter Employee's ID : ");
                    String id = sc.nextLine();
                    try {
                        epv.viewFile(id);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    mainMenu.menu();
                }
                case 3 -> {
                    System.out.print("\nPlease Enter Employee's ID : ");
                    String id = sc.nextLine();
                    Employee_Remove epr = new Employee_Remove();
                    epr.removeFile(id);
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    mainMenu.menu();
                }
                case 4 -> {
                    System.out.print("\nPlease Enter Employee's ID : ");
                    String id = sc.nextLine();
                    try {
                        epv.viewFile(id);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("\nEnter detail to update (current value): ");
                    String oldDetail = sc.nextLine();
                    System.out.println("Enter new value: ");
                    String newDetail = sc.nextLine();
                    Employee_Update updater = new Employee_Update();
                    try {
                        updater.updateFile(id, oldDetail, newDetail);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    mainMenu.menu();
                }
                case 5 -> {
                    CodeExit exit = new CodeExit();
                    exit.out();
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
