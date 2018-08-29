import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String ss=sb.toString();
        if(s.equals(ss))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
