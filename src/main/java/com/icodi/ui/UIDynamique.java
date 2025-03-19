package com.icodi.ui;

import com.icodi.dao.IDao;
import com.icodi.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class UIDynamique {
    // FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        //Lecture du fichier de configuration
        Scanner clavier = new Scanner(new File("config.txt"));
        String daoClassName = clavier.next();

        //Chargement en mémoire de la classe DaoImpl
        Class classDao = Class.forName(daoClassName);

        IDao dao = (IDao) classDao.newInstance();

        //Lecture de la prochaine ligne du fichier de configuration
        String metierClassName = clavier.next();

        //Chargement en mémoire de la classe MetierImpl
        Class classMetier = Class.forName(metierClassName);

        IMetier metier = (IMetier) classMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("Résultat = " + metier.calcul());
    }
}
