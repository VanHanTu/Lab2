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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result","---");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String f = request.getParameter("first");
        String s = request.getParameter("second");
        String calc = request.getParameter("calculation");
        
        try
        {
            int fnum = Integer.parseInt(f);
            int snum = Integer.parseInt(s);
            int result ;
            
            if(calc.equals("+"))
            {
                result = fnum + snum;
                request.setAttribute("result",result);
            }
            if(calc.equals("-"))
            {
                result = fnum - snum;
                request.setAttribute("result",result);
            }
            if(calc.equals("*"))
            {
                result = fnum * snum;
                request.setAttribute("result",result);
            }
            if(calc.equals("%"))
            {
                result = fnum / snum;
                request.setAttribute("result",result);
            }
            
        }catch (NumberFormatException e)
        {
            request.setAttribute("result", "You have to put valid number");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

 
}
