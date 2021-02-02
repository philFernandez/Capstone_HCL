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
  <title>Products</title>
</head>

<body>
  <%@ include
      file="Header.html"
      %>
    <h1 class="display-1 p-3"
        align="center">Our Products</h1>
    <!-- <h1 class="display-6" align="center">Welcome ${cart.getPrincipal().getName()}!</h1> -->
    <div class="container border border-3 p-4">
      <div class="container">
        <ul class="nav nav-tabs">
          <li class="nav-item">
            <a class="nav-link active"
               href="/products">All Products</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"
               href="/products/instruments">Instruments</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"
               href="/products/accessories">Accessories</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"
               href="/products/headphones">Headphones</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"
               href="/products/vinyl">Vinyl</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"
               href="/products/disks">CD's</a>
          </li>

      </div>
      <div class="container p-4">
        <c:forEach var="product"
                   items="${cart.allProducts()}">
          <div class="card p-4 d-block"
               style="width: 18rem;">
            <img src="/img/${product.name}.jpg"
                 class="card-img-top"
                 alt="...">
            <div class="card-body">
              <p class="card-text">${product.name}</p>
              <p class="card-text">$${product.price}</p>
              <p class="card-text">${product.category}</p>
            </div>
            <div class="container">
              <form action="/products/${product.id}"
                    method="GET"
                    >
                <button type="submit"
                        class="btn btn-primary"
                        data-bs-toggle="modal"
                        data-bs-target="#exampleModal${product.id}">
                  Buy <i class="bi bi-cart3"></i>
                </button>
              </form>

            </div>
          </div>
          <br>
          <hr>
        </c:forEach>
      </div>
    </div>

</body>

</html>