  System.out.println(message);
    System.out.println("The number is: " + number);
    System.out.println("Value of pi: " + pi);
    System.out.println("Is Java fun? " + isJavaFun);

    if (number % 2 == 0) {
        System.out.println("The number is even.");
    } else {
        System.out.println("The number is odd.");
    }

    System.out.println("Counting to 5:");
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }

    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Array elements:");
    for (int num : numbers) {
        System.out.println(num);
    }

    int factorial = calculateFactorial(5);
    System.out.println("Factorial of 5: " + factorial);

    Person person = new Person("John", 30);
    person.sayHello();

    try {
        System.out.println("Division: " + divide(10, 0));
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }

    FileHandler.writeToFile("output.txt", "This is a sample text file.");

    Thread thread = new Thread(() -> System.out.println("Hello from another thread!"));
    thread.start();

    System.out.println("Max of 10 and 20: " + getMax(10, 20));
}

public static int calculateFactorial(int n) {
    if (n <= 1) return 1;
    return n * calculateFactorial(n - 1);
}

public static int divide(int a, int b) {
    return a / b;
}

public static <T extends Comparable<T>> T getMax(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
}
}

class Person { private String name; private int age;

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

public void sayHello() {
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
}
}

class FileHandler { public static void writeToFile(String filename, String content) { try (java.io.FileWriter writer = new java.io.FileWriter(filename)) { writer.write(content); System.out.println("File written successfully: " + filename); } catch (java.io.IOException e) { System.out.println("Error writing to file: " + e.getMessage()); } } }

enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; }

class EnumDemo { public static void displayDay(Day day) { switch (day) { case MONDAY: System.out.println("Start of the work week."); break; case FRIDAY: System.out.println("End of the work week."); break; case SATURDAY: case SUNDAY: System.out.println("Weekend!"); break; default: System.out.println("Midweek day."); } } }

interface Animal { void sound(); }

class Dog implements Animal { public void sound() { System.out.println("Woof! Woof!"); } }

class Cat implements Animal { public void sound() { System.out.println("Meow!"); } } interface Animal { void sound(); }

class Dog implements Animal { public void sound() { System.out.println("Woof! Woof!"); } }

class Cat implements Animal { public void sound() { System.out.println("Meow!"); } }

class Calculator { public int add(int a, int b) { return a + b; }

public int subtract(int a, int b) {
    return a - b;
}

public int square(int a) {
    return a * a;
}
}

class FibonacciGenerator { public static void generateSeries(int terms) { int a = 0, b = 1; for (int i = 0; i < terms; i++) { System.out.println(a); int next = a + b; a = b; b = next; } } } public int square(int a) { return a * a; } }

class FibonacciGenerator { public static void generateSeries(int terms) { int a = 0, b = 1; for (int i = 0; i < terms; i++) { System.out.println(a); int next = a + b; a = b; b = next; } } }

class AdvancedCalculator { public double power(double base, double exponent) { return Math.pow(base, exponent); }

public double sqrt(double number) {
    return Math.sqrt(number);
}
}

class MultiThreadedExample { public static void runExample() { Thread thread1 = new Thread(() -> { for (int i = 0; i < 5; i++) { System.out.println("Thread 1: " + i); } });

    Thread thread2 = new Thread(() -> {
        for (int i = 5; i < 10; i++) {
            System.out.println("Thread 2: " + i);
        }
    });

    thread1.start();
    thread2.start();

    try {
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        System.out.println("Threads interrupted: " + e.getMessage());
    }
}
}

class DataStructuresExample { public static void showExamples() { java.util.List list = new java.util.ArrayList<>(); list.add("Apple"); list.add("Banana"); list.add("Cherry");

    for (String fruit : list) {
        System.out.println(fruit);
    }

    java.util.Map<Integer, String> map = new java.util.HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");

    map.forEach((key, value) -> {
        System.out.println("Key: " + key + ", Value: " + value);
    });
}
}

class StreamAPIExample { public static void demonstrateStreams() { java.util.List numbers = java.util.Arrays.asList(1, 2, 3, 4, 5); numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println); } }

import java.io.; import java.util.;

public class Application {

public static void main(String[] args) {
    System.out.println("Welcome to the Java 300-Line Application!");
    AppManager appManager = new AppManager();
    appManager.startMenu();
}
}

