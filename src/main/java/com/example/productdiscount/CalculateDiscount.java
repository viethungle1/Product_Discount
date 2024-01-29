package com.example.productdiscount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/display-discount")
public class CalculateDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("ProductDescription");
        float price = Float.parseFloat(req.getParameter("ListPrice"));
        float discount = Float.parseFloat(req.getParameter("DiscountPercent"));
        float discountAmount = price * discount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: "+description+"<h2>");
        writer.println("<h2>List Price: "+price+"<h2>");
        writer.println("<h2>Discount Percent: "+discount+"<h2>");
        writer.println("-----------------------------------------");
        writer.println("<h2>Discount Amount: "+discountAmount+"<h2>");
        writer.println("</html>");
    }
}
