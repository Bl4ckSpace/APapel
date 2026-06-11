package construirFrases;

import java.util.ArrayList;

public class ConstruccionFrases {

    public ArrayList<String> construyeFrases(ArrayList<String> sujetos,
            ArrayList<String> verbos, ArrayList<String> predicados) throws Exception {

        if (!contenedoresExisten(sujetos, verbos, predicados))
            throw new Exception("No existen el grupo de sujetos, verbos y/o predicados.");
        if (!contenedoresLlenos(sujetos, verbos, predicados))
            throw new Exception("No hay sujetos, verbos y/o predicados.");
        if (!sujetoYPredicadoMayorIgualVerbos(sujetos, verbos, predicados))
            throw new Exception("Hay menos sujetos y/o predicados que verbos.");

        ArrayList<String> frases = new ArrayList<>();
        ArrayList<String> sujetosDisponibles = new ArrayList<>(sujetos);
        ArrayList<String> verbosDisponibles = new ArrayList<>(verbos);
        ArrayList<String> predicadosDisponibles = new ArrayList<>(predicados);

        while (!verbosDisponibles.isEmpty()) {
            int posSujeto = (int) (Math.random() * sujetosDisponibles.size());
            int posVerbo = (int) (Math.random() * verbosDisponibles.size());
            int posPredicado = (int) (Math.random() * predicadosDisponibles.size());

            String frase = sujetosDisponibles.get(posSujeto) + " "
                    + verbosDisponibles.get(posVerbo) + " "
                    + predicadosDisponibles.get(posPredicado);

            frases.add(frase);

            sujetosDisponibles.remove(posSujeto);
            verbosDisponibles.remove(posVerbo);
            predicadosDisponibles.remove(posPredicado);
        }

        return frases;
    }

    public ArrayList<String> prepararSujetos() {
        ArrayList<String> sujetos = new ArrayList<>();
        sujetos.add("Lucas");
        sujetos.add("Ellas");
        sujetos.add("Mi maestra");
        sujetos.add("Los niños");
        sujetos.add("Nosotros");
        return sujetos;
    }

    public ArrayList<String> prepararVerbos() {
        ArrayList<String> verbos = new ArrayList<>();
        verbos.add("compra");
        verbos.add("son");
        verbos.add("enseña");
        verbos.add("portan");
        return verbos;
    }

    public ArrayList<String> prepararPredicados() {
        ArrayList<String> predicados = new ArrayList<>();
        predicados.add("caramelos.");
        predicados.add("buenas personas.");
        predicados.add("muy bien.");
        predicados.add("sus cosas.");
        predicados.add("en la casa.");
        return predicados;
    }

    private boolean contenedoresExisten(ArrayList<String> sujetos,
            ArrayList<String> verbos, ArrayList<String> predicados) {
        return sujetos != null && verbos != null && predicados != null;
    }

    private boolean contenedoresLlenos(ArrayList<String> sujetos,
            ArrayList<String> verbos, ArrayList<String> predicados) {
        return !sujetos.isEmpty() && !verbos.isEmpty() && !predicados.isEmpty();
    }

    private boolean sujetoYPredicadoMayorIgualVerbos(ArrayList<String> sujetos,
            ArrayList<String> verbos, ArrayList<String> predicados) {
        return sujetos.size() >= verbos.size() && predicados.size() >= verbos.size();
    }
}
