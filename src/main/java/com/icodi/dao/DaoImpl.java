package com.icodi.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 40;
        return t;
    }
}
