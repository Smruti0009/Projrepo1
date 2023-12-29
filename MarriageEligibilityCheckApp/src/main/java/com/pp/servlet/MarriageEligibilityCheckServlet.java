package com.pp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageEligibilityCheckServlet extends HttpServlet {
           @Override
        public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        	//get print writer
        	   PrintWriter pw=res.getWriter();
        	   //set response content type
        	   res.setContentType("text/html");
        	   //read the data from req  param value
        	   String name=req.getParameter("pname");
        	   String address= req.getParameter("paddrs");
        	   int age=Integer.parseInt(req.getParameter("page"));
        	   String gender1=req.getParameter("gender");
        	   //String male,female;
        	   if(gender1=="Male") {
        		   if(age>=21) {
        			   pw.println(" <h1 style='color:red;text-align:center'>Mr. "+name+" You are now eligible for marriage... Congratulations ! "+address+" is happy for your marriage</h1>");
        		   pw.println("<a href='marriage_eligibility.html'> <img src='images/wedding.png'> </a>");
        		   }
        		   else {
        			   pw.println("<h1 style='color:red;text-align:center'>Mr. "+name+" You are not eligible for marriage . Please wait "+(21-age)+ "years and plan your marriage</h1>");
        		   pw.println("<a href='marriage_eligibility.html'> <img src='images/home'> </a>");
        	   }
        	   }		   
        	   else {
        		   if(age>=18) {
        			   pw.println("<h1 style='color:red;text-align:center'>Ms. "+name+" You are now eligible for marriage... Congratulations !  perfectpartner.com will take care of your dreams...</h1>");
        		   pw.println("<a href='marriage_eligibility.html'> <img src='images/wedding.png'> </a>");
        		   }
        		   else {
        			   pw.println("<h1 style='color:red;text-align:center'>Ms. "+name+" You are not eligible for marriage . Please wait "+(18-age)+ "years and plan your marriage</h1>");
        		   pw.println("<a href='marriage_eligibility.html'> <img src='images/home.png' > </a>");
        		   }
        	   }
        	   //close obj
        	   pw.close();
        	
        }//doPost
}//class
