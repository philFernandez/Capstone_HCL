<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
      crossorigin="anonymous"
    ></script>
    <title>Register</title>
  </head>
  <body>
    <%@ include file="Header.html" %>
    <div class="container">
      <h1 class="display-3 pb-5 pt-3" align="center">Login</h1>
      <form:form modelAttribute="user" class="form-control p-4">
        <form:label path="username" class="form-label">User Name</form:label>
        <form:input placeholder="John Doe" path="username" type="text" class="form-control" required="required" />
        <br>
        <form:label path="password" class="form-label">Password</form:label>
        <form:input placeholder="Enter a password" path="password" type="password" class="form-control" required="required" />
        <br><br>
        <button class="btn btn-success">Register</button>
      </form:form>
    </div>
  </body>
</html>
