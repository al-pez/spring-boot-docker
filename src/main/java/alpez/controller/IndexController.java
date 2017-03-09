package alpez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alpez
 * @since 2017-03-09
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "Hello World! This is a Docker sample with spring-boot";
    }
}
