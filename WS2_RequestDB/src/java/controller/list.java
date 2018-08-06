/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.EmployeeDAO;
import dal.RequestDAO;
import entity.Employee;
import entity.Request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tuans
 */
public class list extends HttpServlet {

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
            String label=request.getParameter("label");
            String empID=request.getParameter("empID");
            if (label!=null){
                if (label.equals("Approve")){
                    new RequestDAO().setStatus("Approved", Integer.parseInt(empID));
                }else{
                    new RequestDAO().setStatus("Rejected", Integer.parseInt(empID));
                }
            }
//            if (request.getParameter("btnApprove")!=null){
//                new RequestDAO().setStatus("Approved", Integer.parseInt(empID));
//            }else if (request.getParameter("btnReject")!=null){
//                new RequestDAO().setStatus("Rejected", Integer.parseInt(empID));
//            }
            int checkBonusCol=0;
            RequestDAO resDAO=new RequestDAO();
            ArrayList<Request> listEmp=resDAO.selectAll();
            String selectedID=request.getParameter("selectedID");
            if (selectedID!=null && !selectedID.equals("ALL")){
                listEmp=resDAO.selectByEmpID(Integer.parseInt(selectedID));
            }
            for (Request tempRes:listEmp){
                if (tempRes.getStatus().equals("Processing")){
                    checkBonusCol=1;
                }
            }
            ArrayList<Employee> listNameEmp=new EmployeeDAO().selectAll();
            request.setAttribute("listEmp", listEmp);
            request.setAttribute("checkBonusCol", checkBonusCol);
            request.setAttribute("listNameEmp", listNameEmp);
            request.getRequestDispatcher("/listEmployee.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(list.class.getName()).log(Level.SEVERE, null, ex);
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
