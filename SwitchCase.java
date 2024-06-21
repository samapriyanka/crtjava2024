//switch case:read 2 no's & print 1 for addition , 2 for subtraction, 3 for multiplication & 4 for division
import java.util.*;
class SwitchCase
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
int ch;
ch=s.nextInt();
switch(ch)
{
case 1:
   System.out.println(a+b);
break;
case 2:
   System.out.println(a-b);
break;
case 3:
   System.out.println(a*b);
break;
case 4:
   System.out.println(a/b);
break;
default:
   System.out.println("Invalid Choice");
}
}
}