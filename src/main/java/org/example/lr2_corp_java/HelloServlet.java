package org.example.lr2_corp_java;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.lr2_corp_java.model.Calculate;
import org.example.lr2_corp_java.model.SumResult;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e1 = Double.parseDouble(request.getParameter("e1"));
        double e2 = Double.parseDouble(request.getParameter("e2"));
        Calculate calculate=new Calculate(x);
        double nSum= calculate.calculateSum(n);
        SumResult e1Result = calculate.calculateSumThr(n, e1);
        SumResult e2Result = calculate.calculateSumThr(n, e2);
        double exactVal=calculate.exactVal();
        request.setAttribute("nSum", nSum);
        request.setAttribute("e1Sum", e1Result.getSum());
        request.setAttribute("e1Count", e1Result.getCount());
        request.setAttribute("e2Sum", e2Result.getSum());
        request.setAttribute("e2Count", e2Result.getCount());
        request.setAttribute("exactVal",exactVal);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

}