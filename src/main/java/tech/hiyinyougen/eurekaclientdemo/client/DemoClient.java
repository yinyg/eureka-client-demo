package tech.hiyinyougen.eurekaclientdemo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author yinyg
 * @CreateTime 2020/1/19 14:41
 * @Description
 */
@FeignClient(name = "eureka-client-default")
public interface DemoClient {

    @GetMapping("/getAllServices")
    String getAllServices();

}
