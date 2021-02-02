<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, initial-scale=1.0">
  <link rel="preconnect"
        href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Unkempt:wght@700&display=swap"
        rel="stylesheet">
  <link rel="stylesheet"
        href="/style/style.css" />
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
        crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
          crossorigin="anonymous"></script>
  <script src="/js/products.js"></script>
  <title>Shopping Cart</title>
</head>

<body>
  <%@ include
      file="Header.html"
      %>
    <h1 class="display-1 p-3" align="center">Shopping Cart</h1>
    <div class="container">
      <table class="table table-dark">
        <tr>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Price</th>
        </tr>

      <c:forEach var="product" items="${cart.getShoppingCart()}">
        <tr class="table-light">
          <td>${product.name}</td>
          <td>${product.category}</td>
          <td>${product.description}</td>
          <td>$${product.price}</td>
        </tr>

      </c:forEach>
      </table>
    </div>

</body>

</html>