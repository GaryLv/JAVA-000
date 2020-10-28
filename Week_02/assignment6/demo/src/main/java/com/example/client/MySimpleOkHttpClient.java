package com.example.client;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class MySimpleOkHttpClient {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().get().url("http://localhost:8808/test").build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                System.out.println("wtf");
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                System.out.println("Received from netty server: " + response.body().string());
            }
        });
    }
}
