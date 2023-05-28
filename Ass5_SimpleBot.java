package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) 
    {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }//main end

    static void greet() 
    {
        System.out.println("Hello! My name is " + "A" + ".");
        System.out.println("I was created in " + "2018" + ".");
        System.out.println("Please, remind me your name.");
    }//greet end

    static void remindName() 
    {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }//remind name end

    static void guessAge() 
    {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }//guess end

    static void count() 
    {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) 
        {
            System.out.printf("%d!\n", i);
        }//for end
    }//count end

    static void test() 
    {   System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                           "2. To decompose a program into several small subroutines.\n" +
                           "3. To determine the execution time of a program.\n" +
                           "4. To interrupt the execution of a program.");
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("");
            int num = Integer.parseInt(in.next());

            if (num == 2)
            {
                break;
            }
            else System.out.println("Please, try again.");
        }//while end
    }//test end

    static void end() 
    { 
        System.out.println("Congratulations, have a nice day!");
    }//end end :)
}//class end