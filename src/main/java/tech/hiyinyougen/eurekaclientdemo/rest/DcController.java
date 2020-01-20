package tech.hiyinyougen.eurekaclientdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hiyinyougen.eurekaclientdemo.client.DemoClient;

/**
 * @Author yinyg
 * @CreateTime 2020/1/19 09:38
 * @Description
 */
@RestController
public class DcController {

    @Autowired
    DemoClient demoClient;

    @GetMapping("/getAllServices")
    public String getAllServices() {
        return demoClient.getAllServices();
    }

}
