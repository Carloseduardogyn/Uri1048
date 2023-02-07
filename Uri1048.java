package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double novosalario;
		double reajuste;
		int percentual;
		if (salario <= 400.0) {
			percentual = 15;
		} else if (salario <= 800.0) {
			percentual = 12;
		} else if (salario <= 1200.0) {
			percentual = 10;
		} else if (salario <= 2000.0) {
			percentual = 7;
		} else {
			percentual = 4;
		}

		reajuste = salario * percentual / 100.0;
		novosalario = salario + reajuste;

		System.out.printf("Novo salario: %.2f%n", novosalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");

		sc.close();

	}

}
