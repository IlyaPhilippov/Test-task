import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String result = calc(input);
        System.out.println(result);
    }
    public static String calc(String input) {
        int result = 0;
        try {
        String[] parts = input.split(" ");
        if (parts.length > 3) throw new IllegalArgumentException();
        int a = Integer.parseInt(parts[0]);
        int b =Integer.parseInt(parts[2]);

            if (a > 10 || b > 10 ) throw new NumberFormatException();

            if (parts[1].matches("[+*/-]")) {
                    switch (parts[1]) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    }
                } else throw new IllegalArgumentException();

        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }catch (IndexOutOfBoundsException e){
           throw new IndexOutOfBoundsException();
        }
        return Integer.toString(result);
    }
}