package controlador;

import dao.CompaniaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Compania;


@WebServlet(urlPatterns = {"/compania"})
public class CompaniaControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // DAO para ser usado no servlet
    CompaniaDAO pdao = new CompaniaDAO();

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

        // ações get:
        // sem parâmetro: recuperar todos os elementos
        // com parâmetro r: recuperar elemento individual
        // com parâmetro d: excluir elemento
        // com parâmetro f: abrir formulário de inclusão

        String retrieve = request.getParameter("r");
        String delete = request.getParameter("d");
        String form = request.getParameter("f");

        if (form != null) {
            getServletContext().getRequestDispatcher("/form.jsp")
                    .forward(request, response);
        } else { // exibe todos
            // obtém dados
            ArrayList<Compania> registros = pdao.retornarCompanias();
            // insere no request
            request.setAttribute("registros", registros);
            // encaminha a resposta
            getServletContext().getRequestDispatcher("/listar.jsp").forward(request, response);
            //response.sendRedirect(request.getContextPath() + "/listar.jsp");
        }
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

        // configuração para corrigir questões de acento
        request.setCharacterEncoding("utf8");

        String nome = request.getParameter("nome");

        Compania nova = new Compania(nome);
        pdao.incluirCompania(nova);

        request.setAttribute("msg", "Compania incluída com sucesso");
        getServletContext().getRequestDispatcher("/mensagem.jsp").forward(request, response);
        //response.sendRedirect("mensagem.jsp");
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