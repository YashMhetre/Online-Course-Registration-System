package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CheckoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("cart");  // Clear cart after checkout
        response.sendRedirect("confirmation.jsp");
    }
}
