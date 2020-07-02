import java.util.Scanner;
public class Main {
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("Generate your Security Code");
String s1= sc.next();

if(s1.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#*]).{8,}"))
{
System.out.println("Security Code Generated Successfully");
}
else
System.out.println("Invalid Security Code, Try Again!");
}
}