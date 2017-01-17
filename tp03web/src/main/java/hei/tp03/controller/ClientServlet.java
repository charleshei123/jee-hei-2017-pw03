package hei.tp03.controller;

import hei.tp03.service.ClientService;
import org.springframework.context.ConfigurableApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by N0stress on 17/01/2017.
 */
public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }


}
