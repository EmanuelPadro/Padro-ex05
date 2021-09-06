package Package1;



/*
prompt user for 2 numbers
I will create a class that performs all operations
for 2 numbers given
main will call functions to gather input which
calls class and then main will cal output function
output function with all desired calculations



output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
*/

import java.util.Scanner;

class Calculations {
    int sum;
    int minus;
    int mult;
    int div;
    int Num1;
    int Num2;

    Calculations(int Number1, int Number2){
        sum = Number1 + Number2;
        minus = Number1 - Number2;
        mult = Number1 * Number2;
        div = Number1 / Number2;
        Num1 = Number1;
        Num2 = Number2;
    }
}

public class Solution05 {

    public static Calculations GetNum(){
        Scanner Input = new Scanner(System.in);
        System.out.println("What is your first number? ");
        int Num1 = Input.nextInt();
        System.out.println("What is your second number? ");
        int Num2 = Input.nextInt();

        return new Calculations(Num1, Num2);
    }

    public static void Output(Calculations Results){
        System.out.println(Results.Num1 + " " + Results.Num2 + " = " + Results.sum);
    }
    public static void main(String[] args) {
        Calculations Results = GetNum();
        Output(Results);
    }
}
