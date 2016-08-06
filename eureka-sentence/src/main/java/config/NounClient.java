package config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mmb on 2016/8/6.
 */
@FeignClient("noun")
public interface NounClient {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String getWord();
}
