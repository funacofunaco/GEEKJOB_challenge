/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author guest1Day
 */
public class method6 extends HttpServlet {
    
    //ユーザー定義メソッド「userprofile」を作る。idを引数としてセット
    String[] userprofile(int id){
        //三人分の配列データを用意する。
        String[] data1 = {"1","技育太郎","東京","男","プログラマー"};
        String[] data2 = {"2","技育花子","北海道","女","システムエンジニア"};
        String[] data3 = {"3","技育三郎","大阪","男","Webエンジニア"};
        //int型で引数をセットしているので、Stringクラスに変換する
        String strid = String.valueOf(id);
        //もしも、data1のIDとさっき型変換した引数が一致していたら…
        if(data1[0].equals(strid)){
        //変数data1をreturnしてね（戻り値にしてね）
            return data1;
        }else if(data2[0].equals(strid)){
            return data2;
        }else if(data3[0].equals(strid)){
            return data3;
        }else{
            return null;
        }
    };
    

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
            out.println("<title>Servlet method6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet method6 at " + request.getContextPath() + "</h1>");
            String[] selectedPF = userprofile(1);
            
            for(int i = 1; i < selectedPF.length ; i++ ){
                out.println(selectedPF[i]);
                out.println("<br>");
            }
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
