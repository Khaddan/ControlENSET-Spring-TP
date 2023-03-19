package Presentation;

import Dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("Conf.txt"));
        String DaoClassName=scanner.nextLine();
        Class cDao=Class.forName(DaoClassName);
        IDao Dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(Dao.getData());

    }
}
