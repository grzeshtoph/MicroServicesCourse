package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("NOUN")
public interface NounClient extends WordClient{
}
