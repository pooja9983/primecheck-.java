import java .util.Scanner;
class PrimeCheck
{
public static void main(String args[])
{
int temp;
boolean prime=true;
Scanner scan =new Scanner (System.in);
Systrem .out.println(" enter any number :");
int num=scan.nextInt();
scan.close();
for(int i=2;i<num/2;i++)
{
temp=num%i;
if(temp==0)
{
prime=false;
break;
}
}
if (prime)
System.out.println(num + "is a prime number");
else 
System .out.println(num + "is not a prime number");
}
}