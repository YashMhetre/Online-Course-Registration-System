<%@ page import="model.Cart, java.util.Map" %>
<jsp:useBean id="cart" scope="session" type="model.Cart"/>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h1>Your Cart</h1>
    <form action="CheckoutServlet" method="post">
        <button type="submit">Checkout</button>
    </form>
</body>
</html>
