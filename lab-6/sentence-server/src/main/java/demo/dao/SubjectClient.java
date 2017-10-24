package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("SUBJECT")
public interface SubjectClient extends WordClient {
}
