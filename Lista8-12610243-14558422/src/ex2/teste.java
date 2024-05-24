package ex2;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import Controller.InvalidNumberException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import Controller.Fatorial;
import View.fatorialView;

/*Qual a diferenca dessa categoria de teste com os testes usando o JUnit que estávamos fazendo até
 * agora?
 * A principal diferença entre os testes é que o teste unitário simula simplesmente uma entrada e 
 * compara com uma saída esperada. Enquanto o teste de aceitação simula tanto uma entrada e sua
 * saída como também o uso da "interface do aplicativo" programado.  
*/

class teste {
	@Test
	void test() throws InvalidNumberException {
		fatorialView teste = new fatorialView();
		teste.setVisible(true);
		JTextField inputNumber = teste.getNumberinput();
		JButton botao = teste.getButton();
		long resultado = 1;
		for(int i = -1; i<22; i++) {
			inputNumber.setText(Integer.toString(i));
			botao.doClick();
			if(i > 0) {
				resultado = resultado*i;
				assertEquals(resultado,Fatorial.resultado(Integer.toString(i)));	
			}
		}
	}
	}
