<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/top.jsp" %>

<div class="container-fluid">
  <div class="row content">

      <%@ include file="include/index_menu.jsp" %>
		


<div class="col-sm-10">
<div class="container">
  <div class="row">
<c:forEach items="${shoess}" var="shoes">
	<div class="col-sm-3">
      <div class="panel panel-danger">
        <div class="panel-heading">Обувь ${shoes.sex}</div>
        <div class="panel-body">
            <img src="${shoes.image}" class="img-responsive" width="400" height="500" alt="Image">
            <p style="text-align: center;">Цвет : ${shoes.color}</p>
            <p style="text-align: center;">Модель : ${shoes.type}</p>
            <p style="text-align: center;">Цена : ${shoes.price}</p>
        </div>
        <div class="panel-footer">
			<div class="btn-group btn-group-justified">
				<a href="do?command=buy&id=${shoes.id}" class="btn btn-primary"><span class="glyphicon glyphicon-credit-card"></span></a>
				<a href="do?command=addtobasket&id=${shoes.id}" class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span></a>
				<a href="do?command=addtoliked&id=${shoes.id}" class="btn btn-primary"><span class="glyphicon glyphicon-star"></span></a>
            </div>
		</div>
      </div>
    </div>

</c:forEach>
</div>
  </div>
 
</div>
</div>
      <%@ include file="include/end.jsp" %>