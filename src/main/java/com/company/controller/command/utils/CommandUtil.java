package com.company.controller.command.utils;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class CommandUtil {
    private static final Logger logger = Logger.getLogger(CommandUtil.class);
    private CommandUtil() {
    }


    public static void goToPage(HttpServletRequest req, HttpServletResponse resp, String url) throws IOException {
        logger.info("goToPage() has started");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(url);

        logger.info(url);
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            logger.error(e);
        }
    }
}
