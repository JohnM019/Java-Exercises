import java.util.Scanner;

public class IntToBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to convert to binary: ");
        int num = scan.nextInt();
        System.out.println("The number " + num + " in binary is " + intToBin(num));
    }
    public static StringBuilder intToBin(int num) {
        StringBuilder res = new StringBuilder();
        if (num == 0) return new StringBuilder("0");
        while (num > 0) {
            res.insert(0, num % 2);
            num /= 2;
        }
        return res;
    }
}
