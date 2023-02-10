package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Arithmetic {
    Logger logger=Logger.getLogger("com-api-jar");
    double number1;
    double number2;
    double result;
    public static final String CON="Result is : ";
    public abstract void result();
}
class Addition extends Arithmetic
{
    Addition(double a,double b) {number1=a;number2=b;}
    @Override
    public void result() {
        result=number1+number2;
        logger.log(Level.INFO,()->CON+result);
    }
}
class Subtraction extends Arithmetic
{
    Subtraction(double a,double b) {number1=a;number2=b;}
    @Override
    public void result() {
        result=number1-number2;
        logger.log(Level.INFO,()->CON+result);
    }
}
class Multiplication extends Arithmetic
{
    Multiplication(double a,double b) {number1=a;number2=b;}
    @Override
    public void result() {
        result=number1*number2;
        logger.log(Level.INFO,()->CON+result);
    }
}
class Division extends Arithmetic {
    Division(double a, double b) {
        number1 = a;
        number2 = b;
    }

    @Override
    public void result() {
        result = number1 / number2;
        logger.log(Level.INFO, () -> CON + result);
    }
}

public class Calculator{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com-api-jar");
        Scanner sc = new Scanner(System.in);
        int choice;
        double number1;
        double number2;
        final String inp1 = "Enter number1";
        final String inp2 = "Enter number2";

        while (true) {
            logger.info("\n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division \n5)Exit");
            logger.info("Choose any one of the option in the above ");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info(inp1);
                number1 = sc.nextDouble();
                logger.info(inp2);
                number2 = sc.nextDouble();
                Arithmetic add = new Addition(number1, number2);
                add.result();
            } else if (choice == 2) {
                logger.info(inp1);
                number1 = sc.nextDouble();
                logger.info(inp2);
                number2 = sc.nextDouble();
                Arithmetic sub = new Subtraction(number1, number2);
                sub.result();
            } else if (choice == 3) {
                logger.info(inp1);
                number1 = sc.nextDouble();
                logger.info(inp2);
                number2 = sc.nextDouble();
                Arithmetic multiply = new Multiplication(number1, number2);
                multiply.result();
            } else if (choice == 4) {
                logger.info(inp1);
                number1 = sc.nextDouble();
                logger.info(inp2);
                number2 = sc.nextDouble();
                Arithmetic div = new Division(number1, number2);
                div.result();
            } else if (choice == 5) {
                logger.info("Thank you");
                break;
            }
        }
    }
}

