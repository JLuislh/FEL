package com.mycompany.test;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RestApiClient {

    private static final String BASE_URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/Shared";
    //private static final String API_KEY_PARAM = "TAXID=000044653948&DATA1=SHARED_GETINFONITcom&DATA2=NIT|44653948&COUNTRY=GT&USERNAME=JULIOCIF";
    private static final String AUTHORIZATION_HEADER = "Authorization";

    private OkHttpClient client;

    public RestApiClient() {
        this.client = new OkHttpClient();
    }

    public String get(String endpoint, String apiKey, String accessToken) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "?" + apiKey)
                .header("Content-Type",   "application/xml")
                .header(AUTHORIZATION_HEADER,   accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}