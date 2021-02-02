<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/style/style.css" />
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
  <script src="/js/home.js"></script>
  <title>Lee's Music Shop</title>
</head>
<body style="background-color: rgb(33, 37, 41);">
    <%@ include file="Header.html" %>
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
      <ol class="carousel-indicators">
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"></li>
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"></li>
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"></li>
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3"></li>
      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="/img/logo.jpg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="/img/headphone_girl1.jpg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>Let the beat drop</h5>
            <p>Audiotechnica headphones</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="/img/guitars1.jpg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>Get yer' guitar on</h5>
            <p>Our world famous guit-fiddles</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="/img/records1.jpg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>Vinyl is making a comeback</h5>
            <p>Did someone say hipster.?.?</p>
          </div>
        </div>
      </div>
      <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </a>
    </div>

</body>
</html>