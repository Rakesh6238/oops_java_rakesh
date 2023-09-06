import java.util.Scanner;
public class string
{
public static void main(String[] args) 
{
String s1="Hi";
String s2="Hello";
String s3=new String("SNGCE");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

System.out.println(s1.length()); 
System.out.println(s1+" "+s2);	  
System.out.println(s1.concat(s2)); 
System.out.println(s1.compareTo(s2)); 

String s4="hello";  
String s5="hello";  
String s6="meklo";  
String s7="hemlo";  
String s8="flag";  
System.out.println(s4.compareTo(s5));
System.out.println(s4.compareTo(s6)); 
System.out.println(s4.compareTo(s7));
System.out.println(s4.compareTo(s8));

String s9="java";
String s10 ="java";
String s11="JAVA";
String s12="python";
System.out.println(s9.equals(s10)); 
System.out.println(s9.equals(s11));
System.out.println(s9.equals(s12)); 

String s13="javatpoint";
System.out.println(s13.substring(2,4)); 
System.out.println(s13.substring(2));
System.out.println(s13.replace('a','o'));
System.out.println(s13.toUpperCase());
System.out.println(s13.charAt(2)); 

}
}