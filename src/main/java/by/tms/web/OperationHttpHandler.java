package by.tms.web;

import by.tms.model.Operation;
import by.tms.service.OperationService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class OperationHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        String[] parameters = query.split("&");
        Map<String, String> mapParameters = new HashMap<>();
        for (int i = 0; i<parameters.length;i++){
            String[] numbers = parameters[i].split("=");
            String key = numbers[0];
            String value = numbers[1];
            mapParameters.put(key, value);
        }
        double num1 = Double.parseDouble(mapParameters.get("num1"));
        double num2 = Double.parseDouble(mapParameters.get("num2"));
        String type = mapParameters.get("type");

        Operation operation = new Operation(num1, num2, type);
        OperationService operationService = new OperationService();


        double result = operationService.calculate(operation).getResult();;


        String stringResult = "Result=" + result;

        exchange.sendResponseHeaders(200, stringResult.length());

        PrintWriter printWriter = new PrintWriter(exchange.getResponseBody());
        printWriter.print(stringResult);
        printWriter.flush();
    }
}
