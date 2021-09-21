import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Double a, b, res;
        char type_of_operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("\n Enter an type of operator: ");
        type_of_operation = sc.next().charAt(0);
        sc.close();
        switch (type_of_operation) {
            case '+': res = a + b;
            System.out.println(a + " + " + b + " = " + res);
                break;
            case '-': res = a - b;
            System.out.println(a + " - " + b + " = " + res);
                break;
            case '*': res = a * b;
            System.out.println(a + " * " + b + " = " + res);
                break;
            case '/': res = a / b;
            System.out.println(a + " / " + b + " = " + res);
                break;

        
            default: System.out.printf("Error! Invalid Operation");
                break;
        }
        

        
    }
}