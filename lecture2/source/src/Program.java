import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;

        String first = scanner.nextLine();
        Double firstArgument = Double.parseDouble(first);

        String operator = scanner.nextLine();

        String second = scanner.nextLine();
        Double secondArgument = Double.parseDouble(second);

        switch(operator) {
            case "+":
                sum = firstArgument + secondArgument;
                break;
            case "-":
                sum = firstArgument - secondArgument;
                break;
            case "*":
                sum = firstArgument * secondArgument;
                break;
            case "/":
                while (secondArgument == 0) {
                    System.err.println("Division by zero. Please provide a new divisor.");
                    secondArgument = Double.parseDouble(scanner.nextLine());
                }

                sum = firstArgument / secondArgument;
                break;
            case "^":
                sum = Math.pow(firstArgument, secondArgument);
                break;
        }

        System.out.println(sum);
    }
}
