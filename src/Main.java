public class Main {
    public static void main(String[] args) {
        
        try {
       Vetor vetor = new Vetor(5);
        vetor.addValor("Dois");
        vetor.addValor("Tres");
        vetor.addValor("um");
      
       
        System.out.println(vetor);}
        catch( Exception e) {
        	e.printStackTrace();
        }
        
    }


}
         