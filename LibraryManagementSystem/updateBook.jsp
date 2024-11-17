<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book Details</h2>
    <form action="UpdateBookServlet" method="post">
        Book ID: <input type="text" name="bookID" value="${param.bookID}" readonly><br>
        Book Name: <input type="text" name="bookName" value="${param.bookName}" required><br>
        Author Name: <input type="text" name="authorName" value="${param.authorName}" required><br>
        Category: <input type="text" name="category" value="${param.category}" required><br>
        <input type="submit" value="Update Book">
    </form>
    <br>
    <a href="DisplayBooksServlet">Back to List</a>
</body>
</html>
