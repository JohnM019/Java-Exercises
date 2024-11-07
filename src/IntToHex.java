import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you wish to convert to Hex: ");
        int num = scan.nextInt();
        System.out.println("The number " + num + " in Hex is " + intToHex(num));
    }
    public static StringBuilder intToHex(int num){
        if (num == 0) return new StringBuilder("0");
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            res.insert(0, num % 16);
            num /= 16;
        }
        return res;
    }
}
