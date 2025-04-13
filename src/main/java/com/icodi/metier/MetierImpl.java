package com.icodi.metier;

import com.icodi.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    //Couplage faible
    private IDao dao;

    //Injection via le constructeur avec paramètres
    public MetierImpl(@Qualifier("dv2") IDao dao) {
        this.dao = dao;
    }

    //Injection via le constructeur sans paramètres
    /*public MetierImpl() {
    }*/


    //Injection via le setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tempData = dao.getData();
        double result = tempData*0.5*Math.random()*(100-20);
        return result;
    }
}
