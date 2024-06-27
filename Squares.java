import java.util.*;
class Squares
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int r[]=new int[n];
for(i=0;i<n;i++)
{
r[i]=Math.abs((int)Math.pow(a[i],2));
}
Arrays.sort(r);
for(i=0;i<n;i++)
{
System.out.print(r[i]+" ");
}
}
}