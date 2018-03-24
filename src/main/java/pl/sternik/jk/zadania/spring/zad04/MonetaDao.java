package pl.sternik.jk.zadania.spring.zad04;

import java.util.List;

public interface MonetaDao {
    public Moneta addMoneta(Moneta moneta);
    public Moneta getMoneta(int numerKatalogowy) throws NoSuchMonetaException;
    public boolean updateMoneta(Moneta moneta) throws NoSuchMonetaException;
    public boolean deleteMoneta(int numerKatalogowy) throws NoSuchMonetaException;
    public List<Moneta> getAll();
}
