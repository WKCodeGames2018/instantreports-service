package codegames.codefiction.instantreportsservice.rest;

import instantreports.ApiClient;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Client {

    public static ApiClient get() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("");
        apiClient.setConnectTimeout((int) Duration.of(30, ChronoUnit.SECONDS).toMillis());
        apiClient.getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);
        apiClient.getHttpClient().setWriteTimeout(30, TimeUnit.SECONDS);
        apiClient.setDebugging(true);
        return apiClient;
    }
}
