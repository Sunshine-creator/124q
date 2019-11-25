
package test1;
import java.util.*;
public class TEST1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first city :");
      String city1 = input.nextLine();
      System.out.print("Enter the second city :");
      String city2 = input.nextLine();
      if(city1.compareTo(city2)>0)  /*compareTo方法用来两个字符串进行比较，s1.compareT0(s2),if s1 = s2,返回值为0，s1>s2,返回值大于0，同理，小于返回值小于0*/
          System.out.println(" The cities in alphabetical order are " +  city2 + "  " + city1);
      else
          System.out.println(" The cities in alphabetical order are " +  city1 + "  " + city2);
    }  
}
