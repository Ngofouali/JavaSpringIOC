package com.icodi.metier;

import com.icodi.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return 0;
    }
}
