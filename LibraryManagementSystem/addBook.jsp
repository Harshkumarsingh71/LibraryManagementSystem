<% @page contentType ="text/html" pageEncoding ="UTF-8" %>
<html>
<head>
    <title>Add New Book</title>
</head>
<body>
    <h2>Add New Book</h2>
    <form action="AddBookServlet" method="post">
        Book Name: <input type="text" name="bookName" required><br>
        Author Name: <input type="text" name="authorName" required><br>
        Category: <input type="text" name="category" required><br>
        <input type="submit" value="Add Book">
    </form>
    <br>
    <a href="DisplayBooksServlet">Back to List</a>
</body>
</html>
