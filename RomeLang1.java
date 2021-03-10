public class RomeLang1 {
    String a;
    String b;
    String c;
    int result = 0;
    void romereshenie() {
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
        StringBuilder fi = new StringBuilder();
        while (result != 0) {
            if (result >= 100) {
                fi = new StringBuilder("C");
                ostatok = result % 100;
                result = result - 100;
            } else if (result >= 90) {
                fi.append("XC");
                ostatok = result % 90;
                result = result - 90;

            } else if (result >= 50) {
                fi.append("L");
                ostatok = result % 50;
                result = result - 50;
            } else if (result >= 40) {
                fi.append("XL");
                ostatok = result % 50;
                result = result - 50;

            } else if (result >= 10) {
                fi.append("X");
                result = result - 10;
                ostatok = result % 10;
            } else if (result >= 9) {
                fi.append("IX");
                result = result - 9;
                ostatok = result % 9;
            } else if (result >= 5) {
                fi.append("V");
                result = result - 5;
            } else if (result >= 4) {
                fi.append("IV");
                ostatok = result % 4;
                result = result - 4;
            } else if (result >= 1) {
                fi.append("I");
                ostatok = result % 1;
                result--;
            }
        }
        System.out.println(fi);
    }
}

