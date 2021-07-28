import Demo.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {""})
public class ProductServlet extends HttpServlet {
    static ArrayList<Product> list = new ArrayList<>();
    static {
        list.add(new Product("thao", "14/10/1999", "Hung yen", "copy.jpg"));
        list.add(new Product("thu", "15/10/1999", "Hung yen", "Banner.jpg"));
        list.add(new Product("thu", "15/10/1999", "Hung yen", "Banner.jpg"));
        list.add(new Product("thu", "15/10/1999", "Hung yen", "Banner.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // thêm cặp key - value vào request để gửi.
        request.setAttribute("listSP", list);

        // RequestDispatcher điều hướng request và response sang 1 servlet or jsp khác.
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("ShowSP.jsp");

        // chuyển tếp request và reponse đi cho thằng servlet khác sử lý.
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String address = request.getParameter("address");
        String image = request.getParameter("image");

        list.add(new Product(name,date,address,image));

        request.setAttribute("listSP", list);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("ShowSP.jsp");
        dispatcher.forward(request, response);
    }
}

