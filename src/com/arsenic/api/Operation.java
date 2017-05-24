package com.arsenic.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operation {
	
    private int a ; 
    private int b ;
    private String operation ; 
    private int result;
    
    public Operation(){
    	
    }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
   
}
