@WebServlet("/DisplayBooksServlet")
public class DisplayBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet rs = LibraryDB.getAllBooks();
        request.setAttribute("books", rs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("displayBooks.jsp");
        dispatcher.forward(request, response);
    }
}
