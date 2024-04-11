public class Calculator {
    public void calculate(String str) {
        String[] parts = str.split(" ");
        int x, y;

        try {
            x = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e){
            System.out.println(parts[0] + " не число");
            return;
        }

        try {
            y = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e){
            System.out.println(parts[2] + " не число");
            return;
        }

        String oper = parts[1];

        switch (oper) {
            case "+":
                sum(x, y);
                break;
            case "-":
                vch(x, y);
                break;
            case "*":
                umn(x, y);
                break;
            case "/":
                del(x, y);
                break;
            default:
                System.out.println("Неверный оператор");
        }
    }

    private void sum(int x, int y) {
        System.out.println(x + y);
    }

    private void vch(int x, int y) {
        System.out.println(x - y);
    }

    private void umn(int x, int y) {
        System.out.println(x * y);
    }

    private void del(int x, int y) {
        if (y != 0)
            System.out.println((double) x / y);
        else
            System.out.println("Нельзя делить на ноль");
    }
}