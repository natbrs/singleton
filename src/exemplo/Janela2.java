package exemplo;

public class Janela2 {

    
    private static Janela2 instancia;
    
    
    private Janela2() {

    }

  
    public static void main(String[] args) {
        if(instancia == null){ 
            instancia = new Janela2();
        }
    }
    
}
