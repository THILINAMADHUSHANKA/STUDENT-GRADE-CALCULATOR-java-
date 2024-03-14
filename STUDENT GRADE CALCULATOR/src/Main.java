import java.util.*;
public class Main
{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println();
        System.out.println("Enter the total subjects : ");
        n=sc.nextInt();

        int arr[] = new int[n];
        System.out.println();
        System.out.println("Enter the marks secured in each subject : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        int total=0;

        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        System.out.println();

        System.out.println("The total marks obtained is : "+total);


        float percentage;
        percentage = (total / (float)n);

        System.out.println();
        System.out.println( "Total Percentage : " + percentage + "%");

        String Grade;

        if (percentage>=75)
        {
            Grade = "A";
        }

        else if (percentage<75 && percentage>=65)
        {
            Grade = "B";
        }
        else if (percentage<65 && percentage>=50)
        {
            Grade = "C";
        }
        else if (percentage<50 && percentage>=35)
        {
            Grade = "S";
        }

        else
        {
            Grade = "E";
        }
        System.out.println();
        System.out.println( "Grade the student : "+ Grade );

    }
}