package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class operation
{
    abstract void check1();
    abstract void  check2();
    abstract  void display1();
    abstract  void display2();

}
class basic extends operation
{
    Logger logger=Logger.getLogger("com-api-jar");
    double num1;
    double num2;
    char symbol;
    char sign;
    double number;
    double result;

    public void check1() {
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            result = num1 / num2;
        }
    }
    public void display1()
    {
        logger.log(Level.INFO,()->"Result is "+this.result);
    }
    public void check2()
    {
        if(sign=='+')
        {
            result=result+number;
        }
        else if(sign=='-')
        {
            result=result-number;

        }
        else if(sign=='*')
        {
            result=result*number;
        }
        else if(sign=='/')
        {
            result=result/number;
        }
    }
    public  void display2()
    {
        logger.log(Level.INFO,()->"Result is "+this.result);
    }
}

public class calculator1
{
    public static void main(String[] args) {
        Logger logger=Logger.getLogger("com-api-jar");
        Scanner sc = new Scanner(System.in);
        basic b = new basic();
        int choice;
        String get;
        logger.info("Enter num1 ");
        b.num1 = sc.nextDouble();
        logger.info("Enter num2 ");
        b.num2 = sc.nextDouble();
        logger.info("Enter symbol like +-*/");
        b.symbol = sc.next().charAt(0);
        b.check1();
        logger.info("Are you sure want display output?type (yes):(no)");
        get=sc.next();
        if(get.equals("yes"))
        {
            b.display1();
        }
        while(true)
        {
            logger.info("\n1)Enter sign and number \n2)display \n3)Exit");
            logger.info("choose any one of the option in the above ");
            choice=sc.nextInt();
            if(choice==1)
            {
                logger.info("Enter symbol like +-*/ ");
                b.sign = sc.next().charAt(0);
                logger.info("Enter number ");
                b.number=sc.nextDouble();
                b.check2();
            }
            else if(choice==2)
            {
                b.display2();
            }
            else if(choice==3)
            {
                logger.info("Thank you ");
                break;
            }
        }
    }
}