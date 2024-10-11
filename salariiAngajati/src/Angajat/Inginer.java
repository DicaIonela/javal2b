package Angajat;

public class Inginer extends Angajat {
    protected static final double coeficientSalarial=1.5;
    private int nrOreLucrate;
    private int nrMaxOreLucrate=250;

    public Inginer(String nume, String prenume) {
        super(nume, prenume);
    }
    public double getCoeficientSalarial()
    {
        return coeficientSalarial;
    }
    public double getNrMaxOreLucrate()
    {
        return nrMaxOreLucrate;
    }
    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        if (nrOreLucrate>250)
        {
            throw new IllegalArgumentException("Inginerii nu pot lucra mai mult de 250 ore pe luna.");
        }
        this.nrOreLucrate=nrOreLucrate;

    }

    @Override
    public double salariu() {
        return salariuOrarMinim*coeficientSalarial*nrOreLucrate;
    }

    @Override
    public String toString() {
        return "\nInginer:" +
                super.toString() +
                ",a lucrat "+nrOreLucrate+" ore,"+
                "\nsalariu="+salariu();
    }
}
