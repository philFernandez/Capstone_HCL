<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
  <script src="/js/products.js"></script>
  <title>Products</title>
</head>
<body>
    <%@ include file="Header.html" %>
  <h1 class="display-1 p-3" align="center">Products</h1>
  <div class="container border border-3 p-4">
    <ul class="nav nav-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="/products">all products</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/instruments">instruments</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/accessories">accessories</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/headphones">headphones</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/vinyl">vinyl</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/disks">cd's</a>
      </li>
    </ul>
    <c:forEach var="product" items="${productList}">
      <li>${product.name}</li>
    </c:forEach>
    </ul>
  </div> 
  
</body>
</html>