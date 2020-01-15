package com.example.listener;



import com.example.model.Dog;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext sc = servletContextEvent.getServletContext();

        String dogBreed = sc.getInitParameter("breed");

        Dog d = new Dog(dogBreed);

        sc.setAttribute("dog", d);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
