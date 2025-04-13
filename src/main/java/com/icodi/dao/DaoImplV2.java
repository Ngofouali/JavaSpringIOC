package com.icodi.dao;

import org.springframework.stereotype.Component;

@Component("dv2")
public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version capteurs...");
        double t = 25;
        return t;
    }
}
