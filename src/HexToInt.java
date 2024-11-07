import java.util.Scanner;

public class HexToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hex you want to convert to int: ");
        int Hex = scan.nextInt();
        System.out.println("The hex " + Hex + " converted to int is " + hexToInt(Hex));
    }
    public static int hexToInt(int hex) {
        int pow = 0;
        int res = 0;
        while (hex > 0) {
            res += (hex % 10) * (int) Math.pow(16, pow);
            hex /= 10;
            pow++;
        }
        return res;
    }
}
