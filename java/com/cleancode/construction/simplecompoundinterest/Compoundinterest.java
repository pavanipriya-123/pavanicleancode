package com.cleancode.construction.simplecompoundinterest;

public class Compoundinterest {
	int p;
	   double r;
	   int n;
	   int t;
	   Compoundinterest(int p,double r,int n,int t)
	   {
	       this.p=p;
	       this.r=r;
	       this.n=n;
	       this.t=t;
	   }
	   public double compoundinterest()
	   {
	       return p*Math.pow((1+(r/n)),(n*t));
	   }

}
