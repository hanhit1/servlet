package com.servlet.servlet.controller.web;
import com.servlet.servlet.model.UserModel;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 2686801510274002166L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserModel userModel = new UserModel();
        userModel.setFullName("hehe");
        req.setAttribute("model", userModel);
        RequestDispatcher rd= req.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
