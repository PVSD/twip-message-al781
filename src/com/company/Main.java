package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
    {
        public static Scanner intScan = new Scanner(System.in);
        public static Scanner strScan = new Scanner(System.in);
        public static ArrayList<Conversation> convoList = new ArrayList<Conversation>();

        public static void main(String[] args)
            {
                System.out.println("Welcome to ∞Text");
                Menu();
            }

        public static void Menu()
            {
                System.out.println("What would you like to do?");
                System.out.println("1) Make a new conversation.");
                System.out.println("2) Message an existing conversation.");
                System.out.println("3) Exit ∞Text.");
                switch (intScan.nextInt())
                    {
                        case 1:
                            NewConvo();
                            break;
                        case 2:
                            Convo();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter a valid command.");
                            Menu();
                            break;
                    }
            }

        public static void NewConvo()
            {
                convoList.add(new Conversation());
                Menu();
            }

        public static void Convo()
            {
                System.out.println("Enter the number of the conversation you would like to access.");
                ConvoNav(convoList.get(intScan.nextInt()));
            }

        public static void ConvoNav(Conversation c)
            {
                System.out.println("What would you like to do?");
                System.out.println("1) Send a new message.");
                System.out.println("2) See the message history.");
                System.out.println("3) Delete a message.");
                System.out.println("4) Return to menu.");
                switch (intScan.nextInt())
                    {
                        case 1:
                            System.out.println("Who is sending the message?");
                            String sender = strScan.nextLine();
                            System.out.println("What is the message?");
                            String message = strScan.nextLine();
                            c.SendMessage(sender, message);
                            ConvoNav(c);
                            break;
                        case 2:
                            c.PrintMessageHistory();
                            ConvoNav(c);
                            break;
                        case 3:
                            System.out.println("Enter the index of the message (Most recent is the highest.");
                            c.DeleteMessage(intScan.nextInt());
                            ConvoNav(c);
                            break;
                        case 4:
                            Menu();
                            break;
                        default:
                            System.out.println("Enter a valid command.");
                            ConvoNav(c);
                            break;
                    }
            }
    }
