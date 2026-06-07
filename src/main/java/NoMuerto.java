public class NoMuerto {
    // Esta clase no se copia y pega, solo es para que no me salgan errores en la otra
    private String idNoMuerto;
    private int color;
    private int numRatones;

    public NoMuerto(String idNoMuerto, int color, int numRatones) {
        this.idNoMuerto = idNoMuerto;
        this.color = color;
        this.numRatones = numRatones;
    }

    public String getIdNoMuerto() {
        return idNoMuerto;
    }

    public int getColor() {
        return color;
    }

    public int getNumRatones() {
        return numRatones;
    }

    @Override
    public String toString() {
        return "NoMuerto{" +
        "idNoMuerto='" + idNoMuerto + '\'' +
        ", color=" + color +
        ", numRatones=" + numRatones +
        '}';
    }
}
