public class ArabLang1 {
    String h;
    String y;
    String l;

    void reshenie() {
        int q = Integer.parseInt(h);
        if (q >= 1 && q <= 10) {
            q = q;
        } else {
            System.exit(0);
        }
        int w = Integer.parseInt(l);
        if (w >= 1 && w <= 10) {
            w = w;
        } else {
            System.exit(0);
        }
        if (y.equals("+")) {
            int d;
            System.out.println(d = q + w);
        } else if (y.equals("-")) {
            int d;
            System.out.println(d = q - w);
        } else if (y.equals("*")) {
            int d;
            System.out.println(d = q * w);
        } else if (y.equals("/")) {
            int d;
            System.out.println(d = q / w);
        } else {
            System.out.println("Вы ввели некоректные значения");
        }
    }
}

