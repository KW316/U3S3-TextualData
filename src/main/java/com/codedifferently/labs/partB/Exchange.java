package com.codedifferently.labs.partB;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
String start;
String end;
double startMoney = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Your Starting Currency:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        start = scanner.next();
        System.out.println("Please enter the amount in (Euro)s");
        startMoney = scanner.nextDouble();
        System.out.println("Please Select Currency to transfer to:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        end = scanner.next();
double extra = startMoney;
           boolean done = false;
           while(!done){
               if(start.equalsIgnoreCase(end)){
                   done = true;
               }else if(start.equals("1")){
                    startMoney = startMoney/1;
                   if(end.equals("1")){
                        startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;

               }else if(start.equals("3")){
                   startMoney = startMoney/.82;
                   if(end.equals("1")){
                       startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;
               }else if(start.equals("4")){
                   startMoney = startMoney/68.32;
                   if(end.equals("1")){
                       startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;
               }else if(start.equals("5")){
                   startMoney = startMoney/115.84;
                   if(end.equals("1")){
                       startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;
               }else if(start.equals("6")){
                   startMoney = startMoney/6.92;
                   if(end.equals("1")){
                       startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;
               }else{
                   startMoney = startMoney/.94;
                   if(end.equals("1")){
                       startMoney = startMoney * 1;
                   }else if(end.equals("3")){
                       startMoney = startMoney * .82;
                   }else if(end.equals("4")){
                       startMoney = startMoney * 68.32;
                   }else if(end.equals("5")){
                       startMoney = startMoney * 115.84;
                   }else if(end.equals("6")){
                       startMoney = startMoney * 6.92;
                   }else{
                       startMoney = startMoney * .94;

                   }
                   done = true;
               }
           }
        System.out.println("Your " + extra + " Euros exchanges to " + startMoney);
    }
}
