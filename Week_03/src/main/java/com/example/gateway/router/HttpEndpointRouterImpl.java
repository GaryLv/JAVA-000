package com.example.gateway.router;

import java.util.List;
import java.util.Random;

public class HttpEndpointRouterImpl implements HttpEndpointRouter {
    @Override
    public String route(List<String> endpoints) {
        int num = endpoints.size();
        int i = new Random().nextInt(num);
        return endpoints.get(i);
    }
}
