
import java.util.Scanner;

public class Test1 {

    static void printPer(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                        str.substring(i + 1);

            printPer(ros, ans + ch);
        }
    }
    public static void main(String[] args)
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        s = sc.nextLine();
        printPer(s, "");
    }
}
