package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create Device
        Device device = new Device();
        device.setBrand("Generic Brand");
        device.setModel("Basic Device");
        device.setPrice(150.0);
        session.persist(device);

        // Create Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(999.0);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("12 MP");
        session.persist(smartphone);

        // Create Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(699.0);
        tablet.setScreenSize("11 inches");
        tablet.setBatteryLife("10 hours");
        session.persist(tablet);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully.");
    }
}
