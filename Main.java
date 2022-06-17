package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

    /* Odczyt odczyt = new Odczyt();
       odczyt.sciezkaTekst = "C:\\Users\\macko\\OneDrive\\Pulpit\\96a6\\ProjektOdKrzycha\\dokument.txt";
       BazaUzytkownikow baza = new BazaUzytkownikow();
       baza.sciezkaBaza = "C:\\Users\\macko\\OneDrive\\Pulpit\\96a6\\ProjektOdKrzycha\\BazaUzytkownikow.txt";
*/
        System.out.println("Log in / Register ?");
        Scanner scanner0 = new Scanner(System.in);
        String mode = scanner0.nextLine();

        System.out.println("Insert your nickname: ");
        Scanner scanner1 = new Scanner(System.in);
        String nick = scanner1.nextLine();

        System.out.println("Insert your password: ");

        Scanner scanner2 = new Scanner(System.in);
        String pass = scanner2.nextLine();

        if (mode.contains("Log in")) {
            BazaUzytkownikow bazaUzytkownikow = new BazaUzytkownikow();
            bazaUzytkownikow.Read(nick, pass);

        }
        else if (mode.contains("Register")) {
                BazaUzytkownikow bazaUzytkownikow = new BazaUzytkownikow();
                bazaUzytkownikow.Write(nick, pass);
                }
            }}




