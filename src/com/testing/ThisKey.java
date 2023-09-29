package com.testing;

public class ThisKey {
	 private int x;

	    public void setX(int x) {
	        
	        this.x = x;
	        System.out.println(x);
	    }
	    public static void main(String[] args) {
			ThisKey key=new ThisKey();
			key.setX(567);
		}
	
}
