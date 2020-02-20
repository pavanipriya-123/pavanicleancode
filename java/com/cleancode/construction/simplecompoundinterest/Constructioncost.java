package com.cleancode.construction.simplecompoundinterest;

public class Constructioncost {
	public int costofconstruction(int area,int choice){
        if(choice==1)
        return area*1200;
        else if(choice==2)
        return area*1500;
        else if(choice==3)
        return area*1800;
        return area*2500;
    }

}
