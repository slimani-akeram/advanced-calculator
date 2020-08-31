
package calculator;

import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
    
    Scanner inn = new Scanner(System.in) ;
       System.out.println("enter the first number ");
       int firstnumber = inn.nextInt();
       System.out.println("enter the operator ");
       String operator = inn.next();
       System.out.println("enter the second number ");
       int secondnumber = inn.nextInt() ;
    
    pol object = new pol();
    Add a = new Add();
    div d = new div();
    sub s = new sub();
    mul m = new mul();
    switch (operator) { 
           case "+" :
              object.Doit(a, firstnumber,secondnumber );
            break;
           case "*" :
              object.Doit(m, firstnumber,secondnumber );
            break;    
           case "/" :
               object.Doit(d, firstnumber,secondnumber );
            break;
            case "-" :
              object.Doit(s, firstnumber, secondnumber);
            break;
       
       }
    
    
    
    
    
    
    
    }
    
}
