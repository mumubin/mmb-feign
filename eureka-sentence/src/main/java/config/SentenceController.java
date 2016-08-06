package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by mmb on 2016/8/3.
 */
@RestController
public class SentenceController {

    @Autowired
    private NounClient nounClient;
    @RequestMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return
                "<h3>造句:</h3><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>" +
                        buildSentence() + "<br/><br/>"
                ;
    }
    public String buildSentence() {
        String sentence = "There was a problem assembling the sentence!";
        try{
            sentence =  nounClient.getWord();
        } catch ( Exception e ) {
            System.out.println(e);
        }
        return sentence;
    }

}
