# Pyramid
import java.io.*;
import java.util.*;
public class Pyramid
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of pyramid:");
int n=Integer.parseInt(br.readLine());
for(int i=n;i>0;i--)
{
for(int j=0;j<i;j++)
{
System.out.println("*");
}
System.out.println(" ");
for(int j=0;j<i;j++)
{
System.out.println("*");
}
System.out.println();
}
}
}






































}
}
