//stanslaus wanderi I39/2491/2016
//paul wainana I39/2480/2016
package sph427;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String args[]) throws UnknownHostException, IOException 
	{
		//declare the inputs and outputs
		char operator;
		float number;
		float number1;
		float results;
		Scanner sc = new Scanner (System.in);//accepts input from user
		Socket s = new Socket("127.0.0.1",1342);//created socket with ip and port number
		Scanner sc1= new Scanner(s.getInputStream());//create a scanner to get input from the server
		System.out.println("enter first number");//asks user to enter number
		number=sc.nextFloat();//saves the number in the number variable
		System.out.println("enter second number");//asks user to enter second number
		number1=sc.nextFloat();//saves the number in the number1 variable
		System.out.println("enter the operator  (+, -, *, /)");//asks user to enter the operator
		operator= sc.next().charAt(0);//saves the operator
		
		
		PrintStream p = new PrintStream(s.getOutputStream());//enables to send input to the server
		p.println(number);//sends the first number
		p.println(number1);//sends the second number
		p.println(operator);//sends the operator
		
		results = sc1.nextFloat();//gets the value of the scanners results from the server
		System.out.println(results);
	}

}
