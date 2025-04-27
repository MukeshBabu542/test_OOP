
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter the word");
      String word= sc.nextLine();
      String word2= "";

      for(int i=word.length()-1; i>=0;i--)  
      {
        word2 = word2+word.charAt(i);


      }
      System.out.println("After reversing, your word is:"+word2);
      sc.close();

    }
}