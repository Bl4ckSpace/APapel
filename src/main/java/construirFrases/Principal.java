package construirFrases;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ConstruccionFrases construccionFrases = new ConstruccionFrases();
        int contador = 1;
        try {
            ArrayList<String> frases = construccionFrases.construyeFrases(
                construccionFrases.prepararSujetos(), construccionFrases.prepararVerbos(),
                construccionFrases.prepararPredicados());

            for (String frase : frases) {
                System.out.println(contador+". "+frase);
                contador++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
