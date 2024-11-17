@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookName = request.getParameter("bookName");
        String authorName = request.getParameter("authorName");
        String category = request.getParameter("category");

        int result = LibraryDB.addBook(bookName, authorName, category);

        if (result > 0) {
            response.sendRedirect("DisplayBooksServlet");
        } else {
            response.getWriter().write("Error adding book");
        }
    }
}
