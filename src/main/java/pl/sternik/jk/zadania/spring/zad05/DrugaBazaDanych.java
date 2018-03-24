package pl.sternik.jk.zadania.spring.zad05;

import org.springframework.stereotype.Repository;
import pl.sternik.jk.zadania.spring.zad04.Moneta;
import pl.sternik.jk.zadania.spring.zad04.MonetaDao;
import pl.sternik.jk.zadania.spring.zad04.NoSuchMonetaException;
import pl.sternik.jk.zadania.spring.zad04.Status;
import pl.sternik.jk.zadania.spring.zad06.DrugieDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
//@Qualifier("druga")
@DrugieDao
public class DrugaBazaDanych implements MonetaDao {

    private List<Moneta> baza;

    public DrugaBazaDanych() {
        baza = new ArrayList<Moneta>();

        Moneta m = new Moneta();
        m.setNumerKatalogowy(0);
        m.setKrajPochodzenia("Polska");
        m.setNominal(1);
        m.setWaluta("zł");
        m.setOpis("Ładna nowiutka złotóweczka");
        m.setDataNabycia(new Date());
        m.setCenaNabycia(new BigDecimal("1.2"));
        m.setStatus(Status.DO_SPRZEDANIA);
        baza.add(m);

        m = new Moneta();
        m.setNumerKatalogowy(1);
        m.setKrajPochodzenia("Polska");
        m.setNominal(2);
        m.setWaluta("zł");
        m.setOpis("dwójka");
        m.setDataNabycia(new Date());
        m.setCenaNabycia(new BigDecimal("1.6"));
        m.setStatus(Status.DO_SPRZEDANIA);
        baza.add(m);
    }

    public Moneta addMoneta(Moneta moneta) {
        boolean isPresent = false;
        for (int i = 0; i < baza.size(); i++) {
            if (moneta.equals(baza.get(i))) {
                isPresent = true;
            }
        }
        if (!isPresent) {
            moneta.setNumerKatalogowy(baza.size());
            baza.add(moneta);
            return moneta;
        }
        else{
            System.out.println("Jest już taka moneta w bazie.");
            // rzuc wyjatek unique constraint
        }
        return moneta;
    }

    public Moneta getMoneta(int numerKatalogowy) throws NoSuchMonetaException {
        if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
            throw new NoSuchMonetaException();
        }
        return baza.get(numerKatalogowy);
    }

    public boolean updateMoneta(Moneta moneta) {
        int numerKatalogowy = moneta.getNumerKatalogowy();
        if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
            return false;
        }

        Moneta m = baza.get(moneta.getNumerKatalogowy());
        if (m == null) {
            System.out.println("Nie ma monety o tym numerze! nic nie robie");
            return false;
        } else {
            System.out.println("Jest taka moneta zamieniam");
            baza.set(moneta.getNumerKatalogowy(), moneta);
            return true;
        }
    }

    public boolean deleteMoneta(int numerKatalogowy) {
        if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
            return false;
        }
        baza.remove(numerKatalogowy);
        return true;
    }

    public List<Moneta> getAll() {
        return baza;
    }

    private boolean sprawdzPoprawnoscNumeruKatalogowego(int numerKatalogowy) {
        if (numerKatalogowy < 0 || numerKatalogowy >= baza.size()) {
            System.out.println("Zły numer katalogowy");
            return false;
        }
        return true;
    }

}
