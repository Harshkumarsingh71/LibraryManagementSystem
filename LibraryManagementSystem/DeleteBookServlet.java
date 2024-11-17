@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookID = Integer.parseInt(request.getParameter("bookID"));
        int result = LibraryDB.deleteBook(bookID);

        if (result > 0) {
            response.sendRedirect("DisplayBooksServlet");
        } else {
            response.getWriter().write("Error deleting book");
        }
    }
}
