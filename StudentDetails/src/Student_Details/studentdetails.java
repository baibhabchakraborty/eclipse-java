package Student_Details;



import java.io.*;
import java.util.*;
class student {				//not “public class student” as only one public class per file
    public String usn,name,branch,phone;
       void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN:-");
        usn = sc.next();
        System.out.println("Enter Name:-");
        name = sc.next();
        System.out.println("Enter Branch:-");
        branch = sc.next();
        System.out.println("Enter Phone number:-");
        phone = sc.next();
    }
    void output()
    {
        System.out.println("\t"+usn+"\t"+name+"\t"+branch+"\t"+phone);
    }
}

public class studentdetails {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Students");
        int n = sc.nextInt();
        student[] s = new student[n];
        int i;
      for (i = 0; i < n; i++) {
            System.out.println("Enter the student details: " + i);
            s[i] = new student();
            s[i].input ();
        }
        System.out.println("\n\n\n\t\tStudent Details");
        System.out.println("\t\t---------------");
        System.out.println("\tUSN\tName\tBranch\tPhone");
        System.out.println("\t---\t----\t------\t-----");
        for (i = 0; i < n; i++) 
{
 s[i].output ();
        }
    }
}

