package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ARTICLE")
public interface ArticleClient extends WordClient {
}
