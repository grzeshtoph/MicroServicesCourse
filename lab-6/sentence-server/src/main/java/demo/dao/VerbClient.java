package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("VERB")
public interface VerbClient extends WordClient {
}
