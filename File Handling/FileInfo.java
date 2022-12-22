import java.io.*;
import java. util.*;
public class FileInfo
{
public static void main(String[] args) throws IOException
{
Scanner in=new Scanner(System.in);
System.out.print("\nEnter the FileName: ");
String fName = in.next();
File f = new File(fName);
String result = f.exists() ? " exists." : " does not exist.";
System.out.println("\nThe given file " +fName + result);
System.out.println("\nFile Location: "+f.getAbsolutePath());
if(f.exists())
{
result = f.canRead() ? "readable." : "not readable.";
System.out.println("\nThe file is " + result);
result = f.canWrite() ? "writable." : "not writable.";
System.out.println("\nThe file is " + result);
System.out.println("\nFile length is " + f.length() + " in bytes.");
if (fName.endsWith(".jpg") || fName.endsWith(".gif") || fName.endsWith(".png"))
{
System.out.println("\nThe given file is an image file.");
}
else if (fName.endsWith(".pdf"))
{
System.out.println("\nThe given file is an portable document format.");
}
else if (fName.endsWith(".txt"))
{
System.out.println("\nThe given file is a text file.");
}
else
{
System.out.println("The file type is unknown.");
}
}
}
}

