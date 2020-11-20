package pr20;

public class Exception1 {
   public void exceptionDemo(){
       try {
           System.out.println(2/0);
       }
       catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("2/0");
       }
    }
}
