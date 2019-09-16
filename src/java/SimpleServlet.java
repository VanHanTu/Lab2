/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 759841
 */
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/LAB2.jsp")
                .forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numberAge = request.getParameter("age");
        try
        {
                 int age = Integer.parseInt(numberAge);
                 age = age +1;
                 request.setAttribute("nAge", age);
        }
        catch(NumberFormatException e)
        {
                 
                 request.setAttribute("nAge", "You have to put valid number");
        } 
        
        
       
        
        getServletContext().getRequestDispatcher("/WEB-INF/LAB2.jsp").forward(request, response);
       
    }

}
