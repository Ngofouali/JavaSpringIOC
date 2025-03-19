package com.icodi.dao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version capteurs...");
        double t = 25;
        return t;
    }
}
