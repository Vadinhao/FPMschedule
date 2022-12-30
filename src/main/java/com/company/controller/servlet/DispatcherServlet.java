package com.company.controller.servlet;

import com.company.controller.command.Command;
import com.company.controller.command.factory.CommandFactory;
import com.company.controller.command.utils.CommandUtil;
import com.company.model.exception.NotFoundOperationException;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(DispatcherServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            doPost(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String path = req.getRequestURI();

        path = path.substring(path.indexOf("view") - 1);
        logger.info(path);
        Command command;
        try {
            command = CommandFactory.getCommand(path);
            logger.info(path);
            command.execute(req, resp);
        } catch (NotFoundOperationException e) {
            logger.info("not found in controller");
            CommandUtil.goToPage(req, resp, "/WEB-INF/view/errorPage.jsp");
        }

    }
}