package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        String c = request.getParameter("color");
        String c1 = request.getParameter("body");

        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        List result1 = be.getBrands(c1);


        
        request.setAttribute("styles", result);
        request.setAttribute("types", result1);
        request.setAttribute("config", getServletConfig().getInitParameter("adminEmail"));
        request.setAttribute("context", getServletContext().getInitParameter("mainEmail"));

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        try {
            view.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }


//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        out.println("Beer Selection Advice<br>");
//        List c = BeerExpert.getBrands(request.getParameter("color"));
//        Iterator iterator = c.iterator();
//        while (iterator.hasNext()) {
//            out.println("<br>Results " + iterator.next());
//        }
    }
}
