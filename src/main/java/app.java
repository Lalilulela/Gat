import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите выражение ");
        String str = in.nextLine();
        in.close();
        String[] parts = str.split("");
        if (parts.length != 3) {
            System.out.print("введите выражение по примеру 1+3 ");
            return;
        }
        try {
            int firstNumber = Integer.parseInt(parts[0]);
            char operation = parts[1].charAt(0);
            int secondNumber = Integer.parseInt(parts[2]);

            int result = 0;
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        System.out.println("Не дели на ноль");
                        return;
                    }
                    break;
                default:
                    System.out.println("неверная операция");
            }
            System.out.println("результат " + result);
        } catch (NumberFormatException e) {
            System.out.println("неверный формат");
        }
    }

}