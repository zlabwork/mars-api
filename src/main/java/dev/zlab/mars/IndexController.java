package dev.zlab.mars;

import dev.zlab.mars.message.Version;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public Version index() {
        return new Version(200, "success", "v0.0.1");
    }

}
