package Angajat;

public abstract class Angajat extends Persoana{
    private int nrOreLucrate;
    protected static final double salariuOrarMinim=15;
    public abstract double getCoeficientSalarial();
    public abstract double getNrMaxOreLucrate();
    public Angajat(String nume, String prenume) {
        super(nume, prenume);
    }
    public abstract double salariu();

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }
}
