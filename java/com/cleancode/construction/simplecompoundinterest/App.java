package com.cleancode.construction.simplecompoundinterest;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	int p=12000;
        double r=0.5;
        int t=3;
        int n=1;
        Compoundinterest obj1=new Compoundinterest(p,r,n,t);
        Simpleinterest obj2=new Simpleinterest(p,t,r);
        System.out.println("compoundinterest of 12000 for 3years is : "+obj1.compoundinterest());
        System.out.println("simpleinterest of 12000 for 3years is : "+obj2.simpleinterest());
        Constructioncost cost=new Constructioncost();
        System.out.println("Enter house area");
        Scanner sc=new Scanner(System.in);
        int area=sc.nextInt();
        System.out.println("choice 1:cost of material per square feet is 1200");
        System.out.println("choice 2:cost of material per square feet is 1500");
        System.out.println("choice 3:cost of material per square feet is 1800");
        System.out.println("choice 4:cost of material per square feet is 2500");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        System.out.println("house construction cost is : "+cost.costofconstruction(area,choice));
        sc.close();
    }
}
