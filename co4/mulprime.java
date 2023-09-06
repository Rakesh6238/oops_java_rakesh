class Multiplication extends Thread
{
public void run()
{
int n=5;
for(int m=1;m<11;m++)
System.out.println(n*m);
}
}
class Prime extends Thread
{
public void run()
{
       int i =0;
       int num =0;
       String  primeNumbers = "";
       for (i = 1; i <= 100; i++)        
       {    
          int counter=0;  
          for(num =i; num>=1; num--)
 {
             if(i%num==0)
    {
  counter = counter + 1;
    }
 }
 if (counter ==2)
 {
    primeNumbers = primeNumbers + i + " ";
 }
       }
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}
public class mulprime
{
public static void main(String args[])
{
                Thread t1 = new Multiplication();
Thread t2 = new Prime();
t1.start();
t2.start();

}
}
