<%--
  Created by IntelliJ IDEA.
  User: Лёша
  Date: 06.01.2017
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-2 sidenav">
    <h4>Каталог обуви</h4>
    <ul class="nav nav-pills nav-stacked">

        <li class="active"><a href="#section1">Все модели</a></li>
        <li>
            <a href="#demo" class="btn btn-info" data-toggle="collapse">Мужская обувь  <span class="glyphicon glyphicon-menu-down"></span></a>
            <div id="demo" class="collapse">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="do?command=viewgoods&sex=Мужская&type=Ботинки">Ботинки</a></li>
                    <li><a href="do?command=viewgoods&sex=Мужская&type=Туфли">Туфли</a></li>
                    <li><a href="do?command=viewgoods&sex=Детская&type=Кроссовки">Кроссовки</a></li>
                </ul>
            </div>
        </li>
        <li>
            <a href="#demo2" class="btn btn-info" data-toggle="collapse">Женская обувь  <span class="glyphicon glyphicon-menu-down"></span></a>
            <div id="demo2" class="collapse">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="do?command=viewgoods&sex=Женская&type=Ботинки">Ботинки</a></li>
                    <li><a href="do?command=viewgoods&sex=Женская&type=Туфли">Туфли</a></li>
                    <li><a href="do?command=viewgoods&sex=Женская&type=Кроссовки">Кроссовки</a></li>
                </ul>
            </div>
        </li>
        <li>
            <a href="#demo3" class="btn btn-info" data-toggle="collapse">Детская обувь  <span class="glyphicon glyphicon-menu-down"></span></a>
            <div id="demo3" class="collapse">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="do?command=viewgoods&sex=Детская&type=Ботинки">Ботинки</a></li>
                    <li><a href="do?command=viewgoods&sex=Детская&type=Туфли">Туфли</a></li>
                    <li><a href="do?command=viewgoods&sex=Детская&type=Кроссовки">Кроссовки</a></li>
                </ul>
            </div>
        </li>
    </ul><br>
    <div class="input-group">
        <input type="text" class="form-control" placeholder="Поиск на сайте...">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
          </button>
        </span>
    </div>
</div>
