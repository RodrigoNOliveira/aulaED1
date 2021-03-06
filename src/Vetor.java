import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

	
	
	/*public void addValor(String elemento) {
		for (int i = 0; i< elementos.length; i++) {
			if (elementos[i] == null) {
				elementos[i] = elemento;
				tamanho++;
				break;
			}
		}
	}*/
    
    public void addValor(String elemento) throws Exception {
    	if ( tamanho < elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho++;
    	}
    	else {
    		throw new Exception("Vetor cheio");
    	}
    }
	
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");
		for (int i = 0; i< tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (tamanho >0 ) {
			s.append(elementos[tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
}
