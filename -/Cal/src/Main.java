import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите пример с пробелами: ");
        String str = in.nextLine();
        in.close();
        Calculator calc = new Calculator();
        calc.calculate(str);
    }
}