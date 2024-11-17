@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookID = Integer.parseInt(request.getParameter("bookID"));
        String bookName = request.getParameter("bookName");
        String authorName = request.getParameter("authorName");
        String category = request.getParameter("category");

        int result = LibraryDB.updateBook(bookID, bookName, authorName, category);

        if (result > 0) {
            response.sendRedirect("DisplayBooksServlet");
        } else {
            response.getWriter().write("Error updating book");
        }
    }
}
