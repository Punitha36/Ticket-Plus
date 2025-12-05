package com.jspider.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBconfig {

        private static SessionFactory sessionFactory;

        static
        {
            //load config
            System.out.println("✅ Loading configuration");
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            System.out.println("✅ Build SessionFactory");
            sessionFactory = configuration.buildSessionFactory();
        }

        public static Session getSession()
        {
            Session session = sessionFactory.openSession();
            return session;
        }

        public static void shutdown()
        {
            sessionFactory.close();
            System.out.println("🔒 Session Factory Closed");
        }
    }
