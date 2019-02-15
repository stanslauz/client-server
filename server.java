//stanslaus wanderi I39/2491/2016
//paul wainana I39/2480/2016

package sph427;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	
	public static void main(String args[]) throws IOException
	{
		float number1;
		float number;
		float results;
		char operator;
		
		ServerSocket s1 = new ServerSocket(1342);//creates server socket and links the port number with that of the client
		Socket ss= s1.accept();//create socket and set that it accepts data from the serversocket
		Scanner sc = new Scanner(ss.getInputStream());//creates a scanner that takes input from the socket
		number = sc.nextFloat();//takes first input
		number1 = sc.nextFloat();//takes second input
		operator = sc.next().charAt(0);//takes operator
		
		//perfomance of various arithimetic functions with the if else function basing on the operator
		
		if(operator == '+')
		{
			results = number + number1;
			PrintStream p = new PrintStream(ss.getOutputStream());//send output back to client
			p.println(results);
		}
		else if(operator == '-')
		{
			results = number - number1;
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(results);
		}
		else if(operator == '*')
		{
			results = number * number1;
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(results);
		}
		else if(operator == '/')
		{
			results = number / number1;
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(results);
		}
		else {
			results = 0;
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(results);
			
		}
		
	
			
	}

}
