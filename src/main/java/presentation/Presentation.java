package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
public static void main(String[] args){
    //DaoIMP dao = new DaoIMP();
    //MetierIMP metier = new MetierIMP();
    // metier.setDao(dao);
    // System.out.println(metier.calcule());

    try {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.next();
        String metierClassName = scanner.next();
        // System.out.println(daoClassName);
        // System.out.println(metierClassName);
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
       // System.out.println(dao.getValue());
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();
        Method m1= cMetier.getMethod("setDao",new Class[]{ IDao.class});
        m1.invoke(metier,new Object[] {dao});
        System.out.println(metier.calcule());





    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
