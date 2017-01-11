<%--
  Created by IntelliJ IDEA.
  User: Лёша
  Date: 06.01.2017
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            background-color: #003366;
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-bottom: 0;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
    </style>

</head>
<body>

<div class="jumbotron">
    <div class="container text-center">
        <h1>Магазин модной обуви</h1>
        <p>Mission, Vission & Values</p>
    </div>
</div>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="do?command=index">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="do?command=index"><span class="glyphicon glyphicon-home"></span>  На главную</a></li>

                <!-- Начало блока с выподающим списком -->

                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Каталог обуви<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="do?command=viewgoods&sex=Мужская">Мужкая</a></li>
                        <li><a href="do?command=viewgoods&sex=Женская">Женская</a></li>
                        <li><a href="do?command=viewgoods&sex=Детская">Детская</a></li>
                    </ul>
                </li>

                <!-- Конец блока с выподающим списком -->

                <li><a href="do?command=delivery">Доставка</a></li>
                <li><a href="do?command=payment">Оплата</a></li>
                <li><a href="do?command=contacts" >Контакты</a></li>
            </ul>


            <!-- Выпадающий логин начало-->


            <ul class="nav navbar-nav navbar-right">

                <c:choose>
                    <c:when test="${user==null}">

                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Войти<span class="glyphicon glyphicon-log-in"></span></a>
                            <div class="dropdown-menu">
                                <form id="formLogin" class="form container-fluid" action="do?command=login" method="POST">
                                    <div class="form-group">
                                        <label for="login">Имя:</label>
                                        <input id="login" name="login" type="text" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="password">Пароль:</label>
                                        <input id="password" name="password" type="password" class="form-control">
                                    </div>
                                    <button type="submit" id="btnLogin" class="btn btn-primary btn-block">Войти</button>
                                </form>
                                <div class="container-fluid">
                                    <br>
                                    <a class="small" href="#">Забыли пароль?</a>
                                    <a class="small" href="do?command=signup">Зарегистрироваться</a>
                                </div>
                            </div>
                        </li>
                        <li><a href="do?command=signup">Регистрация <span class="glyphicon glyphicon-registration-mark"></span></a></li>

                    </c:when>
                    <c:otherwise>

                        <li><a href="do?command=mybasket"><span class="glyphicon glyphicon-shopping-cart"></span> Моя корзина <span class="badge">5</span></a></li>
                        <li><a href="do?command=myliked"><span class="glyphicon glyphicon-star"></span> Избранное <span class="badge">5</span></a></li>
                        <li><a href="do?command=logout"><span class="glyphicon glyphicon-log-out"></span> Выйти</a></li>

                    </c:otherwise>
                </c:choose>


            </ul>
        </div>
    </div>
</nav>

