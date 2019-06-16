package mainCalculatorSpring;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Calculator {
	final static Scanner sc = new Scanner(System.in);
	final static String constante="Int";
	//final static String flotante="Float";
	public static void runCalculator() {
		operations op= new operations();
		System.out.println("Calculator with Spring");
		System.out.println("Choose the option:"+
							"1.- Plus"+" 2.- Substraction"+
							" 3.- Multiplication"+ " 4.- Division");
		int operator= sc.nextInt();
		String option = sc.nextLine();
		switch(operator) {
		case 1:
			System.out.println("please write Int if you want to do plus in Integer");
			if(option == constante) {
			System.out.println("1.- Plus");
			op.suma(sc.nextInt(), sc.nextInt());
		}else {
				System.out.println("1.- Plus");
				op.suma(sc.nextFloat(), sc.nextFloat());
			}
		break;
		case 2:
			System.out.println("please write Int if you want to do plus in Substraction");
			if(option == constante) {
			System.out.println("2.- Substraction");
			op.resta(sc.nextInt(), sc.nextInt());
			break;
			}else {
				System.out.println("2.- Substraction");
				op.resta(sc.nextFloat(), sc.nextFloat());
				break;
			}
		case 3:
			System.out.println("please write Int if you want to do plus in Multiplication");
			if(option==constante) {
			System.out.println("3.- Multiplication");
			op.multiplication(sc.nextInt(), sc.nextInt());
			break;
			}else {
				System.out.println("3.- Multiplication");
				op.multiplication(sc.nextFloat(), sc.nextFloat());
				break;
			}
		case 4:
			System.out.println("please write Int if you want to do plus in Division");
			if(option==constante) {
			System.out.println("4.- Division");
			op.division(sc.nextFloat(), sc.nextFloat());
			break;
			}else {
				System.out.println("4.- Division");
				op.division(sc.nextInt(), sc.nextInt());
				break;
			}
		default :
			System.out.println("Choose the correct option bye :)");
			System.exit(0);
			break;
		}
	}
	public static void main(String[] args) {
		ApplicationContext	ctx = SpringApplication.run(Calculator.class, args);
		operations op = (operations) ctx.getBean(operations.class);
		runCalculator();
	}
}
