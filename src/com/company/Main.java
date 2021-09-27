package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 for MaxOfThree.");
        System.out.println("Enter number 2 for SumOfNumber.");
        System.out.println("Enter number 3 for CheckPrime.");
        System.out.println("Enter number 4 for array.");
        System.out.println("Enter number 5 for DigitCount.");

        System.out.print("Enter number your choice : ");
        n=sc.nextInt();
        if(n==1)

            MaxOfThree();
        if(n==2)

            SumOfNumber();
        if(n==3)

            CheckPrime();
        if(n==4)
            arr();
        if(n==5)
            DigitCount();
    }
    static void DigitCount()
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        n=sc.nextInt();
        Integer s1= n;
        System.out.println(s1.toString().length());
    }
    static void arr()
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        n=sc.nextInt();
        int []arr=new int[20];
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter number "+i+" :");
            arr[i]=sc.nextInt();
        }

            int t=arr[1];
            for(int j=1;j<=n;j++)
            {
                if(t<arr[j])
                {
                    t=arr[j];
                }

            }

        System.out.println(t);
    }
    static void CheckPrime()
    {
        int n,m,temp=0;

        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n/2;
        if (n==0||n==1) {
            System.out.println(n + " is not a prime Number.");
        } else {
            for (int i = 2; i < m; i++) {
                if (n%i==0)
                {
                    System.out.println(n + " is not a prime Number.");
                    temp=1;
                    break;
                }
            }
            if(temp==0)
            {
                System.out.println(n+" is prime number");
            }
        }
    }
    static void SumOfNumber()
    {
        int n=0,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for sum: ");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of N Number : "+sum);

    }
    static void MaxOfThree()
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=0,n3=0;
        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        n3 = sc.nextInt();
        if(n1>n2&&n1>n3)
        {
                System.out.println("n1");
        }
        else if(n2>n3)
        {
            System.out.println("n2");
        }
        else {
            System.out.println("n3");
        }
    }
}
