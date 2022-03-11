import java.util.Arrays;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
    }

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
}
