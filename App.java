import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        MeioDeTransporte meio = new MeioDeTransporte();
        meio.setCarga_maxima(100);
        meio.setPotencia(10);
        System.out.println(meio.consumo());

        
    }
    
}
