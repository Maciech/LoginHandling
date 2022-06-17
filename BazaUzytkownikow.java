package com.company;
import java.io.*;
import java.util.Scanner;


public class BazaUzytkownikow extends Main {

    String sciezkaBaza = "D:\\JAVAprojects\\LoginHandling\\UserDatabase.txt";

    public void Read(String nick, String password) throws FileNotFoundException {
        File file = new File(sciezkaBaza);
        Scanner scannerR = new Scanner(file);

        while (scannerR.hasNextLine()) {
            String lineR = scannerR.nextLine();
            int len = lineR.length();
            String loginParameters = nick+" "+password;

            if (lineR.contains(loginParameters) && len == loginParameters.length()) {
                System.out.println("Zalogowano");
                Odczyt odczyt = new Odczyt();
                odczyt.ShowText();
                Access access = new Access();
                access.Hello(nick);
                break;
            }
            if (!scannerR.hasNextLine()) {
                System.out.println("Wrong nick or password");
                break;
            }
        }
    }

    public void Write(String nick, String password) throws IOException {

        File file = new File(sciezkaBaza);
        Scanner scannerW = new Scanner(file);

        while (scannerW.hasNextLine()) {
            String lineW = scannerW.nextLine();
            int len = lineW.length();

            if (lineW.contains(nick) && nick.length() == len) {
                System.out.println("Account exists");
                break;
            }
            if (!scannerW.hasNextLine()) {
                FileWriter fileWriter = new FileWriter(sciezkaBaza, true);
                fileWriter.write(nick + " " + password + "\r\n");
                fileWriter.close();
                System.out.println("Account registered");
                break;
            }

        }
    }
}

