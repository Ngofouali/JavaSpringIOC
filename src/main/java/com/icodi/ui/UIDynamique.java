package com.icodi.ui;

import com.icodi.dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UIDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner clavier = new Scanner(new File("config.txt"));
        String daoClassName = clavier.next();
        Class classDao = Class.forName(daoClassName);
        IDao dao = (IDao) classDao.newInstance();
        System.out.println(dao.getData());
    }
}
