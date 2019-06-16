package mainCalculatorSpring;

import org.springframework.stereotype.Component;

@Component
public class operations {
	 int suma(int numero1, int numero2) {
		 System.out.println(numero1+numero2);
		 return numero1+numero2;
	}
	 int resta(int numero1, int numero2) {
		System.out.println(numero1-numero2);
		return numero1-numero2;
	}
	 int multiplication(int numero1, int numero2) {
		System.out.println(numero1*numero2);
		return numero1*numero2;
	}
	 int division(int numero1, int numero2) {
		System.out.println(numero1/numero2);
		return numero1/numero2;
	}
	 float suma(float numero1, float numero2) {
		 System.out.println(numero1+numero2);
		return numero1+numero2;
	}
	float resta(float numero1, float numero2) {
		 System.out.println(numero1-numero2);
		 return numero1 - numero2;
	}
	float multiplication(float numero1, float numero2) {
	 System.out.println(numero1*numero2);
	 return numero1*numero2;
	}
	float division(float numero1, float numero2) {
		 System.out.println(numero1/numero2);
		 return numero1/numero2;
	}
	String strings(String s1, String s2) {
		int numero1 = Integer.parseInt(s1);
		int numero2 = Integer.parseInt(s2);
		int resultado = numero1+numero2;
		System.out.println(resultado);
		return s1+s2;
	}
}
