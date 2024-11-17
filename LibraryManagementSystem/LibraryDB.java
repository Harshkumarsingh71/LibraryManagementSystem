import java.sql.*;

public class LibraryDB {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password");
        } catch (Exception e) {
            throw new SQLException("Database connection error: " + e.getMessage());
        }
    }

    
    public static ResultSet getAllBooks() {
        ResultSet rs = null;
        try {
            Connection con = getConnection();
            String query = "SELECT * FROM books";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

   
    public static int addBook(String bookName, String authorName, String category) {
        int result = 0;
        try {
            Connection con = getConnection();
            String query = "INSERT INTO books (BookName, AuthorName, Category) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, bookName);
            stmt.setString(2, authorName);
            stmt.setString(3, category);
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    
    public static int updateBook(int bookID, String bookName, String authorName, String category) {
        int result = 0;
        try {
            Connection con = getConnection();
            String query = "UPDATE books SET BookName = ?, AuthorName = ?, Category = ? WHERE BookID = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, bookName);
            stmt.setString(2, authorName);
            stmt.setString(3, category);
            stmt.setInt(4, bookID);
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    
    public static int deleteBook(int bookID) {
        int result = 0;
        try {
            Connection con = getConnection();
            String query = "DELETE FROM books WHERE BookID = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, bookID);
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
