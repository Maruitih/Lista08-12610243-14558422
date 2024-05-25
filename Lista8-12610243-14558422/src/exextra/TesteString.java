package exextra;

public class TesteString {
	 public static void main(String[] args) {
	        final int N = 100000; 

	        long buffercomeco, bufferfim;
	        long stringcomeco, stringfim;
	        
	        String Resultado1 = "";
	        stringcomeco = System.currentTimeMillis();
	        for (int i = 0; i < N; i++) {
	            Resultado1 += "a"; 
	        }
	        stringfim = System.currentTimeMillis();
	        long stringtempo = stringfim - stringcomeco;

	        buffercomeco = System.currentTimeMillis();
	        StringBuffer Resultado2 = new StringBuffer();
	        for (int i = 0; i < N; i++) {
	            Resultado2.append("a"); 
	        }
	        bufferfim = System.currentTimeMillis();
	        long buffertempo = bufferfim - buffercomeco;

	        System.out.println("Tempo usando String: " + stringtempo);
	        System.out.println("Tempo usando StringBuffer: " + buffertempo);
	    }
}
/* String é uma classe imutável, ou seja, ela não pode ser modificada, então para cada concatenação ela cria uma nova instancia de String */
/*Buffer é um classe mutável, ou seja, ela pode ser modificada, assim ela pode ser mais eficiente que o String, pois ela não precisa criar várias instâncias */