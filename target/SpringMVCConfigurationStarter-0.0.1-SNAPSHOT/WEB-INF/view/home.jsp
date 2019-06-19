<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome to NoteIt</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li><a href="#">Feedback</a></li>
    </ul>
    <p class="navbar-text">Contact : +92332-3020495</p>
</nav>

<div class="container">
    <div class="row col-md-12">
        <form class="form-inline" action="/action_page.php">
            <div class="form-group">
                <label for="search">Search</label>
                <input type="text" class="form-control" id="search">
            </div>
            <button type="button" class="btn btn-default">+ New Note</button>
            <button type="button" class="btn btn-default">+ New Notebook</button>
        </form>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    <span class="glyphicon glyphicon-list-alt"></span>
                    All</a>
                <a href="#" class="list-group-item">
                    <span class="glyphicon glyphicon-list-alt"></span>
                    Default
                    <span class="glyphicon align-content-end glyphicon-trash"></span>
                </a>
                <a href="#" class="list-group-item">
                    <span class="glyphicon glyphicon-list-alt"></span>
                    Quotes
                    <span class="glyphicon align-content-end glyphicon-trash"></span>
                </a>
            </div>
        </div>
        <div class="col-md-8">
            <h1>All Notes</h1>
            <p>Sorry no notes available :(</p>
        </div>
    </div>
</div>
</body>
</html>