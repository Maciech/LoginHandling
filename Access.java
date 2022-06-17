package com.company;

import java.util.Scanner;

public class Access extends Main {
    public void Hello(String nick){
        System.out.println("Hello "+nick);
        System.out.println("What would you like to do?");
        String decision;

            do {
                Scanner scanner = new Scanner(System.in);
                decision = scanner.nextLine();
                if (decision.equals("close")  || decision.equals("logout") ){
                    break;
                }
                System.out.println(decision);


            }while (!decision.contains("close") || !decision.contains("logout"));
        }
    }

