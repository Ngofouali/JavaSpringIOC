package com.icodi.ui;

import com.icodi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UISpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.icodi");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Résultat : " + metier.calcul());
    }
}
