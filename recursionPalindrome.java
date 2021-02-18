import java.util.*;
public class recursionPalindrome
{
static int Palindrome(int n,int reverse)
{
if (n==0)
{
return reverse;
}
else
{
reverse=reverse*10+n%10;
return Palindrome(n/10,reverse);
}
}
public static void main(String g[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int reverse=Palindrome(n,0);
if (reverse==n)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not palindrome");
}
}
}