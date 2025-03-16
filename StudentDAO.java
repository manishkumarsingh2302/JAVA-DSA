/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.dao;

import com.ram.bean.StudentBean;
import com.ram.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAO {
  static Connection conn;
    public int addStudent(StudentBean sb){
        //step1
        //step2
        conn=ConnectionPool.connectDB();
        //step3: Write SQL Query
        int total=sb.getP()+sb.getC()+sb.getM()+sb.getH()+sb.getE();
        float per=total/5.0f;
        String sql="insert into student(sid,name,enroll,p,c,m,h,e,per,total) values('"+sb.getSid()+"','"+sb.getName()+"','"+sb.getEnroll()+"','"+sb.getP()+"','"+sb.getC()+"','"+sb.getM()+"','"+sb.getH()+"','"+sb.getE()+"','"+per+"','"+total+"')";
        int r=0;
      try {
          //step4: Create Object of Statement
          Statement stmt=conn.createStatement();
          //step5: call executeUpdate()
          r=stmt.executeUpdate(sql);
          //step6: Close the Connection
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        return r;
    }
   
    public int updateStudent(StudentBean sb){
        //step1
        //step2
        conn=ConnectionPool.connectDB();
        //step3: Write SQL Query
        int total=sb.getP()+sb.getC()+sb.getM()+sb.getH()+sb.getE();
        float per=total/5.0f;
        String sql="update student set name='"+sb.getName()+"',enroll='"+sb.getEnroll()+"',p='"+sb.getP()+"',c='"+sb.getC()+"', m='"+sb.getM()+"',h='"+sb.getH()+"',e='"+sb.getE()+"',total='"+total+"',per='"+per+"'  where sid='"+sb.getSid()+"'";
        int r=0;
      try {
          //step4: Create Object of Statement
          Statement stmt=conn.createStatement();
          //step5: call executeUpdate()
          r=stmt.executeUpdate(sql);
          //step6: Close the Connection
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        return r;
    }
    public int deleteStudent(int sid){
        //step1:
        //step2:
        conn=ConnectionPool.connectDB();
        int r=0;
        //step3: Write SQL Query
        String sql="delete from student where sid='"+sid+"'";
      try {
          //step4: Create Object of Statement
          Statement stmt=conn.createStatement();
          //step5: call executeUpdate()
          r=stmt.executeUpdate(sql);
          //step6: Close the Connection
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        return r;
    }
   
    public ArrayList<StudentBean> findAll(){
        //step1:
        //step2:
        conn=ConnectionPool.connectDB();
        ArrayList<StudentBean> list=new ArrayList<StudentBean>();
        //step3: Write SQL Query select
        String sql="select * from student";
      try {
          //step4: Create an Object of Statement
          Statement stmt=conn.createStatement();
          //step5: Call executeQuery method
          ResultSet rs=stmt.executeQuery(sql);
          //step6: Extract data from the ResultSet and add into ArrayList
          while(rs.next()){
              StudentBean x=new StudentBean();
              //step1: Fetch data from resultSet and Set Into the Bean
              x.setSid(rs.getInt("sid"));
              x.setName(rs.getString("name"));
              x.setEnroll(rs.getString("enroll"));
              x.setP(rs.getInt("p"));
              x.setC(rs.getInt("c"));
              x.setM(rs.getInt("m"));
              x.setH(rs.getInt("h"));
              x.setE(rs.getInt("e"));
              x.setTotal(rs.getInt("total"));
              x.setPer(rs.getFloat("per"));
             
              //step2: add bean object into list
              list.add(x);
          }
          //step7: Close the Connection
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        return list;
    }
     public StudentBean findById(int id){
        //step1:
        //step2:
        conn=ConnectionPool.connectDB();
       //step3: Write SQL Query select
       StudentBean x=new StudentBean();
        String sql="select * from student where sid='"+id+"'";
      try {
          //step4: Create an Object of Statement
          Statement stmt=conn.createStatement();
          //step5: Call executeQuery method
          ResultSet rs=stmt.executeQuery(sql);
          //step6: Extract data from the ResultSet and add into ArrayList
               
          while(rs.next()){
         
              //step1: Fetch data from resultSet and Set Into the Bean
              x.setSid(rs.getInt("sid"));
              x.setName(rs.getString("name"));
              x.setEnroll(rs.getString("enroll"));
              x.setP(rs.getInt("p"));
              x.setC(rs.getInt("c"));
              x.setM(rs.getInt("m"));
              x.setH(rs.getInt("h"));
              x.setE(rs.getInt("e"));
              x.setTotal(rs.getInt("total"));
              x.setPer(rs.getFloat("per"));
             
              //step2: add bean object into list
             
          }
          //step7: Close the Connection
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
       
        return x;
    }
    public static void main(String[] args) {
        //4. call findAll Method
StudentDAO sd=new StudentDAO();
ArrayList<StudentBean> al=sd.findAll();
for(StudentBean s:al){
    System.out.println("\t"+s.getSid()+"\t"+s.getName()+"\t"+s.getEnroll()+"\t"+s.getP()+"\t"+s.getC()+"\t"+s.getM()+"\t"+s.getH()+"\t"+s.getE()+"\t"+s.getTotal()+"\t"+s.getPer());
}

//        StudentBean sb=new StudentBean();
//        sb.setC(67);
//        sb.setE(78);
//        sb.setEnroll("011Cs1");
//        sb.setH(67);
//        sb.setM(66);
//        sb.setP(55);
//        sb.setName("XXXXX");
//        sb.setSid(105);
//        StudentDAO sd=new StudentDAO();
//        int result=sd.addStudent(sb);
//        if(result>0){
//            System.out.println("Student Added Success");
//        }else{
//            System.out.println("Student  Not Added");
//        }

////3. Call deletestudent()
//StudentDAO sd=new StudentDAO();
//int x=sd.deleteStudent(101);
//if(x>0){
//    System.out.println("Data Deletion success");
//}else{
//    System.out.println("Data Deletion Fail");
//}

    }
}

Add class comment…


Announcement: "ViewStudent(Servlet) please execute…"
Ram Lovewanshi
Created Mar 8Mar 8
ViewStudent(Servlet) please execute this before class
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.controller;

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ViewStudent extends HttpServlet {

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
            out.println("<title>Servlet ViewStudent</title>");            
            out.println("</head>");
            out.println("<body>");
          out.println(" <h1>All Student Data</h1>");
         out.println("<table border='1' align='center'>");
             out.println("<tr>");
                 out.println("<th>SID</th>");
                 out.println("<th>NAME</th>");
                 out.println("<th>ENROLL</th>");
                out.println(" <th>P</th>");
                 out.println("<th>C</th>");
                 out.println("<th>M</th>");
                 out.println("<th>H</th>");
                 out.println("<th>E</th>");
                 out.println("<th>Total</th>");
                out.println(" <th>Percentage</th>");
                out.println(" <th>EDIT</th>");
                 out.println("<th>DELETE</th>");
             
             out.println("</tr>");
             StudentDAO sd=new StudentDAO();
             ArrayList<StudentBean> all=sd.findAll();
             for(StudentBean s:all){
             out.println("<tr>");
                 out.println("<td>"+s.getSid()+"</td>");
                 out.println("<td>"+s.getName()+"</td>");
                 out.println("<td>"+s.getEnroll()+"</td>");
                 out.println("<td>"+s.getP()+"</td>");
                out.println(" <td>"+s.getC()+"</td>");
                out.println(" <td>"+s.getM()+"</td>");
                 out.println("<td>"+s.getH()+"</td>");
                 out.println("<td>"+s.getE()+"</td>");
                 out.println("<td>"+s.getTotal()+"</td>");
                 out.println("<td>"+s.getPer()+"</td>");
                 out.println("<td><a href=''>EDIT</a></td>");
                out.println(" <th><a href=''>DELETE</a></th>");
             
            out.println(" </tr>");
             }
         out.println("</table>");
                       
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