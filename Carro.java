/**
*
*Aluna: Janaina Fortunato da Silva
*IFPE:Campus - Igarassu
*No terminal javadoc *.java 
* Esse comando de javadoc serve para documenta o projeto.
*/

public class Carro{

	private String marca; //Marca do carro.
	private String cor; // cor do carro.
	private float velocidade; // velocidade do carro.

/**
*Aqui você vai criar a função getMarca para receber o valor da marca do carro.
*
*Com o retorno  usando o método this.
*
*/

	public String getMarca(){
		return this.marca;

	}

/**
*
*Aqui você vai criar a função setMarca para colocar o valor da marca na class, poŕem verificando antes com o if
*
*Para depois o método this receber o nome da marca.
*
*/


	public void setMarca(String marca){
		if (marca == null|| marca.length() == 0){
			return;
		}

		this.marca = marca;
	}

/**
*Aqui você vai criar a função getCor para receber o valor a cor  do carro.
*
*Com o retorno  usando o método this.
*
*/
	public String getCor(){
		return this.cor;
	}

/**
*
* Aqui você vai criar a função setCor para colocar o valor o cor na class, poŕem verificando antes com o if
*
*Para depois o método this receber o nome da cor.
*
*/
	public void setCor(String cor) {
		if(cor != null && cor.length() == 0){
			return;
		}

		this.cor = cor;
	}

/**
*
*Aqui você vai criar a função getVelocidade para receber o valor a velocidade  do carro.
*
*Com o retorno  usando o método this.
*
*/
	public float getVelocidade() {
		return this.velocidade;
	}

/**
* Aqui você vai criar a função setVelocidade para colocar o valor da velocidade na class, poŕem verificando antes com o if
*
*Para depois o método this receber o nome da velocidade.
*
*/
	public void setVelocidade(float velocidade){
		if (velocidade < 0.0f ){
			return;
		}

		this.velocidade = velocidade;
	}

/**
*
*aqui vai aumentar a velocidade do carro.
*
*/

	public void aumentar(float max){
		this.velocidade = this.velocidade + max;
	}


/**
*
*Aqui vai diminuir a velocidade do carro.
*
*/
	public void diminuir(float minino){
		this.velocidade = this.velocidade - minino;
	}

/**
*
*Nesta parte estou resevando um lugar na menoria do computador para compilar a class Carro, por isso o uso do (new)
*
*/

	public static void main(String[] args) {
		Carro c1 = new Carro();

			String s1 = new String("Marca");
			String s2 = new String("Marca");

			if (s1 == s2){
				System.out.println("~~~Entrou~~~");
			}

/**
*O codigo nesta parte vai preenche os atributos do objeto.
*
*imprimir todos os valores declarados nas variaveis.
*
*/

			c1.setMarca("FIAT");
			c1.setCor("AZUL");
			c1.setVelocidade(100);

			System.out.println("A marca do carro é: " + c1.getMarca());
			System.out.println("A cor do carro é: " + c1.getCor());
			System.out.println("A velocidade pode ser máxima ou minima: " + c1.getVelocidade());

			c1.aumentar(20);
			System.out.println("A velocidade ficou : " + c1.getVelocidade());

			c1.diminuir(20);
			System.out.println("A velocidade ficou: " + c1.getVelocidade());
		
	}

}
