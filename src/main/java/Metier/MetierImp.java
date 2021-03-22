package Metier;

import Dao.Idao;

public class MetierImp implements IMetier{

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
