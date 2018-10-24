package com.wujc.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wujc
 * @ClassName DcClient
 * @Description: TODO
 * @create 2018-10-23 8:51
 */
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
