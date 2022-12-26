package com.springbook.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setCharacterEncoding("EUC-KR");
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        // 1. 클라이언트의 요청 path 정보를 추출한다.
        String uri = request.getRequestURI();
        String path = uri.substring(uri.lastIndexOf("/"));
        System.out.println(path);

        // 2. 클라이언트의 요청 path에 따라 적절히 분기처리 한다.
        if (path.equals("/login.do")) {
            System.out.println("login");
        } else if (path.equals("/logout.do")) {
            System.out.println("logout");
        } else if (path.equals("/insertBoard.do")) {
            System.out.println("insert board");
        } else if (path.equals("/updateBoard.do")) {
            System.out.println("update board");
        } else if (path.equals("/deleteBoard.do")) {
            System.out.println("delete board");
        } else if (path.equals("/getBoard.do")) {
            System.out.println("get board");
        } else if (path.equals("/getBoardList.do")) {
            System.out.println("get board list");
        }
    }
}
