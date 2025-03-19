package com.icodi.metier;

import com.icodi.dao.IDao;

public class MetierImpl implements IMetier {
    //Couplage faible
    private IDao dao;

    //Injection via le constructeur avec paramètres
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    //Injection via le constructeur sans paramètres
    public MetierImpl() {
    }


    //Injection via le setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tempData = dao.getData();
        double result = tempData*0.5*Math.PI*(100-20);
        return result;
    }
}
