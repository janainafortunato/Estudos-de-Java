/*
*Faça um programa que leia diversos números informandos pelo usuário e após
*cada leitura exibir se o número é par ou ímpar.
*Se o usuário fornecer um valor negativo o programa deverá encerrar a execução
*(sem entretanto testar se esse número negativo é par ou ímpar).
*
*/


public class Scanner{
	public static void main(String[] args){

/*declaração de variáveis*/

		int num = 0;
		System.out.println("Para sair, entre com um valor < 0 ");
		System.out.println("Digite um número: ");
		Scanner input = new Scanner(System.in);
		num = s.nextlnt();
		while (num >= 0 ){
			if (num % 2 == 0){

				System.out.println("O número é par ");
			}else{

				System.out.println("O número é impar ");
			}
			System.out.println("Digite um número: ");
			num = s.nextlnt();
		}
	}

}