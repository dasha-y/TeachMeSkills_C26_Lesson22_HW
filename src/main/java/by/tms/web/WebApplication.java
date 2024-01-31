package by.tms.web;

import by.tms.Application;
import com.sun.net.httpserver.HttpServer;
import lombok.SneakyThrows;

import java.net.InetSocketAddress;

public class WebApplication implements Application {
    @SneakyThrows
    @Override
    public void run() {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 8080), 1);
        httpServer.createContext("/calculate", new OperationHttpHandler());
        httpServer.start();
    }
}
