package hei.tp03.controller;

import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by N0stress on 17/01/2017.
 */

public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    @Override
    public void init() throws ServletException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        clientService = context.getBean(ClientService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Client> listeclients = clientService.findAll();
        resp.setContentType("text/html");
             PrintWriter out = resp.getWriter();
              for (Client client : listeclients) {
                out.println("<h1>" + client.getNom() + client.getPrenom()+ "</h1>");
            }
        out.close();
    }

    @Override
    public void destroy() {
        context.close();
    }


}
