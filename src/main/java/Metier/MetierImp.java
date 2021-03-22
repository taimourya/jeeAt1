package Metier;

import Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MetierImp implements IMetier{

    @Autowired
    Idao dao;

    @Override
    public int calculer() {
        return dao.getData() * 2;
    }

    public Idao getDao() {
        return dao;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
