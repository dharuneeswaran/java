import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\nName : " + name);
        System.out.println("Age : " + age);
        System.out.println("Department : " + department);
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}