package servlet;
import dao.ProductDAO;
import model.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.getAllProducts();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);
    }
}
