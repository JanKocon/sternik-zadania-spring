package pl.sternik.jk.zadania.spring.zad04;

import java.math.BigDecimal;
import java.util.Date;

public class Moneta {
    private String Opis;
    private int numerKatalogowy;
    private long nominal;
    private String waluta;
    private BigDecimal cenaNabycia;
    private Date dataNabycia;
    private String krajPochodzenia;
    private Status status;

    public String getOpis() {
        return Opis;
    }
    public void setOpis(String opis) {
        Opis = opis;
    }
    public int getNumerKatalogowy() {
        return numerKatalogowy;
    }
    public void setNumerKatalogowy(int numerKatalogowy) {
        this.numerKatalogowy = numerKatalogowy;
    }
    public long getNominal() {
        return nominal;
    }
    public void setNominal(long nominal) {
        this.nominal = nominal;
    }
    public String getWaluta() {
        return waluta;
    }
    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }
    public BigDecimal getCenaNabycia() {
        return cenaNabycia;
    }
    public void setCenaNabycia(BigDecimal cenaNabycia) {
        this.cenaNabycia = cenaNabycia;
    }
    public Date getDataNabycia() {
        return dataNabycia;
    }
    public void setDataNabycia(Date dataNabycia) {
        this.dataNabycia = dataNabycia;
    }
    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }
    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Moneta [numerKatalogowy=" + numerKatalogowy + ", status=" + status + ", nominal=" + nominal
                + ", waluta=" + waluta + ", krajPochodzenia=" + krajPochodzenia + ", cenaNabycia=" + cenaNabycia
                + ", dataNabycia=" + dataNabycia + ", Opis=" + Opis + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numerKatalogowy;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moneta other = (Moneta) obj;
        if (numerKatalogowy != other.numerKatalogowy)
            return false;
        return true;
    }
}
