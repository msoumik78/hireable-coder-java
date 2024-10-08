import com.example.demo.HttpClientExample;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class AppTest
{

    HttpClientExample httpClientExample;

    @BeforeEach
    void setUp() {
        httpClientExample = new HttpClientExample();
    }

    @Test
    public void checkResponseFromHttpEndpoint()
    {
      Awaitility
        .with().pollInterval(Duration.ofMillis(500))
        .and().with().pollDelay(20, MILLISECONDS)
        .await()
        .atMost(10, TimeUnit.SECONDS)
        .until(() -> (HttpClientExample.invokeGETEndpoint() == 200));
      System.out.println("Test success");
    }

}
