<%@ page import="java.util.List, model.Product" %>
<jsp:useBean id="products" scope="request" type="java.util.List"/>
<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h1>Available Products</h1>
    <ul>
        <% for (Product p : products) { %>
            <li>
                <%= p.getName() %> - ₹<%= p.getPrice() %>
                <form action="CartServlet" method="post">
                    <input type="hidden" name="productId" value="<%= p.getId() %>">
                    <input type="number" name="quantity" min="1" value="1">
                    <button type="submit">Add to Cart</button>
                </form>
            </li>
        <% } %>
    </ul>
</body>
</html>
