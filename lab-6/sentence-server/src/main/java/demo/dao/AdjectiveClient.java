package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ADJECTIVE")
public interface AdjectiveClient extends WordClient {
}
