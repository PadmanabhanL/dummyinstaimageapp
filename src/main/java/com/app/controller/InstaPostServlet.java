package com.app.controller;

import com.app.bo.Post;
import com.app.service.PostService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class InstaPostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PostService postService = new PostService();
        List<Post> posts = postService.loadAll();

        req.getSession().setAttribute("posts", posts);

        // Forward the request to the JSP page
        req.getRequestDispatcher("/WEB-INF/jsp/posts.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String postId = req.getParameter("postId");
        PostService postService = new PostService();
        postService.deletePost(postId);
    }
}
