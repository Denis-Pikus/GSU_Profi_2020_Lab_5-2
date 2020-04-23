package com.company;

import java.util.Scanner;

public class Menu {
    MyContainer container = new MyContainer();

    Scanner sc = new Scanner(System.in);

    public void run() {

//        while (true) {
//            printHelp();
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 0: return;
//                case 1:
//                    conteiner.add();
//                    break;
//                case 2:
//                    conteiner.update();
//                    break;
//                case 3:
//                    conteiner.delete();
//                    break;
//                case 4:
//                    conteiner.printAll();
//            }
      //  }
    }


    private void printHelp(){
        System.out.println("1 - add element");
        System.out.println("2 - update element");
        System.out.println("3 - delete element");
        System.out.println("4 - print all");
        System.out.println("5 - save to file");
        System.out.println("6 - load from file");
        System.out.println("0 - exit");
    }
}
