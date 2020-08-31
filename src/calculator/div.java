
package calculator;

public class div extends Add{
   
     @Override
     public void fun (int a , int b)throws ArithmeticException {
       {  if (b == 0)
         throw new ArithmeticException ("can not devise per 0");
     } 
    int s =a /b;
       System.out.println(s);
    }   
    
}
