package noMuertos;

import java.util.ArrayList;

public class GestionNoMuertos {
    public ArrayList<NoMuerto> ordenaPorRatones(ArrayList<NoMuerto> noMuertos) {
        ArrayList<NoMuerto> noMuertosOrdenados = new ArrayList<>();

        while (!noMuertos.isEmpty()) {
            NoMuerto noMuertoNRatonesMayor = noMuertos.get(0);
            for (NoMuerto noMuerto : noMuertos) {
                if (noMuerto.getNumRatones() > noMuertoNRatonesMayor.getNumRatones()) {
                    noMuertoNRatonesMayor = noMuerto;
                }
            }
            noMuertosOrdenados.add(noMuertoNRatonesMayor);
            noMuertos.remove(noMuertoNRatonesMayor);
        }

        return noMuertosOrdenados;
    }

    public ArrayList<NoMuerto> prepararNoMuertos() {
        ArrayList<NoMuerto> noMuertos = new ArrayList<>();

        noMuertos.add(new NoMuerto("001", 1, 2));
        noMuertos.add(new NoMuerto("002", 2, 5));
        noMuertos.add(new NoMuerto("003", 3, 3));
        noMuertos.add(new NoMuerto("004", 2, 4));

        return noMuertos;
    }
}

