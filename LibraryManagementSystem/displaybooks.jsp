<% @page contentType ="text/html" pageEncoding ="UTF-8" %>
<html>
<head>
    <title>Library Management</title>
</head>
<body>
    <h2>Library Books</h2>
    <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Author Name</th>
            <th>Category</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.BookID}</td>
                <td>${book.BookName}</td>
                <td>${book.AuthorName}</td>
                <td>${book.Category}</td>
                <td>
                    <a href="updateBook.jsp?bookID=${book.BookID}">Edit</a> | 
                    <a href="DeleteBookServlet?bookID=${book.BookID}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="addBook.jsp">Add New Book</a>
</body>
</html>
