import javax.swing.*;
import java.util.*;
public class Java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, add, mul, div, sub;
        int ch;
        System.out.println("enter numbers");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        System.out.println("1.add 2.substract 3.multipy 4.division");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                add = num1 + num2;
                System.out.println(add);
                break;
            case 2:
                sub = num1 - num2;
                System.out.println(sub);
                break;
            case 3:
                mul = num1 * num2;
                System.out.println(mul);
                break;
            case 4:
                div = num1 / num2;
                System.out.println(div);
                break;
            default:
                System.out.println("invalid");
        }
    }
}