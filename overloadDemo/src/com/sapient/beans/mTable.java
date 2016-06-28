package com.sapient.beans;

public class mTable {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) throws Exception {
		if(num > 0)
		this.num = num;
		else throw new Exception("number must be positive");
		
	}
    public void display(){
    	for(int i=1;i<=10;++i)
    		System.out.printf("%d * %d = %d",num,i,num*i);
    	
    	
    	
    	
    }
    public void display(int rows) {
    	for(int i=1;i<=rows;++i)
    		System.out.printf("%d * %d = %d",num,i,num*i);
}
    }
