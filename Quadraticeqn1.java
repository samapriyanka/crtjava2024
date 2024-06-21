import java.util.*;
class Quadraticeqn1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
float a,b,c;
a=s.nextFloat();
b=s.nextFloat();
c=s.nextFloat();
float d=b*b-4*a*c;
if(d<0)
{
System.out.println("Roots are not possible");
}
else
{
double r1=(-b+Math.sqrt(d))/2*a;
double r2=(-b-Math.sqrt(d))/2*a;
System.out.println(r1);
System.out.println(r2);
}
}
}
