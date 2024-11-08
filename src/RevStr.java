import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String you wish to reverse: ");
        String str = scan.nextLine();
        System.out.println(revStr(str));
    }
    public static String revStr(String str) {
        if (str.length() == 1) return str;
        String[] s = str.split("");
        String temp;
        int i = 1;
        while (i <= s.length / 2) {
            temp = s[i - 1];
            s[i - 1] = s[s.length - i];
            s[s.length - i] = temp;
            i++;
        }
        return String.join("", s);
    }
}
