package org.example.lr2_corp_java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.lr2_corp_java.model.CalculateSecond;

import java.io.IOException;
import java.util.List;

@WebServlet("/tabulateServlet")
public class TabulateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a=Double.parseDouble(request.getParameter("a"));
        double b=Double.parseDouble(request.getParameter("b"));
        double h=Double.parseDouble(request.getParameter("h"));
        List<Double> result= CalculateSecond.calculateTabulate(a,b,h);
        request.setAttribute("result", result);
        RequestDispatcher dispatcher=request.getRequestDispatcher("result2.jsp");
        dispatcher.forward(request, response);
    }

}
