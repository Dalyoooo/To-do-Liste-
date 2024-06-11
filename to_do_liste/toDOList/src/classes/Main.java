package classes;

import java.util.*;

public class Main {



    //liste welche dem daten typen String beinhaltet und Task heißt
    //private List<String> tasks;
    // Scanner der scanner heißt;
    //private Scanner scanner;

    // Konstruktor
    //den Variabeln werden arrayliste und einen scanner zugewiesen
    /*public Main() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);//inPutstream
    }
1
     */

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        run(scanner, tasks);
    }



    private static void run(Scanner scanner, ArrayList<String> tasks) {
        boolean running = true;
        while (running) {
            System.out.println("\n -------------TO DO LIST--------------");
            System.out.println("1.Add task");
            System.out.println("2.Delete task");
            System.out.println("3.View all tasks");
            System.out.println("4.Quit");
            System.out.println("\nEnter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTaks(scanner, tasks);
                    break;
                case 2:
                    deleteTask(scanner, tasks);
                    break;
                case 3:
                    displayTask(scanner, tasks);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

    private static void addTaks(Scanner scanner, ArrayList<String> tasks) {
        System.out.print("\n Enter Task: ");
        String task = scanner.nextLine();
        tasks.add(task);
    }

    private static void deleteTask(Scanner scanner, ArrayList<String> tasks) {
        System.out.print("\nEnter the task number to delete: ");
        int taskNum = scanner.nextInt();
        scanner.nextLine();
        if (taskNum > 0 && taskNum <= tasks.size()) {
            tasks.remove(taskNum);
            System.out.println("wurde gelöscht");
        } else {
            System.out.println("die zahl ist ungültig");
        }
    }


    private static void displayTask(Scanner scanner, ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("no task to display");
        }
        else {
            for(String task : tasks) {
                System.out.println(task);
            }
        }
    }
}