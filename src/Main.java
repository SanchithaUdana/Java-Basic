public class Main {
    public static void main(String[] args) {    // main method

        // --> Data Types
            // int
                // --> byte , short , int , long
            // String
            // float
                // --> float , double
            // char
            // boolean

        // we can declare

        float i = 12.5f;
        int j = 100;


        // --> type casting

        // widening casting - automatic casting
        // small data type to small data type
        int n1 = 10;
        long b1 = n1;
        System.out.println(b1);

        // narrowing casting - manual casting
        // large data type to small data type
        long num1 = 10000;
        int number = (int) num1;
        System.out.println(number);


        // --> operators
            //   + - * /
            //   % - modules
            //

        // --> increment
        int age = 10;
        System.out.println(age++);  // add 1 after print statement
        System.out.println(age);
        System.out.println(++age);  // add 1 before print statement

        // --> decrement
        int age1 = 10;
        System.out.println(age1--);
        System.out.println(age1);
        System.out.println(--age1);


        // assignment operators
        int g = 10;
        g += 10;    // g += 10   ==   g=g+10
        System.out.println(g);


        // --> one dimensional array

        int name [] = {12,32,45,56};
        // for each loop to read array values
        for (int a:name) {
            System.out.print(" "+a);
        }


        // --> logical operators
        // AND - &&
        // OR  - ||
        // NOT - !

        // --> Bitwise operators

        // AND - &
        // OR  - |
        // NOT - ~
        // XOR - ^
        // left shift - <<
        // right shift - >>

        System.out.println(" ");

        // --> Java String

        String school = "vilayaya national school";
        System.out.println(school.length());
        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(school.indexOf("national"));
        System.out.println("sanchitha \"udana\" wijesundara");  // special characters printing , used /


        // --> if statement

        int time = 3;
        if (time==3)
            System.out.println("yes 3 o clock");

        if (time == 3) {
            System.out.println("yes 3 o clock");
        }


        // --> switch case

        int day = 2;

        switch (day){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("not");
        }


        // --> loops

            // while loop
        int lp = 5;
        while (lp==5){
            System.out.println("sanchitha");
            lp++;
        }

            // do while
        int lo = 5;
        do {
            System.out.println("yes");
            lo++;
        }while (lo < 5) ;


            // for loop

        for (int ze = 0;ze<5;ze++){
            System.out.println("loop "+ze);
        }


        for (int ab = 1;ab<=10;ab++){
            for (int ba = 1;ba<=10;ba++){
                System.out.print(" "+ab*ba);
            }
            System.out.println(" ");
        }



















    }


}