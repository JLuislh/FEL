package com.mycompany.test;

import java.io.File;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class FELclas {

    private static final String BASE_URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/v2/transform/nuc";
    private static final String AUTHORIZATION_HEADER = "Authorization";
     public static final MediaType MEDIA_TYPE_MARKDOWN
      = MediaType.parse("application/xml");
    private final OkHttpClient client;

    public FELclas() {
        this.client = new OkHttpClient();
    }
    File file = new File("C:\\Complementos\\NUC1.xml");
    public String get(/*String endpoint,*/ String apiKey, String accessToken) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "?" + apiKey)
                .header("Content-Type",   "application/xml")
                .header(AUTHORIZATION_HEADER,   accessToken)
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN, file))
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}