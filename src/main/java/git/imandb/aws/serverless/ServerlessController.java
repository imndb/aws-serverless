package git.imandb.aws.serverless;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class ServerlessController {

    @GetMapping("/helloServerless")
    public String helloServerless() {
        return "serverless is live: "+ OffsetDateTime.now();
    }
}
