package com.icodi.ui;

import com.icodi.dao.DaoImpl;
import com.icodi.dao.IDao;
import com.icodi.metier.IMetier;
import com.icodi.metier.MetierImpl;

public class UIStatique {
    public static void main(String[] args) {
        //Instanciation statique des dépendances
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        System.out.println("Résultat = " + metier.calcul());
    }
}
