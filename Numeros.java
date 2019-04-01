/*
*Faça um programa que imprima todos os valores pares de 1 a 1000.
*
*/
public class Numeros{

public static void main(String[] args) {
	int c = 1;
	System.out.println("Valores pares entre 1 e 1000:" );

	while(c<=1000){
		if(c % 2 == 0)
			System.out.println(c);
		c = c + 1;
	}
  } 

}