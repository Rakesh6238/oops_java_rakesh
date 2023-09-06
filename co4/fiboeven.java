class Fibonacci implements Runnable
{
public void run()
{
int n=50,n1=0, n2=1,n3;
for (int i= 1; i <= n; i++)
{
    n3 = n1 + n2;
    n1 = n2;
    n2 = n3;
System.out.println(n3);
}
}
}
class Even implements Runnable
{
public void run()
{
for(int i=0;i<30;i++)
if(i%2==0)
{
System.out.println(i);	
}	     
}
}
public class fiboeven
{
public static void main(String args[])
{
              Fibonacci f = new Fibonacci();
              Even e = new Even();
                Thread t1 = new Thread(f);
		Thread t2 = new Thread(e);
		t1.start();
		t2.start();

}
}