class AppManager { private List users; private TaskManager taskManager;

public AppManager() {
    users = new ArrayList<>();
    taskManager = new TaskManager();
    seedData();
}

private void seedData() {
    users.add(new User("Alice", "alice@example.com"));
    users.add(new User("Bob", "bob@example.com"));
}

public void startMenu() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\nMain Menu:");
        System.out.println("1. View Users");
        System.out.println("2. Add User");
        System.out.println("3. Manage Tasks");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                displayUsers();
                break;
            case 2:
                addUser(scanner);
                break;
            case 3:
                taskManager.startTaskMenu(scanner);
                break;
            case 4:
                System.out.println("Exiting application. Goodbye!");
                return;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

private void displayUsers() {
    System.out.println("\nUsers:");
    for (int i = 0; i < users.size(); i++) {
        System.out.println((i + 1) + ". " + users.get(i));
    }
}

private void addUser(Scanner scanner) {
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    users.add(new User(name, email));
    System.out.println("User added successfully.");
}
}

class User { private String name; private String email;

public User(String name, String email) {
    this.name = name;
    this.email = email;
}

@Override
public String toString() {
    return name + " (" + email + ")";
}
}

class TaskManager { private List tasks;

public TaskManager() {
    tasks = new ArrayList<>();
    seedTasks();
}

private void seedTasks() {
    tasks.add(new Task("Write Java Code", "Create a 300-line Java program", "In Progress"));
    tasks.add(new Task("Debug Program", "Fix bugs in the existing code", "Pending"));
}

public void startTaskMenu(Scanner scanner) {
    while (true) {
        System.out.println("\nTask Menu:");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Return to Main Menu");
        System.out.print("Select an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                displayTasks();
                break;
            case 2:
                addTask(scanner);
                break;
            case 3:
                completeTask(scanner);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

private void displayTasks() {
    System.out.println("\nTasks:");
    for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
    }
}

private void addTask(Scanner scanner) {
    System.out.print("Enter title: ");
    String title = scanner.nextLine();
    System.out.print("Enter description: ");
    String description = scanner.nextLine();
    System.out.print("Enter status: ");
    String status = scanner.nextLine();
    tasks.add(new Task(title, description, status));
    System.out.println("Task added successfully.");
}

private void completeTask(Scanner scanner) {
    displayTasks();
    System.out.print("Enter task number to mark as completed: ");
    int taskNum = scanner.nextInt();
    scanner.nextLine();
    if (taskNum > 0 && taskNum <= tasks.size()) {
        tasks.get(taskNum - 1).setStatus("Completed");
        System.out.println("Task marked as completed.");
    } else {
        System.out.println("Invalid task number. Please try again.");
    }
}
}

class Task { private String title; private String description; private String status;

public Task(String title, String description, String status) {
    this.title = title;
    this.description = description;
    this.status = status;
}

public void setStatus(String status) {
    this.status = status;
}

@Override
public String toString() {
    return title + ": " + description + " (" + status + ")";
}
}

import java.util.Scanner;

class BankAccount { private String accountHolder; private double balance;

public BankAccount(String accountHolder) {
    this.accountHolder = accountHolder;
    this.balance = 0.0;
}

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Deposit amount must be positive.");
    }
}

public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    } else {
        System.out.println("Invalid withdrawal amount.");
    }
}

public void checkBalance() {
    System.out.println("Current balance: " + balance);
}

public String getAccountHolder() {
    return accountHolder;
}
}

public class BankingSystem { private static Scanner scanner = new Scanner(System.in); private static BankAccount account;

public static void main(String[] args) {
    System.out.println("Welcome to the Banking System");
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    account = new BankAccount(name);

    int choice;
    do {
        showMenu();
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdrawal();
                break;
            case 3:
                account.checkBalance();
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, try again.");
        }
    } while (choice != 4);
}

private static void showMenu() {
    System.out.println("\nMenu:");
    System.out.println("1. Deposit money");
    System.out.println("2. Withdraw money");
    System.out.println("3. Check balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
}

private static void handleDeposit() {
    System.out.print("Enter deposit amount: ");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}

private static void handleWithdrawal() {
    System.out.print("Enter withdrawal amount: ");
    double amount = scanner.nextDouble();
    account.withdraw(amount);
}
}
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class BankingSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount account;

    public static void main(String[] args) {
        System.out.println("Welcome to the Banking System");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        account = new BankAccount(name);

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleDeposit();
                    break;
                case 2:
                    handleWithdrawal();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private static void handleWithdrawal() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
