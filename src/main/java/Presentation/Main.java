package Presentation;

import Dao.DaoImp;
import Metier.MetierImp;

public class Main {
    public static void main(String[] args) {

        DaoImp dao = new DaoImp();
        MetierImp metierImp = new MetierImp();

        metierImp.setDao(dao);
        
        System.out.println("calculer : " + metierImp.calculer());
    }
}
