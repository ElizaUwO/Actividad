package packServ;

import modelos.Triangulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.servlet.RequestDispatcher;
import modelos.Operaciones;
import modelos.Implementacion;

/**
 *
 * @author ferna
 */
@WebServlet(name = "ServletXD", urlPatterns = {"/ServletXD"})
public class ServletXD extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
    
    String tablaP = "tabla.jsp";
    String resultados = "resultado.jsp";
    Triangulo figura = new Triangulo();
    Implementacion dao = new Implementacion();
    int id;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String base = request.getParameter("base");
        String area = request.getParameter("altura");
        String ladoA = request.getParameter("ladoA");
        String ladoB = request.getParameter("ladoB");
        String ladoC = request.getParameter("ladoC");
        String ac = "";
        String dir = request.getParameter("accion");

        if (dir.equalsIgnoreCase("BD")) {
            ac = tablaP;
        } else {
            Operaciones oper = new Operaciones();
            String areaFinal = oper.area(base, area);
            String periFinal = oper.perimetro(ladoA, ladoB, ladoC);

            figura.setareasResult(Integer.parseInt(areaFinal));
            figura.setperiResult(Integer.parseInt(periFinal));
            dao.add(figura);

            request.setAttribute("area", areaFinal);
            request.setAttribute("perimetro", periFinal);
            ac = resultados;
        }
        RequestDispatcher vista = request.getRequestDispatcher(ac);
        vista.forward(request, response);
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
