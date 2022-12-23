import java.util.Scanner;

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


        // --> jump statement
            // break
            // used to jump out the loop
            // we can use break in if , while loop , for loop

        bb bre = new bb();
        bre.breakTest();
        bre.continueTest();

        // --> java output and user inputs
            // output
        System.out.println("java input output method");
        System.err.println("error print method");  // special error print code
            // user inputs
        Scanner scan = new Scanner(System.in);

        String nameOfName;
        System.out.print("Enter Name : ");
        //nameOfName = scan.nextLine();
        //System.out.println(nameOfName);


        // Arrays
            // --> one dimensional array

        int name [] = {12,32,45,56};

        // for each loop to read array values
        for (int a:name) {
            System.out.print(" "+a);
        }

        System.out.println(" ");
        // print the length of the array
        System.out.println(name.length);

            // --> two dimensional array

        int [][] numArray = {{1,2,3},{4,5,6}};

        for (int f = 0 ; f < numArray.length ; f++){
            for (int x = 0 ; x < numArray[f].length ; x++ ){
                System.out.print(" "+numArray[f][x]);
            }
        }

        System.out.println(" ");

        // --> Exception Handling

            // we used exception handling to prevent logical errors
            // we can use to handle errors using try catch method

        try {
            System.out.println(name[5]); // name is an array in above code lines
        }catch (Exception e){
            System.out.println("Error "+ e);
            // and we can use System.err.println(); to specify the error message
            System.err.println("using sout err command");
            // we can use trow command to express specific error message
            throw new ArithmeticException("Error has been generated");  // throw command
         }finally {
            System.out.println("this is final block");
        }



        // in finally block, it's already print after try or catch block executing


        // --> outer class and inner class

            // in the calling inner class, first we create an object using outer class
            // then we can create an object to inner class through outer class
            // outerClass.innerClass innerObName = outerObject.new innerClass();

        // create an object in outer class
        outerClass outer = new outerClass();
        // create an object to inner class using outer class and outer object
        outerClass.innerClass inner = outer.new innerClass();


        System.out.println(outer.a);
        System.out.println(inner.b);


        // -- > static keyword in inner class

            // we can use static keyword to inner class
            // we can create an object to inner class without creating object for outer class

        staticInnerClass.inn StaticInner = new staticInnerClass.inn();

        System.out.println(StaticInner.ghj);


        // --> anonymous class using interface

        phone p1 = new phone() {
            @Override
            public void call() {
                System.out.println("using anonymous class in interface");
            }
        };  // we must put the semi colan in end of the anonymous class method

        p1.call();

        // we can use this method to access interface without creating a java class
        // we can create an object through interface
        // phone p1 = new phone() {};
        // we must use @Override annotation to override the interface abstract methods
        // we can use this in have 2 or 3 interface abstract methods





























    }


}