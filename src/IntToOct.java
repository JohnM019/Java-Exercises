import java.util.Scanner;

public class IntToOct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to convert to octal: ");
        int num = scan.nextInt();
        System.out.println("The number " + num + " in octal is " + intToOct(num));
    }

    public static StringBuilder intToOct(int num){
        StringBuilder res = new StringBuilder();
        if (num == 0) return new StringBuilder("0");
        while (num > 0) {
            res.insert(0, num % 8);
            num /= 8;
        }
        return res;
    }
}
