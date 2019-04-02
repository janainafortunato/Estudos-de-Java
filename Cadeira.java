/* 
*
*Exercícios de java para treinar a linguagem.
*
*Data: 30/03/2019
*
*/

public class Cadeira{
	private String marca; // marca da cadeira
	private String cor; // cor da cadeira
	private float altura; //altura da cedeira

/*
*
*Retorna a marca de uma cadeira
*
*O método getMarca() serve para retorna os valores que vão ser inseridos no objeto.
*
*/
	public String getMarca(){
		return this.marca;
	}
/*
*
*O método setMarca atualizar os valores que vão ser inseridos no objeto cadeira
*
*/
	public void setMarca(String marca){
		if (marca == null || marca.length() == 0 ){
			return;
		}
		this.marca = marca; // essa parte do codigo vai verifica o atributo marca.
	}

	public String getCor(){
		return this.cor;
	}

	public void setCor(String cor){
		if(cor == null || cor.length() == 0){
			return;
		}

		this.cor = cor;
	}

	public float getAltura(){
		return this.altura;
	}

	public void setAltura(float altura){
		if(altura < 0.0f){
			return;
		}

		this.altura = altura;
	}

	public void levantar(float incremento){
		this.altura = this.altura + incremento;
	}

	public void descer(float decremento){
		this.altura = this.altura - decremento;
	}

	public static void main(String[] args){
		Cadeira c1 = new Cadeira();

		//preenche os atributos do objeto.

		c1.setMarca("A");
		c1.setCor("Verde");
		c1.setAltura(45.0f);

		System.out.println("Marca de c1: " + c1.getMarca());
		System.out.println("Cor de c1: " + c1.getCor());
		System.out.println("Altura de c1: " + c1.getAltura());

		// Vai imprimir os resultados inseridos nos atributos.

		c1.levantar(10.0f);
		System.out.println("Altura de c1: " + c1.getAltura());

		c1.descer(5.0f);
		System.out.println("Altura de c1: " + c1.getAltura());

	}
}