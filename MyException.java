import java.io.*; import java.util.*;
class MyException extends Exception
{
String str1; MyException(String str2)
{
str1=str2;
}
public String toString()
{
return("output String="+str1);
}
}
class Userdefined
{
public static void main(String[]args)
{
try
{
throw new MyException("custom");
}
catch(MyException exp)
{
System.out.println("this is catch block"); System.out.println("exp");
}
}
}
