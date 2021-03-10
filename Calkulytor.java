import java.util.Scanner;

public class Calkulytor {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        RomeLang1 re = new RomeLang1();
        ArabLang1 r2 = new ArabLang1();
        String[] data = s.split(" ");
        r2.h = data[0];
        re.a = data[0];
        r2.y = data[1];
        re.b = data[1];
        r2.l = data[2];
        re.c = data[2];
        try {
            int x = Integer.parseInt(r2.h);
            int y = Integer.parseInt(r2.l);
            r2.reshenie();

        } catch (NumberFormatException h) {
            // тут уходим в римские

            re.romereshenie();
        }
        }
    }





