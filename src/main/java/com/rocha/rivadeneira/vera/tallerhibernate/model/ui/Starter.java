/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rocha.rivadeneira.vera.tallerhibernate.model.ui;

/**
 *
 * @author Luig Rocha
 */
import com.rocha.rivadeneira.vera.tallerhibernate.model.TipoCuenta;
import com.rocha.rivadeneira.vera.tallerhibernate.model.hibernateutil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hendrix
 */
public class Starter {
    
    
    public static void main(String[] args) {
        System.out.println("ejemplo de hibernate");
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List<TipoCuenta> registros = session.createQuery("SELECT obj FROM TipoCuenta obj").list();
        for (TipoCuenta objeto : registros) {
            System.out.println(objeto);
        }
        TipoCuenta cuenta=new TipoCuenta();
        cuenta.setCodigo("INB");
        cuenta.setDescripcion("INVERSIONES");
        Transaction tx=null;
        try{
            tx=session.beginTransaction();
        session.persist(cuenta);
        tx.commit();
        }catch(Exception e)
        {
            tx.rollback();
        }
        registros = session.createQuery("SELECT obj FROM TipoCuenta obj").list();
        for (TipoCuenta objeto : registros) {
            System.out.println(objeto);
        }
    
        session.close();
    }
    
}