package com.wlater.urlshortner.repository;

import com.wlater.urlshortner.entity.Urls;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Urls, String> { 

}
