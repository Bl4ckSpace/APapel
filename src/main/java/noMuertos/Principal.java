package noMuertos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        GestionNoMuertos gestionNoMuertos = new GestionNoMuertos();
        ArrayList<NoMuerto> noMuertos = gestionNoMuertos.prepararNoMuertos();
        ArrayList<NoMuerto> noMuertosOrdenados = gestionNoMuertos.ordenaPorRatones(noMuertos);

        for (NoMuerto noMuerto : noMuertosOrdenados) {
            System.out.println(noMuerto);
        }
    }
}
