public class Drak {
    private int pocetHlav;
    private int hmotnost;
    private boolean umiLetat;
    private String jmeno;

    public int getPocetHlav() {
        return pocetHlav;
    }
    public int getHmotnost() {
        return hmotnost;
    }
    public boolean isUmiLetat() {
        return umiLetat;
    }
    public String getJmeno() {
        return jmeno;
    }

    public void setPocetHlav(int pocetHlav) {
        this.pocetHlav = pocetHlav;
    }
    public void setHmotnost(int hmotnost) {
        this.hmotnost = hmotnost;
    }
    public void setUmiLetat(boolean umiLetat) {
        this.umiLetat = umiLetat;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Drak(int pocetHlav, int hmotnost, boolean umiLetat, String jmeno) {
        this.pocetHlav = pocetHlav;
        this.hmotnost = hmotnost;
        this.umiLetat = umiLetat;
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return " drak " +
                "pocetHlav - " + pocetHlav +
                ", hmotnost - " + hmotnost +
                ", umiLetat - " + umiLetat +
                ", jmeno - '" + jmeno + '\'' +
                ' ';
    }
}
