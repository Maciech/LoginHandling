package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt extends Main {
    String sciezkaTekst = "D:\\JAVAprojects\\LoginHandling\\Conception.txt";
    String tekst;

    public void ShowText() throws FileNotFoundException {
        File file = new File(sciezkaTekst);

        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            tekst = in.nextLine();
            System.out.println(tekst);

        }
    }
}
