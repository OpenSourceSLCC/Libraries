/*******************************
* Author: Daniel Longman 
* Demo the use of characters
*****************************/

public class DemoChar {
   public static void main(String[] args) {
      String title = "Demo Char:";
      System.out.printf("%S%n", title); // %S prints uppercase text
      
      char initial = 'D';
      System.out.printf("Initial: %c %d U+%04X %n",
         initial, (int)initial, (int)initial);
      
      char colon = '\u003A';
      System.out.println("colon: " + (int)colon);
   }
}