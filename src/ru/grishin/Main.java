package ru.grishin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        java.io.File f = new java.io.File("INPUT.TXT");
        if (!f.exists()) {
            System.out.println("Входящий файл не найден.");
        } else {
            Scanner in = new Scanner(new File("INPUT.TXT"));
            while (in.hasNextLine()) {
                list.add(in.nextInt());
            }
            int one = list.get(0) - 1;
            list.remove(0);
            int b = 0;
            int c = 1;
            for (int p = 0; p <= one; p++) {
                if (list.get(p) > 0) {
                    b += list.get(p);
                }
            }
            int min = list.get(0);
            for (int j = 0; j <= one; j++) {
                if (min >= list.get(j)) {
                    min = list.get(j);
                }
            }
            int max = min;
            for (int i = 0; i <= one; i++) {
                if (max < list.get(i))
                    max = list.get(i);
            }
            for (int l = 0; l <= one; l++) {
                if (min != list.get(l) & max != list.get(l)) {
                    c *= list.get(l);
                }
            }
            System.out.print(b + " " + c);

            File fil = new File("OUTPUT.TXT");
            FileWriter wrt = new FileWriter(fil);
            wrt.write(b + " " + c);
            wrt.flush();
        }
    }
}