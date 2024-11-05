package com.training.hibernate.mappings.manytoone;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if(sessionFactory == null) {
            try {
                Configuration config = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/training");
                properties.put(Environment.USER, "root");
                properties.put(Environment.PASS, "");
                properties.put(Environment.SHOW_SQL, "true");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

                properties.put(Environment.HBM2DDL_AUTO, "update");
                properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                config.setProperties(properties);

                config.addAnnotatedClass(Employee.class);
                config.addAnnotatedClass(Address.class);


                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

                sessionFactory = config.buildSessionFactory(serviceRegistry);


            } catch (HibernateException e) {
                e.printStackTrace();;
            }
        }

        return sessionFactory;

    }

    
}
