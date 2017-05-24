package com.arsenic.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json-handler")
public class APITest {

	@Path("calc")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Operation getMsg(Operation operation) throws ServletException, IOException {

		int num1 = operation.getA();
		int num2 = operation.getB();
		String op = operation.getOperation();

		int result = 0;

		System.out.println(num1 + " "+ num2 + " " + op);;

		try{
			switch (op) {
			case "+":
				System.out.println("+ invoked");
				result = add(num1, num2);
				break;
			case "-":
				result = sub(num1, num2);
				System.out.println("- invoked");
				break;
			case "*":
				result = mul(num1, num2);
				System.out.println("* invoked");
				break;
			case "/":
				result = divide(num1, num2);
				System.out.println("/ invoked");
				break;
			case "%":
				result = remainder(num1, num2);
				System.out.println("% invoked");
				break;
			case "sin":
				result = sin(num1);
				System.out.println("sin invoked");
				break;
			case "cos":
				result = cos(num1);
				System.out.println("cos invoked");
				break;
			default:
				break;
			}
			if(operation.equals("tan")){
				tan(num1);
			}
		}
		catch(Exception e){
		}

		operation.setResult(result);
		return operation;
	}

	private int add(int a, int b){
		int result = a + b ;;
		return result;

	}
	private int sub(int a, int b){
		int result =  a - b;;

		return result;

	}
	private int mul(int a, int b){
		int result = a * b;

		return result;

	}
	private int divide(int a, int b){
		int result = 0;
		if(b!=0){
			result = a / b;
		}
		return result;
	}
	private int remainder(int a, int b){
		int result = 0;
		if(b!=0){
			result = a % b;
		}

		return result;

	}

	private int sin(int num1){
		int result = (int) Math.toRadians(Math.sin(num1));

		return result;

	}
	private int cos(int num1){
		int result = (int) Math.toRadians(Math.cos(num1));

		return result;

	}
	private int tan(int num1){
		int result = (int) Math.toRadians(Math.tan(num1));

		return result;

	}
}

