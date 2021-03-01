import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        int result = 0;
        int arab = 0;
        int rome = 0;
        String a;
        String b;
        String c;
        String[] data = s.split(" ");
        a = data[0];
        b = data[1];
        c = data[2];
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(c);
            arab++;
        } catch (NumberFormatException h) {
            rome++;
        }
        if (arab > rome) {
            int q = Integer.parseInt(a);
            if (q >= 1 && q <= 10) {
                q = q;
            } else {
                System.exit(0);
            }
            int w = Integer.parseInt(c);
            if (w >= 1 && w <= 10) {
                w = w;
            } else {
                System.exit(0);
            }
            if (b.equals("+")) {
                int d;
                System.out.println(d = q + w);
            } else if (b.equals("-")) {
                int d;
                System.out.println(d = q - w);
            } else if (b.equals("*")) {
                int d;
                System.out.println(d = q * w);
            } else if (b.equals("/")) {
                int d;
                System.out.println(d = q / w);
            } else {
                System.out.println("Вы ввели некоректные значения");
            }
        } else if (arab < rome) {
            int ar = 0;
            if (a.equals("I"))
                ar = 1;
            else if (a.equals("II"))
                ar = 2;
            else if (a.equals("III"))
                ar = 3;
            else if (a.equals("IV"))
                ar = 4;
            else if (a.equals("V"))
                ar = 5;
            else if (a.equals("VI"))
                ar = 6;
            else if (a.equals("VII"))
                ar = 7;
            else if (a.equals("VIII"))
                ar = 8;
            else if (a.equals("IX"))
                ar = 9;
            else if (a.equals("X"))
                ar = 10;
            if (ar == 0)
                return;
            int cr = 0;

            if (c.equals("I"))
                cr = 1;
            else if (c.equals("II"))
                cr = 2;
            else if (c.equals("III"))
                cr = 3;
            else if (c.equals("IV"))
                cr = 4;
            else if (c.equals("V"))
                cr = 5;
            else if (c.equals("VI"))
                cr = 6;
            else if (c.equals("VII"))
                cr = 7;
            else if (c.equals("VIII"))
                cr = 8;
            else if (c.equals("IX"))
                cr = 9;
            else if (c.equals("X"))
                cr = 10;
            if (cr == 0)
                return;

            if (b.equals("+")) {
                result = ar + cr;
            } else if (b.equals("-")) {
                result = ar - cr;
            } else if (b.equals("*")) {
                result = ar * cr;
            } else if (b.equals("/")) {
                result = ar / cr;
            } else {
                System.out.println("Вы ввели некоректные значения");
            }
            int ostatok = 0;
            String fi = "";
            while (result != 0) {
                if (result >= 100) {
                    fi = "C";
                    ostatok = result % 100;
                    result = result - 100;
                } else if (result >= 90) {
                    fi = fi + "XC";
                    ostatok = result % 90;
                    result = result - 90;

                } else if (result >= 50) {
                    fi = fi + "L";
                    ostatok = result % 50;
                    result = result - 50;
                } else if (result >= 40) {
                    fi = fi + "XL";
                    ostatok = result % 50;
                    result = result - 50;

                } else if (result >= 10) {
                    fi = fi + "X";
                    result = result - 10;
                    ostatok = result % 10;
                } else if (result >= 9) {
                    fi = fi + "IX";
                    result = result - 9;
                    ostatok = result % 9;
                } else if (result >= 5) {
                    fi = fi + "V";
                    ostatok = result % 5;
                    result = result - 5;
                } else if (result >= 4) {
                    fi = fi + "IV";
                    ostatok = result % 4;
                    result = result - 4;
                } else if (result >= 1) {
                    fi = fi + "I";
                    ostatok = result % 1;
                    result = result - 1;
                }
            }
            System.out.println(fi);
        }
    }
}




