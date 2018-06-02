/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tuans
 */
public class CalculateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //create a form
            String first,second,result,op;
            //if user click on compute button
            first=second=op=result="";
            if(request.getParameter("btnCompute")!=null){
                first=request.getParameter("first");
                second=request.getParameter("second");
                op=request.getParameter("operator");
                if (op.equals("+")) 
                    result=String.valueOf(Double.valueOf(first)+Double.valueOf(second));
                else if (op.equals("-")) result=String.valueOf(Double.valueOf(first)-Double.valueOf(second));
                else if (op.equals("*")) result=String.valueOf(Double.valueOf(first)*Double.valueOf(second));
                else if (op.equals("/")) result=String.valueOf(Double.valueOf(first)/Double.valueOf(second));
                
            }
            out.println("<form><p>First: <input type='text' name='first' value="+first+">"
                    +"<p>Second: <input type='text' name='second' value="+second+">"
                    +"<p>Operator: <select name='operator' value="+op+"> "
                    +"<option value='+' "+(op.equals("+")?"Selected":"")+">+</option>"
                    +"<option value='-' "+(op.equals("-")?"Selected":"")+">-</option>"
                    +"<option value='*' "+(op.equals("*")?"Selected":"")+">*</option>"
                    +"<option value='/' "+(op.equals("/")?"Selected":"")+">/</option>"
                    +"</select>"
                    +"<p><input type='submit' name='btnCompute' value='Compute'>"
                    +"<p>Result: <input type='text' name='result' readonly value="+result+">"
                    +"</form>"
            );
            //calculate and output result
            //out.println("<h1>Servlet CalculateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
