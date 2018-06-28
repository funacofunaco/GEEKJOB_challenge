/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hikisu;

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
public class method3 extends HttpServlet {
    //サーブレットクラス内にメソッドを作成する
    //練習
    void kakeru2(int num, PrintWriter pw)
    {
        pw.print(num+"の2乗は、"+(num*num));
    }
    //課題内容
    void multiplication(int num1,int num2 ,boolean tf,PrintWriter pw){
        
        int answer = num1 * num2;
        if(tf == true){
            answer = answer * answer;
        pw.print(answer);
        }
    }
    
    //デフォルト値を設定
    //練習
    void kakeru2(PrintWriter pw){
        kakeru2(100, pw);
    }
    //課題内容
    void multiplication(boolean tf, PrintWriter pw){
        multiplication(1, 2, tf,pw);
    }
    //勝手に作ってるやつ
    //num1
    //void multiplication(int num1,boolean tf, PrintWriter pw){
        //multiplication(2, false, pw);
    //}
    //void multiplication(boolean tf, int num2,PrintWriter pw){
        //multiplication(false, 2, pw);
    //}
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
            out.println("<title>Servlet method3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet method3 at " + request.getContextPath() + "</h1>");
            out.println("四つの引数を使うと<br>");
            multiplication(3,3,true,out);
            out.println("<br>");
            out.println("二つの引数を使うと<br>");
            multiplication(true,out);
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
