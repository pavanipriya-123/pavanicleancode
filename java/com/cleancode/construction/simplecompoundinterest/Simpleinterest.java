package com.cleancode.construction.simplecompoundinterest;

public class Simpleinterest {
	 int p;
	    int t;
	     double r;
	    Simpleinterest(int p,int t,double r)
	    {
	        this.p=p;
	        this.t=t;
	        this.r=r;
	    }
	    public double simpleinterest()
	    {
	        return (p*r*t)/100;
	    }

}
