package servlet;
import model.Cart;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        int productId = Integer.parseInt(request.getParameter("productId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        cart.addItem(productId, quantity);
        response.sendRedirect("cart.jsp");
    }
}
