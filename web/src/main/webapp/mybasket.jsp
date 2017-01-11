<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/top.jsp" %>

<div class="container-fluid">
    <div class="row content">

        <%@ include file="include/usercub_menu.jsp" %>

        <div class="col-sm-10">

            <ul class="nav nav-pills">
                <li>
                    <div class="col-sm-12">
                        <div class="col-sm-1">
                            Date
                        </div>
                        <div class="col-sm-4">
                            <div class="media">
                                <div class="media-left">
                                    <img src="http://www.rossomaha.ru/images/article/30.jpg" class="media-object" style="width:100px">
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">Заказ</h4>
                                    <p>Lorem ipsum...</p>
                                </div>
                            </div>
                        </div>
                        <div class = "col-sm-4">

                        </div>
                        <div class="col-sm-4">
                            <div class="btn-group-vertical">
                                <a href="do?command=buy&id=#" class="btn btn-primary">Заказать</a>
                                <a href="do?command=delete&id=#" class="btn btn-primary">Удалить</a>
                            </div>
                        </div>
                    </div>
                </li>


            </ul>
        </div>
    </div>
</div><br>


<%@ include file="include/end.jsp" %>
