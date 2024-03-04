
import javax.swing.*;
public class Principal {

	public static void main(String[] args) {
	
	
	MetRecursivo met = new MetRecursivo();
	
	int num1 , num2, opcao;
	
	opcao =  Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n 1 - Multiplicação \n 2 - Divisão \n 3 - Pares \n 4- Fatorial Duplo \n 5- MDC"));
	
	switch (opcao) 
	{
	case 1:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		System.out.println(met.multiplicaSoma(num1, num2));
		break;
		
	case 2:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));	
		System.out.println(met.restoDivisao(num1, num2));
		break;
		
	
		
	case 3:
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int[] vet1 = new int[tamanho];
		
		for (int i = 0; i < tamanho; i ++){
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para incluir no vetor:"));
		}
		
		System.out.println(met.contaPares(vet1, tamanho - 1, 0));
		break;
		
	case 4:
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o  número para fazer o Fatorial Duplo:"));
		} 
		while ((num1 % 2) == 0 );
		
		System.out.println(met.fatorialDuplo(num1));
		break;

	case 5:
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		System.out.println(met.calcularMDC(num1, num2));
		break;
	
	default:
		System.out.println("Opção Inválida");
		break;
	
	
	}
	}
}
