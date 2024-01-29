<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product-Discount</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/display-discount" method="post">
  <input type="text" name="ProductDescription" placeholder="Product Description"/>
  <input type="text" name="ListPrice" placeholder="ListPrice"/>
  <input type="text" name="DiscountPercent" placeholder="Discount Percent"/>
  <button>Kết quả</button>
</form>
</body>
</html>