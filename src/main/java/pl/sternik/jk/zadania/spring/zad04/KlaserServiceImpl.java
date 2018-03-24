package pl.sternik.jk.zadania.spring.zad04;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class KlaserServiceImpl {
    @Resource(name = "prostaBazaDanych")
    private MonetaDao monetaDao;

    public KlaserServiceImpl() {
    }
    public KlaserServiceImpl(MonetaDao monetaDao) {
        this.monetaDao = monetaDao;
    }

    public List<Moneta> getDoSprzedania(){
        List<Moneta> all = monetaDao.getAll();
        List<Moneta> tmp = new ArrayList<Moneta>();
        for (Moneta moneta : all) {
            if(moneta.getStatus().equals(Status.DO_SPRZEDANIA)){
                tmp.add(moneta);
            }
        }
        return tmp;
    }
}
