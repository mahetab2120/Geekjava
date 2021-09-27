package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 for MaxOfThree.");
        System.out.println("Enter number 2 for SumOfNumber.");
        System.out.println("Enter number 3 for CheckPrime.");
        System.out.println("Enter number 4 for CheckPrime.");

        System.out.println("Enter number your choice : ");
        n=sc.nextInt();
        if(n==1)

            MaxOfThree();
        if(n==2)

            SumOfNumber();
        if(n==3)

            CheckPrime();
        if(n==4)
            arr();
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
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is prime number.");
        }
        else{
            System.out.println(n+" is not a prime number.");

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
