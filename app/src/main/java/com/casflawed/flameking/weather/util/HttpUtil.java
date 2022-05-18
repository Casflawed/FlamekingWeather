package com.casflawed.flameking.weather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        // 1.传入url地址
        Request request = new Request.Builder().url(address).build();
        // 2.注册回调处理response
        client.newCall(request).enqueue(callback);
    }
}

