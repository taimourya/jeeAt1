package Presentation;

import Dao.DaoImp;
import Dao.Idao;
import Metier.IMetier;
import Metier.MetierImp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static IMetier metier;
    public static Idao dao;

    public static void initDependance()  {

        try {
            FileInputStream file = new FileInputStream("C:\\Users\\yahya\\IdeaProjects\\jeeAt1\\src\\main\\java\\dependance.txt");
            Scanner sc = new Scanner(file);
            Class daoClass = Class.forName(sc.nextLine());
            dao = (Idao)daoClass.newInstance();

            Class metierClass = Class.forName(sc.nextLine());
            metier = (IMetier)metierClass.newInstance();
            ((MetierImp)metier).setDao(dao);

        } catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        initDependance();

        System.out.println("calculer : " + metier.calculer());
    }
}
