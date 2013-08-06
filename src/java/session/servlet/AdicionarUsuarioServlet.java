package session.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.data.UsuarioDAO;
import session.model.Usuario;

/**
 *
 * @author Renann
 */
@WebServlet(name = "AdicionarUsuarioServlet", urlPatterns = {"/AdicionarUsuarioServlet"})
public class AdicionarUsuarioServlet extends HttpServlet {
    private String data_n;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String nome = request.getParameter("nome");
        String data = request.getParameter("data_n");
        String prat = request.getParameter("prat_f");
        String tipo_atv = request.getParameter("tipo_atv");
        String tel = request.getParameter("tel");
        String ender = request.getParameter("ender");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String pais = request.getParameter("pais");
        String sexo = request.getParameter("sexo");
        String email = request.getParameter("e-mail"); 
            
      
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setData_n(data);
        usuario.setPrat_f(prat);
        usuario.setTipo_atv(tipo_atv);
        usuario.setTel(tel);
        usuario.setEnder(ender);
        usuario.setBairro(bairro);
        usuario.setCidade(cidade);
        usuario.setEstado(estado);
        usuario.setPais(pais);
        usuario.setSexo(sexo);
        usuario.setEmail(email);
        
        
        
        UsuarioDAO dao = new UsuarioDAO();
        dao.adiciona(usuario);
        out.print("gravado");
        //response.sendRedirect("");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdicionarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdicionarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdicionarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
