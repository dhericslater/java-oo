package academy.slater.javacore.Bintroducaometodos.dominio;

public class Calculadora {

	public void somaDoisNumeros() {
		System.out.println(10 + 5);
	}

	public void subtraiDoisNumeros() {
		System.out.println(6 - 1);
	}

	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public double divideDoisNumeros(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}

		return num1 / num2;
	}

	public double divideDoisNumeros02(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;

		}
		return 0;
	}
	
	public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("N�o existe divis�o por 0");
		}else {
			System.out.println(num1/num2);
		}
	}
	
	public void alteraDoisValores(int num1, int num2) {
		num1 = 22;
		num2 = 33;
		
		System.out.println("Dentro do alteraDoisValores");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
