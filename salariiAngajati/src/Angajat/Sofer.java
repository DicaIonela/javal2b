package Angajat;

public class Sofer extends Angajat{
    private static final double coeficientSalarial=1.0;
    private int nrOreLucrate;
    private int kmParcursi;
    private int nrMaxOreLucrate=300;
    private int kmParcursiMax=5000;
    public Sofer(String nume, String prenume) {
        super(nume, prenume);
    }

    public double getNrMaxOreLucrate()
    {
        return nrMaxOreLucrate;
    }
    public double getCoeficientSalarial()
    {
        return coeficientSalarial;
    }
    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        if (nrOreLucrate>300)
        {
            throw new IllegalArgumentException("Soferii nu pot lucra mai mult de 300 ore pe luna.");
        }
        this.nrOreLucrate=nrOreLucrate;
    }
    public void setKmParcursi(int kmParcursi) {
        if (kmParcursi>5000)
        {
            throw new IllegalArgumentException("Soferii nu pot parcurge mai mult de 5000 km pe luna.");
        }
        this.kmParcursi=kmParcursi;
    }

    @Override
    public double salariu() {
        return salariuOrarMinim*nrOreLucrate+kmParcursi*0.1;
    }

    @Override
    public String toString() {
        return "\nSofer:"+super.toString()+" a lucrat "+
                nrOreLucrate+" ore si a parcurs "+kmParcursi+"\nSalariu:"+salariu();
    }
}
