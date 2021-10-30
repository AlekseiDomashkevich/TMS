package lesson22;



import org.apache.hc.client5.http.async.methods.SimpleHttpRequest;
import org.apache.hc.client5.http.async.methods.SimpleHttpRequests;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class ApacheClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
        httpclient.start();
        SimpleHttpRequest request1 = SimpleHttpRequests.get("http://localhost:8082");
        Future<SimpleHttpResponse> future = httpclient.execute(request1, null);
        // and wait until response is received
        SimpleHttpResponse response1 = future.get();
        System.out.println(request1.toString() + "->" + response1.getBody());
        var body = response1.getBody();
        System.out.println(body.getBodyText()                               );
    }
}
