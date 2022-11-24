import java.util.Scanner;

public class Calculator {
//    public static void main(String[] args){
////        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        add(a, b);
//        subtract(a, b);
//        multiply(a, b);
//        sharing(a, b);
//    }
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public double sharing(int a, int b) {
        if (b == 0) {
            return -100;
        } else {
            return a / b;
        }
    }


}

